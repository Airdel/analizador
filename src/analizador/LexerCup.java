/* The following code was generated by JFlex 1.4.3 on 19/06/21 23:34 */

package analizador;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 19/06/21 23:34 from the specification file
 * <tt>C:/analizador/src/analizador/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9, 11,  0,  0,  9,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     9,  5,  0,  0,  0, 20,  5, 10, 33, 34, 20,  2,  0,  3,  7, 20, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 31, 32, 19, 17, 18,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  5,  6, 
     0, 15, 12, 21, 22,  8, 27,  4,  4, 25,  4,  4, 14, 26, 16, 13, 
    29,  4, 23, 28, 24,  4, 30,  4,  4,  4,  4,  0,  5,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\1\1\4"+
    "\1\6\1\1\1\4\1\7\2\10\1\11\10\4\1\12"+
    "\1\13\1\14\1\15\2\0\1\6\1\4\1\16\1\4"+
    "\1\0\1\4\1\0\1\17\1\4\1\10\7\4\1\20"+
    "\2\4\1\21\12\4\1\22\23\4\1\23\5\4\1\24"+
    "\4\4\1\25\1\4\1\26\12\4\1\27\1\30\5\4"+
    "\1\31\1\4\1\32\5\4\1\33\1\34\5\4\1\35"+
    "\52\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\106\0\151\0\214\0\43\0\257"+
    "\0\322\0\365\0\u0118\0\u013b\0\u015e\0\u015e\0\u0181\0\43"+
    "\0\u01a4\0\u01c7\0\u01ea\0\u020d\0\u0230\0\u0253\0\u0276\0\u0299"+
    "\0\43\0\43\0\43\0\43\0\257\0\u02bc\0\u02df\0\u0302"+
    "\0\u0325\0\u0348\0\u036b\0\u038e\0\u0118\0\43\0\u03b1\0\43"+
    "\0\u03d4\0\u03f7\0\u041a\0\u043d\0\u0460\0\u0483\0\u04a6\0\u0302"+
    "\0\u04c9\0\u04ec\0\u036b\0\u050f\0\u0532\0\u0555\0\u0578\0\u059b"+
    "\0\u05be\0\u05e1\0\u0604\0\u0627\0\u064a\0\u050f\0\u066d\0\u0690"+
    "\0\u06b3\0\u06d6\0\u06f9\0\u071c\0\u073f\0\u0762\0\u0785\0\u07a8"+
    "\0\u07cb\0\u07ee\0\u0811\0\u0834\0\u0857\0\u087a\0\u089d\0\u08c0"+
    "\0\u08e3\0\u087a\0\u0906\0\u0929\0\u094c\0\u096f\0\u0992\0\u087a"+
    "\0\u09b5\0\u09d8\0\u09fb\0\u0a1e\0\u09fb\0\u0a41\0\u09fb\0\u0a64"+
    "\0\u0a87\0\u0aaa\0\u0acd\0\u0af0\0\u0b13\0\u0b36\0\u0b59\0\u0b7c"+
    "\0\u0b9f\0\u0b36\0\u0b36\0\u0bc2\0\u0be5\0\u0c08\0\u0c2b\0\u0c4e"+
    "\0\u0c2b\0\u0c71\0\u0c2b\0\u0c94\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20"+
    "\0\u0cda\0\u0cda\0\u0d43\0\u0d66\0\u0d89\0\u0dac\0\u0dcf\0\u0dac"+
    "\0\u0df2\0\u0e15\0\u0e38\0\u0e5b\0\u0e7e\0\u0ea1\0\u0ec4\0\u0ee7"+
    "\0\u0f0a\0\u0f2d\0\u0f50\0\u0f73\0\u0f96\0\u0fb9\0\u0fdc\0\u0fff"+
    "\0\u1022\0\u1045\0\u1068\0\u108b\0\u10ae\0\u10d1\0\u10f4\0\u1117"+
    "\0\u113a\0\u115d\0\u1180\0\u11a3\0\u11c6\0\u11e9\0\u120c\0\u122f"+
    "\0\u1252\0\u1275\0\u1298\0\u12bb\0\u12de\0\u1301\0\u1324\0\u1347"+
    "\0\43\0\u036b";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\12\1\13\1\12\1\14\4\6\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\2\6\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\44\0"+
    "\1\3\5\0\1\35\1\36\33\0\1\3\1\0\1\37"+
    "\3\0\1\35\1\36\33\0\1\40\2\0\1\40\1\0"+
    "\1\40\1\0\1\40\3\0\5\40\4\0\12\40\5\0"+
    "\1\41\42\0\1\42\2\43\1\40\1\0\1\40\1\0"+
    "\1\40\3\0\4\40\1\44\4\0\12\40\15\0\1\12"+
    "\1\0\1\12\27\0\12\45\1\46\30\45\1\0\1\40"+
    "\2\0\1\40\1\0\1\40\1\0\1\40\3\0\1\40"+
    "\1\47\3\40\4\0\12\40\25\0\1\50\42\0\2\50"+
    "\21\0\1\40\2\0\1\40\1\0\1\40\1\0\1\40"+
    "\3\0\1\40\1\51\1\40\1\52\1\40\4\0\12\40"+
    "\5\0\1\40\2\0\1\40\1\0\1\40\1\0\1\53"+
    "\3\0\5\40\4\0\12\40\5\0\1\40\2\0\1\40"+
    "\1\0\1\40\1\0\1\40\3\0\4\40\1\54\4\0"+
    "\12\40\5\0\1\40\2\0\1\40\1\0\1\40\1\0"+
    "\1\40\3\0\5\40\4\0\4\40\1\55\5\40\5\0"+
    "\1\40\2\0\1\40\1\0\1\40\1\0\1\40\3\0"+
    "\3\40\1\56\1\40\4\0\4\40\1\57\5\40\5\0"+
    "\1\40\2\0\1\40\1\0\1\40\1\0\1\40\3\0"+
    "\5\40\4\0\4\40\1\60\5\40\5\0\1\40\2\0"+
    "\1\40\1\0\1\40\1\0\1\40\3\0\5\40\4\0"+
    "\2\40\1\61\7\40\5\0\1\40\2\0\1\40\1\0"+
    "\1\40\1\0\1\62\3\0\5\40\4\0\12\40\5\0"+
    "\1\63\2\43\37\0\13\37\1\0\27\37\1\0\1\64"+
    "\2\0\1\64\1\0\1\64\1\0\1\64\3\0\5\64"+
    "\4\0\12\64\5\0\1\41\6\0\1\36\33\0\1\65"+
    "\2\0\1\64\1\0\1\64\1\0\1\64\3\0\5\64"+
    "\4\0\12\64\5\0\1\63\42\0\1\64\2\0\1\64"+
    "\1\0\1\64\1\0\1\64\3\0\5\64\4\0\3\64"+
    "\1\66\6\64\5\0\1\64\2\0\1\64\1\0\1\64"+
    "\1\0\1\64\3\0\1\64\1\67\3\64\4\0\12\64"+
    "\5\0\1\64\2\0\1\64\1\0\1\64\1\0\1\64"+
    "\3\0\5\64\4\0\2\64\1\70\7\64\5\0\1\64"+
    "\2\0\1\64\1\0\1\64\1\0\1\64\3\0\5\64"+
    "\4\0\1\64\1\71\10\64\5\0\1\64\2\0\1\64"+
    "\1\0\1\64\1\0\1\64\3\0\5\64\4\0\1\72"+
    "\11\64\5\0\1\64\2\0\1\64\1\0\1\64\1\0"+
    "\1\64\3\0\5\64\4\0\4\64\1\73\5\64\5\0"+
    "\1\64\2\0\1\64\1\0\1\64\1\0\1\74\3\0"+
    "\5\64\4\0\12\64\5\0\1\64\2\0\1\64\1\0"+
    "\1\64\1\0\1\64\3\0\2\64\1\75\2\64\4\0"+
    "\12\64\5\0\1\64\2\0\1\64\1\0\1\64\1\0"+
    "\1\64\3\0\4\64\1\76\4\0\12\64\5\0\1\64"+
    "\2\0\1\64\1\0\1\64\1\0\1\64\3\0\5\64"+
    "\4\0\4\64\1\77\5\64\5\0\1\64\2\0\1\64"+
    "\1\0\1\64\1\0\1\64\3\0\5\64\4\0\2\64"+
    "\1\100\7\64\5\0\1\101\2\0\1\101\1\0\1\101"+
    "\1\0\1\101\3\0\5\101\4\0\12\101\5\0\1\102"+
    "\2\0\1\101\1\0\1\101\1\0\1\101\3\0\5\101"+
    "\4\0\12\101\5\0\1\101\2\0\1\101\1\0\1\101"+
    "\1\0\1\103\3\0\5\101\4\0\12\101\5\0\1\101"+
    "\2\0\1\101\1\0\1\101\1\0\1\101\3\0\2\101"+
    "\1\104\2\101\4\0\12\101\5\0\1\101\2\0\1\101"+
    "\1\0\1\101\1\0\1\101\3\0\5\101\4\0\3\101"+
    "\1\105\6\101\5\0\1\101\2\0\1\101\1\0\1\101"+
    "\1\0\1\106\3\0\5\101\4\0\12\101\5\0\1\101"+
    "\2\0\1\101\1\0\1\101\1\0\1\101\3\0\2\101"+
    "\1\107\2\101\4\0\4\101\1\110\5\101\5\0\1\101"+
    "\2\0\1\101\1\0\1\101\1\0\1\101\3\0\5\101"+
    "\4\0\1\111\11\101\5\0\1\101\2\0\1\101\1\0"+
    "\1\101\1\0\1\101\3\0\4\101\1\112\4\0\12\101"+
    "\5\0\1\101\2\0\1\101\1\0\1\101\1\0\1\101"+
    "\3\0\5\101\4\0\7\101\1\113\2\101\5\0\1\101"+
    "\2\0\1\101\1\0\1\101\1\0\1\101\3\0\4\101"+
    "\1\114\4\0\12\101\5\0\1\101\2\0\1\101\1\0"+
    "\1\101\1\0\1\101\3\0\5\101\4\0\1\101\1\115"+
    "\10\101\5\0\1\116\2\0\1\116\1\0\1\116\1\0"+
    "\1\116\3\0\5\116\4\0\12\116\5\0\1\117\2\0"+
    "\1\116\1\0\1\116\1\0\1\116\3\0\5\116\4\0"+
    "\12\116\5\0\1\116\2\0\1\116\1\0\1\116\1\0"+
    "\1\116\3\0\5\116\4\0\2\116\1\120\7\116\5\0"+
    "\1\116\2\0\1\116\1\0\1\116\1\0\1\121\3\0"+
    "\5\116\4\0\12\116\5\0\1\116\2\0\1\116\1\0"+
    "\1\116\1\0\1\116\3\0\1\116\1\122\3\116\4\0"+
    "\12\116\5\0\1\116\2\0\1\116\1\0\1\116\1\0"+
    "\1\116\3\0\4\116\1\123\4\0\12\116\5\0\1\116"+
    "\2\0\1\116\1\0\1\116\1\0\1\116\3\0\3\116"+
    "\1\124\1\116\4\0\12\116\5\0\1\116\2\0\1\116"+
    "\1\0\1\116\1\0\1\116\3\0\5\116\4\0\5\116"+
    "\1\125\4\116\5\0\1\116\2\0\1\116\1\0\1\116"+
    "\1\0\1\116\3\0\5\116\4\0\4\116\1\126\5\116"+
    "\5\0\1\116\2\0\1\116\1\0\1\116\1\0\1\116"+
    "\3\0\5\116\4\0\3\116\1\127\6\116\5\0\1\116"+
    "\2\0\1\116\1\0\1\116\1\0\1\116\3\0\1\116"+
    "\1\130\3\116\4\0\12\116\5\0\1\116\2\0\1\116"+
    "\1\0\1\116\1\0\1\116\3\0\5\116\4\0\1\131"+
    "\11\116\5\0\1\116\2\0\1\116\1\0\1\116\1\0"+
    "\1\116\3\0\3\116\1\132\1\116\4\0\12\116\5\0"+
    "\1\133\2\0\1\133\1\0\1\133\1\0\1\133\3\0"+
    "\5\133\4\0\12\133\5\0\1\134\2\0\1\133\1\0"+
    "\1\133\1\0\1\133\3\0\5\133\4\0\12\133\5\0"+
    "\1\133\2\0\1\133\1\0\1\133\1\0\1\133\3\0"+
    "\1\133\1\135\3\133\4\0\12\133\5\0\1\133\2\0"+
    "\1\133\1\0\1\133\1\0\1\133\3\0\3\133\1\136"+
    "\1\133\4\0\12\133\5\0\1\133\2\0\1\133\1\0"+
    "\1\133\1\0\1\133\3\0\3\133\1\137\1\133\4\0"+
    "\12\133\5\0\1\133\2\0\1\133\1\0\1\133\1\0"+
    "\1\133\3\0\5\133\4\0\2\133\1\140\7\133\5\0"+
    "\1\133\2\0\1\133\1\0\1\133\1\0\1\133\3\0"+
    "\3\133\1\141\1\133\4\0\12\133\5\0\1\133\2\0"+
    "\1\133\1\0\1\133\1\0\1\133\3\0\3\133\1\142"+
    "\1\133\4\0\12\133\5\0\1\133\2\0\1\133\1\0"+
    "\1\133\1\0\1\133\3\0\5\133\4\0\2\133\1\143"+
    "\7\133\5\0\1\133\2\0\1\133\1\0\1\133\1\0"+
    "\1\133\3\0\5\133\4\0\4\133\1\144\5\133\5\0"+
    "\1\133\2\0\1\133\1\0\1\133\1\0\1\133\3\0"+
    "\5\133\4\0\1\133\1\145\10\133\5\0\1\146\2\0"+
    "\1\146\1\0\1\146\1\0\1\146\3\0\5\146\4\0"+
    "\12\146\5\0\1\147\2\0\1\146\1\0\1\146\1\0"+
    "\1\146\3\0\5\146\4\0\12\146\5\0\1\146\2\0"+
    "\1\146\1\0\1\146\1\0\1\146\3\0\4\146\1\150"+
    "\4\0\12\146\5\0\1\146\2\0\1\146\1\0\1\146"+
    "\1\0\1\146\3\0\3\146\1\151\1\146\4\0\12\146"+
    "\5\0\1\146\2\0\1\146\1\0\1\146\1\0\1\146"+
    "\3\0\2\146\1\152\2\146\4\0\12\146\5\0\1\146"+
    "\2\0\1\146\1\0\1\146\1\0\1\146\3\0\5\146"+
    "\4\0\2\146\1\153\7\146\5\0\1\146\2\0\1\146"+
    "\1\0\1\146\1\0\1\146\3\0\3\146\1\154\1\146"+
    "\4\0\12\146\5\0\1\146\2\0\1\146\1\0\1\146"+
    "\1\0\1\146\3\0\5\146\4\0\10\146\1\155\1\146"+
    "\5\0\1\146\2\0\1\146\1\0\1\146\1\0\1\156"+
    "\3\0\5\146\4\0\12\146\5\0\1\157\2\0\1\157"+
    "\1\0\1\157\1\0\1\157\3\0\5\157\4\0\12\157"+
    "\5\0\1\160\2\0\1\157\1\0\1\157\1\0\1\157"+
    "\3\0\5\157\4\0\12\157\5\0\1\157\2\0\1\157"+
    "\1\0\1\157\1\0\1\157\3\0\1\157\1\161\3\157"+
    "\4\0\12\157\5\0\1\157\2\0\1\157\1\0\1\157"+
    "\1\0\1\157\3\0\5\157\4\0\1\162\11\157\5\0"+
    "\1\157\2\0\1\157\1\0\1\157\1\0\1\157\3\0"+
    "\5\157\4\0\7\157\1\163\2\157\5\0\1\157\2\0"+
    "\1\157\1\0\1\157\1\0\1\157\3\0\3\157\1\164"+
    "\1\157\4\0\12\157\5\0\1\157\2\0\1\157\1\0"+
    "\1\157\1\0\1\157\3\0\5\157\4\0\2\157\1\165"+
    "\7\157\5\0\1\166\2\0\1\166\1\0\1\166\1\0"+
    "\1\166\3\0\5\166\4\0\12\166\5\0\1\167\2\0"+
    "\1\166\1\0\1\166\1\0\1\166\3\0\5\166\4\0"+
    "\12\166\5\0\1\166\2\0\1\166\1\0\1\166\1\0"+
    "\1\166\3\0\5\166\4\0\4\166\1\170\5\166\5\0"+
    "\1\166\2\0\1\166\1\0\1\166\1\0\1\166\3\0"+
    "\2\166\1\171\2\166\4\0\12\166\5\0\1\166\2\0"+
    "\1\166\1\0\1\166\1\0\1\166\3\0\1\166\1\172"+
    "\3\166\4\0\12\166\5\0\1\173\2\0\1\173\1\0"+
    "\1\173\1\0\1\173\3\0\5\173\4\0\12\173\5\0"+
    "\1\174\2\0\1\173\1\0\1\173\1\0\1\173\3\0"+
    "\5\173\4\0\12\173\5\0\1\173\2\0\1\173\1\0"+
    "\1\173\1\0\1\173\3\0\1\173\1\175\3\173\4\0"+
    "\12\173\5\0\1\176\2\0\1\176\1\0\1\176\1\0"+
    "\1\176\3\0\5\176\4\0\12\176\5\0\1\177\2\0"+
    "\1\176\1\0\1\176\1\0\1\176\3\0\5\176\4\0"+
    "\12\176\5\0\1\176\2\0\1\176\1\0\1\176\1\0"+
    "\1\176\3\0\4\176\1\200\4\0\12\176\5\0\1\201"+
    "\2\0\1\201\1\0\1\201\1\0\1\201\3\0\5\201"+
    "\4\0\12\201\5\0\1\202\2\0\1\201\1\0\1\201"+
    "\1\0\1\201\3\0\5\201\4\0\12\201\5\0\1\203"+
    "\2\0\1\203\1\0\1\203\1\0\1\203\3\0\5\203"+
    "\4\0\12\203\5\0\1\204\2\0\1\203\1\0\1\203"+
    "\1\0\1\203\3\0\5\203\4\0\12\203\5\0\1\205"+
    "\2\0\1\205\1\0\1\205\1\0\1\205\3\0\5\205"+
    "\4\0\12\205\5\0\1\206\2\0\1\205\1\0\1\205"+
    "\1\0\1\205\3\0\5\205\4\0\12\205\5\0\1\207"+
    "\2\0\1\207\1\0\1\207\1\0\1\207\3\0\5\207"+
    "\4\0\12\207\5\0\1\210\2\0\1\207\1\0\1\207"+
    "\1\0\1\207\3\0\5\207\4\0\12\207\5\0\1\211"+
    "\2\0\1\211\1\0\1\211\1\0\1\211\3\0\5\211"+
    "\4\0\12\211\5\0\1\212\2\0\1\211\1\0\1\211"+
    "\1\0\1\211\3\0\5\211\4\0\12\211\5\0\1\213"+
    "\2\0\1\213\1\0\1\213\1\0\1\213\3\0\5\213"+
    "\4\0\12\213\5\0\1\214\2\0\1\213\1\0\1\213"+
    "\1\0\1\213\3\0\5\213\4\0\12\213\5\0\1\215"+
    "\2\0\1\215\1\0\1\215\1\0\1\215\3\0\5\215"+
    "\4\0\12\215\5\0\1\216\2\0\1\215\1\0\1\215"+
    "\1\0\1\215\3\0\5\215\4\0\12\215\5\0\1\217"+
    "\2\0\1\217\1\0\1\217\1\0\1\217\3\0\5\217"+
    "\4\0\12\217\5\0\1\220\2\0\1\217\1\0\1\217"+
    "\1\0\1\217\3\0\5\217\4\0\12\217\5\0\1\221"+
    "\2\0\1\221\1\0\1\221\1\0\1\221\3\0\5\221"+
    "\4\0\12\221\5\0\1\222\2\0\1\221\1\0\1\221"+
    "\1\0\1\221\3\0\5\221\4\0\12\221\5\0\1\223"+
    "\2\0\1\223\1\0\1\223\1\0\1\223\3\0\5\223"+
    "\4\0\12\223\5\0\1\224\2\0\1\223\1\0\1\223"+
    "\1\0\1\223\3\0\5\223\4\0\12\223\5\0\1\225"+
    "\2\0\1\225\1\0\1\225\1\0\1\225\3\0\5\225"+
    "\4\0\12\225\5\0\1\226\2\0\1\225\1\0\1\225"+
    "\1\0\1\225\3\0\5\225\4\0\12\225\5\0\1\227"+
    "\2\0\1\227\1\0\1\227\1\0\1\227\3\0\5\227"+
    "\4\0\12\227\5\0\1\230\2\0\1\227\1\0\1\227"+
    "\1\0\1\227\3\0\5\227\4\0\12\227\5\0\1\231"+
    "\2\0\1\231\1\0\1\231\1\0\1\231\3\0\5\231"+
    "\4\0\12\231\5\0\1\232\2\0\1\231\1\0\1\231"+
    "\1\0\1\231\3\0\5\231\4\0\12\231\5\0\1\233"+
    "\2\0\1\233\1\0\1\233\1\0\1\233\3\0\5\233"+
    "\4\0\12\233\5\0\1\234\2\0\1\233\1\0\1\233"+
    "\1\0\1\233\3\0\5\233\4\0\12\233\5\0\1\235"+
    "\2\0\1\235\1\0\1\235\1\0\1\235\3\0\5\235"+
    "\4\0\12\235\5\0\1\236\2\0\1\235\1\0\1\235"+
    "\1\0\1\235\3\0\5\235\4\0\12\235\5\0\1\237"+
    "\2\0\1\237\1\0\1\237\1\0\1\237\3\0\5\237"+
    "\4\0\12\237\5\0\1\240\2\0\1\237\1\0\1\237"+
    "\1\0\1\237\3\0\5\237\4\0\12\237\5\0\1\241"+
    "\2\0\1\241\1\0\1\241\1\0\1\241\3\0\5\241"+
    "\4\0\12\241\5\0\1\242\2\0\1\241\1\0\1\241"+
    "\1\0\1\241\3\0\5\241\4\0\12\241\5\0\1\243"+
    "\2\0\1\243\1\0\1\243\1\0\1\243\3\0\5\243"+
    "\4\0\12\243\5\0\1\244\2\0\1\243\1\0\1\243"+
    "\1\0\1\243\3\0\5\243\4\0\12\243\5\0\1\245"+
    "\2\0\1\245\1\0\1\245\1\0\1\245\3\0\5\245"+
    "\4\0\12\245\5\0\1\246\2\0\1\245\1\0\1\245"+
    "\1\0\1\245\3\0\5\245\4\0\12\245\5\0\1\247"+
    "\2\0\1\247\1\0\1\247\1\0\1\247\3\0\5\247"+
    "\4\0\12\247\5\0\1\250\2\0\1\247\1\0\1\247"+
    "\1\0\1\247\3\0\5\247\4\0\12\247\5\0\1\251"+
    "\2\0\1\251\1\0\1\251\1\0\1\251\3\0\5\251"+
    "\4\0\12\251\5\0\1\252\2\0\1\251\1\0\1\251"+
    "\1\0\1\251\3\0\5\251\4\0\12\251\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4970];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\10\1\1\11\10\1\4\11"+
    "\2\0\4\1\1\0\1\1\1\0\1\11\1\1\1\11"+
    "\200\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    modelos.InformacionLexemaS c = new modelos.InformacionLexemaS();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return new Symbol(sym.RESERVADA_CORTO,   yychar, yyline, yytext());
          }
        case 30: break;
        case 9: 
          { return new Symbol(sym.OP_ARITMETICO2,  yychar, yyline, yytext());
          }
        case 31: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 32: break;
        case 20: 
          { return new Symbol(sym.RESERVADA_FALSO, yychar, yyline, yytext());
          }
        case 33: break;
        case 15: 
          { return new Symbol(sym.CADENA_TEXTO,      yychar, yyline, yytext());
          }
        case 34: break;
        case 23: 
          { return new Symbol(sym.RESERVADA_DECIMAL, yychar, yyline, yytext());
          }
        case 35: break;
        case 8: 
          { return new Symbol(sym.OP_RELACIONAL,     yychar, yyline, yytext());
          }
        case 36: break;
        case 18: 
          { return new Symbol(sym.RESERVADA_FIN,     yychar, yyline, yytext());
          }
        case 37: break;
        case 12: 
          { return new Symbol(sym.PARENTESIS_IZQ, yychar, yyline, yytext());
          }
        case 38: break;
        case 14: 
          { return new Symbol(sym.NUMERO_DECIMAL, yychar, yyline, yytext());
          }
        case 39: break;
        case 16: 
          { return new Symbol(sym.RESERVADA_SI,     yychar, yyline, yytext());
          }
        case 40: break;
        case 13: 
          { return new Symbol(sym.PARENTESIS_DER, yychar, yyline, yytext());
          }
        case 41: break;
        case 27: 
          { return new Symbol(sym.RESERVADA_PRINCIPAL, yychar, yyline, yytext());
          }
        case 42: break;
        case 29: 
          { return new Symbol(sym.RESERVADA_DECLARACION, yychar, yyline, yytext());
          }
        case 43: break;
        case 2: 
          { return new Symbol(sym.NUMERO,            yychar, yyline, yytext());
          }
        case 44: break;
        case 25: 
          { return new Symbol(sym.RESERVADA_BOOLEANO, yychar, yyline, yytext());
          }
        case 45: break;
        case 26: 
          { return new Symbol(sym.RESERVADA_MIENTRAS,     yychar, yyline, yytext());
          }
        case 46: break;
        case 4: 
          { return new Symbol(sym.IDENTIFICADOR,     yychar, yyline, yytext());
          }
        case 47: break;
        case 24: 
          { return new Symbol(sym.RESERVADA_INICIAR, yychar, yyline, yytext());
          }
        case 48: break;
        case 7: 
          { return new Symbol(sym.ASIGNACION,         yychar, yyline, yytext());
          }
        case 49: break;
        case 11: 
          { return new Symbol(sym.PUNTO_COMA,        yychar, yyline, yytext());
          }
        case 50: break;
        case 3: 
          { return new Symbol(sym.OP_ARITMETICO1,  yychar, yyline, yytext());
          }
        case 51: break;
        case 5: 
          { return new Symbol(sym.OP_LOGICO,         yychar, yyline, yytext());
          }
        case 52: break;
        case 22: 
          { return new Symbol(sym.RESERVADA_CADENA,  yychar, yyline, yytext());
          }
        case 53: break;
        case 10: 
          { return new Symbol(sym.DOS_PUNTOS,        yychar, yyline, yytext());
          }
        case 54: break;
        case 6: 
          { /*Ignore*/
          }
        case 55: break;
        case 28: 
          { return new Symbol(sym.RESERVADA_VERDADERO, yychar, yyline, yytext());
          }
        case 56: break;
        case 21: 
          { return new Symbol(sym.RESERVADA_ENTERO,  yychar, yyline, yytext());
          }
        case 57: break;
        case 17: 
          { return new Symbol(sym.NUMERO_EXPONENTE, yychar, yyline, yytext());
          }
        case 58: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
