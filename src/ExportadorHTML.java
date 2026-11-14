public class ExportadorHTML implements Exportable{
    @Override
    public void exportar(String contenidoReporte) {

        System.out.println("===== REPORTE HTML =====");
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Reporte Financiero</h1>");
        System.out.println("<p>" + contenidoReporte + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");

    }
}
