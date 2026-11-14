public class MotorReportes {
    private Exportable[] exportadores;

    public MotorReportes(Exportable[] exportadores) {
        this.exportadores = exportadores;
    }

    public void generarReportes(String contenidoReporte) {

        for (Exportable exportador : exportadores) {

            exportador.exportar(contenidoReporte);

            System.out.println("----------------------");

        }
    }
}
