package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;

class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    // Constructor
    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // calculo de edad
    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    // determinar signo del zodiaco
    public String SignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 22)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    // Método para determinar la estación del año
    public String determinarEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

        switch (mes) {
            case 1:
            case 2:
                return "Verano";
            case 3:
                return fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21 ? "Verano" : "Otoño";
            case 4:
            case 5:
                return "Otoño";
            case 6:
                return fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21 ? "Otoño" : "Invierno";
            case 7:
            case 8:
                return "Invierno";
            case 9:
                return fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21 ? "Invierno" : "Primavera";
            case 10:
            case 11:
                return "Primavera";
            default:
                return fechaNacimiento.get(Calendar.DAY_OF_MONTH) < 21 ? "Primavera" : "Verano";
        }
    }

    // obtener nombre
    public String getNombre() {
        return nombre;
    }

    // obtener fecha de nacimiento
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
}

