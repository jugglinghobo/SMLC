/* Generated By:JavaCC: Do not edit this line. SMLCConstants.java */
package smlc;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SMLCConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int OPAR = 2;
  /** RegularExpression Id. */
  int CPAR = 3;
  /** RegularExpression Id. */
  int PLUS = 4;
  /** RegularExpression Id. */
  int MINUS = 5;
  /** RegularExpression Id. */
  int MULT = 6;
  /** RegularExpression Id. */
  int DIV = 7;
  /** RegularExpression Id. */
  int POWER = 8;
  /** RegularExpression Id. */
  int NUMBER = 9;
  /** RegularExpression Id. */
  int REAL = 10;
  /** RegularExpression Id. */
  int INTEGER = 11;
  /** RegularExpression Id. */
  int DIGITS = 12;
  /** RegularExpression Id. */
  int EOL = 13;
  /** RegularExpression Id. */
  int HELP = 14;
  /** RegularExpression Id. */
  int QUIT = 15;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"(\"",
    "\")\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^\"",
    "<NUMBER>",
    "<REAL>",
    "<INTEGER>",
    "<DIGITS>",
    "<EOL>",
    "\"h\"",
    "<QUIT>",
  };

}
