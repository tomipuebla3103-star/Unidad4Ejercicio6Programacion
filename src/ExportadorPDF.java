public class ExportadorPDF implements Exportable{
    @Override
    public void exportar(String contenidoReporte) {

        System.out.println("===== REPORTE PDF =====");
        System.out.println("[PDF]");
        System.out.println(contenidoReporte);
        System.out.println("Fin del archivo PDF.");

    }
}
