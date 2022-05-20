package aplicacion;

import dominio.ASCIIArtGenerator;
public class Principal {

    public static void main(String[] args) throws Exception {

            ASCIIArtGenerator artGen = new ASCIIArtGenerator();

            System.out.println();
            artGen.printTextArt("JESUS ES MARICON", ASCIIArtGenerator.ART_SIZE_MEDIUM);
            System.out.println();

            /*System.out.println();
            artGen.printTextArt("Love is life!", ASCIIArtGenerator.ART_SIZE_SMALL, ASCIIArtGenerator.ASCIIArtFont.ART_FONT_MONO,"@");
            System.out.println();*/

        }
}



            

   
