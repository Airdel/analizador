/* The following code was generated by JFlex 1.4.3 on 21/06/21 10:01 */

package analizador;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21/06/21 10:01 from the specification file
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
     9,  5,  0,  0,  0, 20,  5, 10, 40, 41, 20,  2, 21,  3,  7, 20, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 38, 39, 19, 17, 18,  0, 
    32,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  5,  6, 
     0, 15, 12, 22, 23,  8, 28, 33,  4, 26, 35,  4, 14, 27, 16, 13, 
    30, 37, 24, 29, 25, 34, 31,  4,  4,  4, 36,  0,  5,  0,  0,  0, 
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
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\5\1\7\1\1\3\5\1\10\2\11\1\12\1\13"+
    "\10\5\1\1\1\14\1\15\1\16\1\17\2\0\1\7"+
    "\1\5\1\20\1\5\1\0\1\5\1\0\1\21\2\5"+
    "\1\22\1\11\7\5\1\23\2\5\13\0\1\24\13\5"+
    "\1\25\2\5\23\0\16\5\25\0\5\5\1\26\5\5"+
    "\1\27\2\5\1\0\1\30\12\0\1\31\6\0\2\5"+
    "\1\32\1\5\1\33\1\34\6\5\1\0\1\35\12\0"+
    "\1\36\1\37\4\5\1\40\1\41\3\5\5\0\2\5"+
    "\1\42\1\5\1\43\2\5\3\0\3\5\1\44\1\45"+
    "\1\0\3\5\1\0\2\5\1\46\1\0\2\5\1\47"+
    "\50\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[276];
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
    "\0\0\0\52\0\124\0\124\0\176\0\250\0\52\0\322"+
    "\0\374\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u01f8"+
    "\0\u0222\0\52\0\52\0\u024c\0\u0276\0\u02a0\0\u02ca\0\u02f4"+
    "\0\u031e\0\u0348\0\u0372\0\u039c\0\52\0\52\0\52\0\52"+
    "\0\322\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2"+
    "\0\u0150\0\52\0\u04ec\0\u0516\0\u041a\0\52\0\u0540\0\u056a"+
    "\0\u0594\0\u05be\0\u05e8\0\u0612\0\u063c\0\u041a\0\u0666\0\u0690"+
    "\0\u06ba\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0"+
    "\0\u080a\0\u0834\0\u085e\0\u0498\0\u0888\0\u08b2\0\u08dc\0\u0906"+
    "\0\u0930\0\u095a\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0888"+
    "\0\u0a56\0\u0a80\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c"+
    "\0\u0ba6\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc"+
    "\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c"+
    "\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42\0\u0f6c"+
    "\0\u0f96\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\u1068\0\u1092\0\u10bc"+
    "\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\u11b8\0\u11e2\0\u120c"+
    "\0\u1236\0\u1260\0\u128a\0\u12b4\0\u12de\0\u1308\0\u1332\0\u135c"+
    "\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e\0\u1386\0\u1458\0\u1482"+
    "\0\u14ac\0\u14d6\0\u1500\0\u1386\0\u152a\0\u1554\0\u157e\0\52"+
    "\0\u15a8\0\u15d2\0\u15fc\0\u1626\0\u1650\0\u167a\0\u16a4\0\u16ce"+
    "\0\u16f8\0\u1722\0\52\0\u174c\0\u1776\0\u17a0\0\u17ca\0\u17f4"+
    "\0\u181e\0\u1848\0\u1872\0\u1848\0\u189c\0\u1848\0\u1848\0\u18c6"+
    "\0\u18f0\0\u191a\0\u1944\0\u196e\0\u1998\0\u19c2\0\52\0\u19ec"+
    "\0\u1a16\0\u1a40\0\u1a6a\0\u1a94\0\u1abe\0\u1ae8\0\u1b12\0\u1b3c"+
    "\0\u1b66\0\52\0\52\0\u1b90\0\u1bba\0\u1be4\0\u1c0e\0\u1b90"+
    "\0\u1b90\0\u1c38\0\u1c62\0\u1c8c\0\u1cb6\0\u1ce0\0\u1d0a\0\u1d34"+
    "\0\u1d5e\0\u1d88\0\u1db2\0\u1d88\0\u1ddc\0\u1d88\0\u1e06\0\u1e30"+
    "\0\u1e5a\0\u1e84\0\u1eae\0\u1ed8\0\u1f02\0\u1f2c\0\u1ed8\0\u1ed8"+
    "\0\u1f56\0\u1f80\0\u1faa\0\u1fd4\0\u1ffe\0\u2028\0\u2052\0\u2028"+
    "\0\u207c\0\u20a6\0\u20d0\0\52\0\u20fa\0\u2124\0\u214e\0\u2178"+
    "\0\u21a2\0\u21cc\0\u21f6\0\u2220\0\u224a\0\u2274\0\u229e\0\u22c8"+
    "\0\u22f2\0\u231c\0\u2346\0\u2370\0\u239a\0\u23c4\0\u23ee\0\u2418"+
    "\0\u2442\0\u246c\0\u2496\0\u24c0\0\u24ea\0\u2514\0\u253e\0\u2568"+
    "\0\u2592\0\u25bc\0\u25e6\0\u2610\0\u263a\0\u2664\0\u268e\0\u26b8"+
    "\0\u26e2\0\u270c\0\52\0\u0498";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[276];
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
    "\1\11\1\12\1\13\1\12\1\14\1\6\1\15\1\6"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\2\6\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\5\6\1\35\1\36\1\37\1\40\53\0\1\3\5\0"+
    "\1\41\1\42\42\0\1\3\1\0\1\43\3\0\1\41"+
    "\1\42\42\0\1\44\2\0\1\44\1\0\1\44\1\0"+
    "\1\44\3\0\5\44\5\0\12\44\1\0\5\44\5\0"+
    "\1\45\51\0\1\46\2\47\1\44\1\0\1\44\1\0"+
    "\1\44\3\0\4\44\1\50\5\0\12\44\1\0\5\44"+
    "\15\0\1\12\1\0\1\12\36\0\12\51\1\52\37\51"+
    "\1\0\1\44\2\0\1\44\1\0\1\44\1\0\1\44"+
    "\3\0\1\44\1\53\3\44\5\0\12\44\1\0\5\44"+
    "\5\0\1\44\2\0\1\44\1\0\1\44\1\0\1\44"+
    "\3\0\2\44\1\54\2\44\5\0\12\44\1\0\5\44"+
    "\5\0\1\44\2\0\1\44\1\0\1\44\1\0\1\44"+
    "\3\0\1\44\1\55\3\44\5\0\12\44\1\0\5\44"+
    "\25\0\1\56\51\0\2\56\30\0\1\44\2\0\1\44"+
    "\1\0\1\44\1\0\1\44\3\0\1\44\1\57\1\44"+
    "\1\60\1\44\5\0\12\44\1\0\5\44\5\0\1\44"+
    "\2\0\1\44\1\0\1\44\1\0\1\61\3\0\5\44"+
    "\5\0\12\44\1\0\5\44\5\0\1\44\2\0\1\44"+
    "\1\0\1\44\1\0\1\44\3\0\4\44\1\62\5\0"+
    "\12\44\1\0\5\44\5\0\1\44\2\0\1\44\1\0"+
    "\1\44\1\0\1\44\3\0\5\44\5\0\4\44\1\63"+
    "\5\44\1\0\5\44\5\0\1\44\2\0\1\44\1\0"+
    "\1\44\1\0\1\44\3\0\3\44\1\64\1\44\5\0"+
    "\4\44\1\65\5\44\1\0\5\44\5\0\1\44\2\0"+
    "\1\44\1\0\1\44\1\0\1\44\3\0\5\44\5\0"+
    "\4\44\1\66\5\44\1\0\5\44\5\0\1\44\2\0"+
    "\1\44\1\0\1\44\1\0\1\44\3\0\5\44\5\0"+
    "\2\44\1\67\7\44\1\0\5\44\5\0\1\44\2\0"+
    "\1\44\1\0\1\44\1\0\1\70\3\0\5\44\5\0"+
    "\12\44\1\0\5\44\14\0\1\71\5\0\1\72\1\73"+
    "\6\0\1\74\1\75\1\76\1\0\1\77\2\0\1\100"+
    "\1\101\1\102\1\0\1\103\11\0\1\104\2\47\46\0"+
    "\13\43\1\0\36\43\1\0\1\105\2\0\1\105\1\0"+
    "\1\105\1\0\1\105\3\0\5\105\5\0\12\105\1\0"+
    "\5\105\5\0\1\45\6\0\1\42\42\0\1\106\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\5\105\5\0"+
    "\12\105\1\0\5\105\5\0\1\104\51\0\1\105\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\5\105\5\0"+
    "\3\105\1\107\6\105\1\0\5\105\5\0\1\105\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\1\105\1\110"+
    "\3\105\5\0\12\105\1\0\5\105\5\0\1\105\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\3\105\1\111"+
    "\1\105\5\0\12\105\1\0\5\105\5\0\1\105\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\5\105\5\0"+
    "\2\105\1\112\7\105\1\0\5\105\5\0\1\105\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\5\105\5\0"+
    "\1\105\1\113\10\105\1\0\5\105\5\0\1\105\2\0"+
    "\1\105\1\0\1\105\1\0\1\105\3\0\5\105\5\0"+
    "\1\114\11\105\1\0\5\105\5\0\1\105\2\0\1\105"+
    "\1\0\1\105\1\0\1\105\3\0\5\105\5\0\4\105"+
    "\1\115\5\105\1\0\5\105\5\0\1\105\2\0\1\105"+
    "\1\0\1\105\1\0\1\116\3\0\5\105\5\0\12\105"+
    "\1\0\5\105\5\0\1\105\2\0\1\105\1\0\1\105"+
    "\1\0\1\105\3\0\2\105\1\117\2\105\5\0\12\105"+
    "\1\0\5\105\5\0\1\105\2\0\1\105\1\0\1\105"+
    "\1\0\1\105\3\0\4\105\1\120\5\0\12\105\1\0"+
    "\5\105\5\0\1\105\2\0\1\105\1\0\1\105\1\0"+
    "\1\105\3\0\5\105\5\0\4\105\1\121\5\105\1\0"+
    "\5\105\5\0\1\105\2\0\1\105\1\0\1\105\1\0"+
    "\1\105\3\0\5\105\5\0\2\105\1\122\7\105\1\0"+
    "\5\105\24\0\1\123\14\0\1\124\24\0\1\125\55\0"+
    "\1\126\11\0\1\127\1\130\1\131\1\132\4\0\1\133"+
    "\32\0\1\134\42\0\1\135\21\0\1\136\61\0\1\137"+
    "\42\0\1\140\10\0\1\141\15\0\1\142\60\0\1\143"+
    "\64\0\1\144\51\0\1\145\20\0\1\146\2\0\1\146"+
    "\1\0\1\146\1\0\1\146\3\0\5\146\5\0\12\146"+
    "\1\0\5\146\5\0\1\147\2\0\1\146\1\0\1\146"+
    "\1\0\1\146\3\0\5\146\5\0\12\146\1\0\5\146"+
    "\5\0\1\146\2\0\1\146\1\0\1\146\1\0\1\150"+
    "\3\0\5\146\5\0\12\146\1\0\5\146\5\0\1\146"+
    "\2\0\1\146\1\0\1\146\1\0\1\146\3\0\2\146"+
    "\1\151\2\146\5\0\12\146\1\0\5\146\5\0\1\146"+
    "\2\0\1\146\1\0\1\146\1\0\1\146\3\0\5\146"+
    "\5\0\5\146\1\152\4\146\1\0\5\146\5\0\1\146"+
    "\2\0\1\146\1\0\1\146\1\0\1\146\3\0\5\146"+
    "\5\0\3\146\1\153\6\146\1\0\5\146\5\0\1\146"+
    "\2\0\1\146\1\0\1\146\1\0\1\154\3\0\5\146"+
    "\5\0\12\146\1\0\5\146\5\0\1\146\2\0\1\146"+
    "\1\0\1\146\1\0\1\146\3\0\2\146\1\155\2\146"+
    "\5\0\4\146\1\156\5\146\1\0\5\146\5\0\1\146"+
    "\2\0\1\146\1\0\1\146\1\0\1\146\3\0\5\146"+
    "\5\0\1\157\11\146\1\0\5\146\5\0\1\146\2\0"+
    "\1\146\1\0\1\146\1\0\1\146\3\0\4\146\1\160"+
    "\5\0\12\146\1\0\5\146\5\0\1\146\2\0\1\146"+
    "\1\0\1\146\1\0\1\146\3\0\5\146\5\0\7\146"+
    "\1\161\2\146\1\0\5\146\5\0\1\146\2\0\1\146"+
    "\1\0\1\146\1\0\1\146\3\0\4\146\1\162\5\0"+
    "\12\146\1\0\5\146\5\0\1\146\2\0\1\146\1\0"+
    "\1\146\1\0\1\146\3\0\5\146\5\0\1\146\1\163"+
    "\10\146\1\0\5\146\32\0\1\164\61\0\1\165\23\0"+
    "\1\166\60\0\1\167\42\0\1\170\51\0\1\171\71\0"+
    "\1\172\51\0\1\173\40\0\1\174\50\0\1\175\17\0"+
    "\1\176\43\0\1\177\1\200\50\0\1\201\52\0\1\202"+
    "\56\0\1\203\60\0\1\204\45\0\1\205\40\0\1\206"+
    "\50\0\1\207\52\0\1\210\22\0\1\211\2\0\1\211"+
    "\1\0\1\211\1\0\1\211\3\0\5\211\5\0\12\211"+
    "\1\0\5\211\5\0\1\212\2\0\1\211\1\0\1\211"+
    "\1\0\1\211\3\0\5\211\5\0\12\211\1\0\5\211"+
    "\5\0\1\211\2\0\1\211\1\0\1\211\1\0\1\211"+
    "\3\0\5\211\5\0\2\211\1\213\7\211\1\0\5\211"+
    "\5\0\1\211\2\0\1\211\1\0\1\211\1\0\1\214"+
    "\3\0\5\211\5\0\12\211\1\0\5\211\5\0\1\211"+
    "\2\0\1\211\1\0\1\211\1\0\1\211\3\0\3\211"+
    "\1\215\1\211\5\0\12\211\1\0\5\211\5\0\1\211"+
    "\2\0\1\211\1\0\1\211\1\0\1\211\3\0\1\211"+
    "\1\216\3\211\5\0\12\211\1\0\5\211\5\0\1\211"+
    "\2\0\1\211\1\0\1\211\1\0\1\211\3\0\4\211"+
    "\1\217\5\0\12\211\1\0\5\211\5\0\1\211\2\0"+
    "\1\211\1\0\1\211\1\0\1\211\3\0\3\211\1\220"+
    "\1\211\5\0\12\211\1\0\5\211\5\0\1\211\2\0"+
    "\1\211\1\0\1\211\1\0\1\211\3\0\5\211\5\0"+
    "\5\211\1\221\4\211\1\0\5\211\5\0\1\211\2\0"+
    "\1\211\1\0\1\211\1\0\1\211\3\0\5\211\5\0"+
    "\4\211\1\222\5\211\1\0\5\211\5\0\1\211\2\0"+
    "\1\211\1\0\1\211\1\0\1\211\3\0\5\211\5\0"+
    "\3\211\1\223\6\211\1\0\5\211\5\0\1\211\2\0"+
    "\1\211\1\0\1\211\1\0\1\211\3\0\1\211\1\224"+
    "\3\211\5\0\12\211\1\0\5\211\5\0\1\211\2\0"+
    "\1\211\1\0\1\211\1\0\1\211\3\0\5\211\5\0"+
    "\1\225\11\211\1\0\5\211\5\0\1\211\2\0\1\211"+
    "\1\0\1\211\1\0\1\211\3\0\3\211\1\226\1\211"+
    "\5\0\12\211\1\0\5\211\14\0\1\227\51\0\1\145"+
    "\71\0\1\230\64\0\1\231\24\0\1\165\51\0\1\232"+
    "\65\0\1\233\36\0\1\234\73\0\1\235\42\0\1\236"+
    "\50\0\1\237\30\0\1\240\51\0\1\241\51\0\1\242"+
    "\60\0\1\243\62\0\1\244\63\0\1\245\51\0\1\246"+
    "\26\0\1\247\42\0\1\250\60\0\1\251\33\0\1\252"+
    "\2\0\1\252\1\0\1\252\1\0\1\252\3\0\5\252"+
    "\5\0\12\252\1\0\5\252\5\0\1\253\2\0\1\252"+
    "\1\0\1\252\1\0\1\252\3\0\5\252\5\0\12\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\1\252\1\254\3\252\5\0\12\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\3\252\1\255\1\252\5\0\12\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\5\252\5\0\2\252\1\256\7\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\3\252\1\257\1\252\5\0\12\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\5\252\5\0\2\252\1\260\7\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\3\252\1\261\1\252\5\0\12\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\3\252\1\262\1\252\5\0\12\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\5\252\5\0\2\252\1\263\7\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\5\252\5\0\4\252\1\264\5\252"+
    "\1\0\5\252\5\0\1\252\2\0\1\252\1\0\1\252"+
    "\1\0\1\252\3\0\5\252\5\0\1\252\1\265\10\252"+
    "\1\0\5\252\24\0\1\266\46\0\1\267\53\0\1\270"+
    "\46\0\1\271\72\0\1\267\33\0\1\272\46\0\1\273"+
    "\77\0\1\274\35\0\1\275\43\0\1\276\57\0\1\277"+
    "\55\0\1\300\51\0\1\301\51\0\1\251\56\0\1\302"+
    "\27\0\1\302\64\0\1\303\22\0\1\304\2\0\1\304"+
    "\1\0\1\304\1\0\1\304\3\0\5\304\5\0\12\304"+
    "\1\0\5\304\5\0\1\305\2\0\1\304\1\0\1\304"+
    "\1\0\1\304\3\0\5\304\5\0\12\304\1\0\5\304"+
    "\5\0\1\304\2\0\1\304\1\0\1\304\1\0\1\304"+
    "\3\0\4\304\1\306\5\0\12\304\1\0\5\304\5\0"+
    "\1\304\2\0\1\304\1\0\1\304\1\0\1\304\3\0"+
    "\3\304\1\307\1\304\5\0\12\304\1\0\5\304\5\0"+
    "\1\304\2\0\1\304\1\0\1\304\1\0\1\304\3\0"+
    "\2\304\1\310\2\304\5\0\12\304\1\0\5\304\5\0"+
    "\1\304\2\0\1\304\1\0\1\304\1\0\1\304\3\0"+
    "\5\304\5\0\2\304\1\311\7\304\1\0\5\304\5\0"+
    "\1\304\2\0\1\304\1\0\1\304\1\0\1\304\3\0"+
    "\3\304\1\312\1\304\5\0\12\304\1\0\5\304\5\0"+
    "\1\304\2\0\1\304\1\0\1\304\1\0\1\304\3\0"+
    "\5\304\5\0\10\304\1\313\1\304\1\0\5\304\5\0"+
    "\1\304\2\0\1\304\1\0\1\304\1\0\1\314\3\0"+
    "\5\304\5\0\12\304\1\0\5\304\33\0\1\276\42\0"+
    "\1\315\50\0\1\267\62\0\1\302\51\0\1\235\51\0"+
    "\1\316\62\0\1\271\20\0\1\272\67\0\1\317\56\0"+
    "\1\320\26\0\1\321\42\0\1\322\2\0\1\322\1\0"+
    "\1\322\1\0\1\322\3\0\5\322\5\0\12\322\1\0"+
    "\5\322\5\0\1\323\2\0\1\322\1\0\1\322\1\0"+
    "\1\322\3\0\5\322\5\0\12\322\1\0\5\322\5\0"+
    "\1\322\2\0\1\322\1\0\1\322\1\0\1\322\3\0"+
    "\1\322\1\324\3\322\5\0\12\322\1\0\5\322\5\0"+
    "\1\322\2\0\1\322\1\0\1\322\1\0\1\322\3\0"+
    "\5\322\5\0\1\325\11\322\1\0\5\322\5\0\1\322"+
    "\2\0\1\322\1\0\1\322\1\0\1\322\3\0\5\322"+
    "\5\0\7\322\1\326\2\322\1\0\5\322\5\0\1\322"+
    "\2\0\1\322\1\0\1\322\1\0\1\322\3\0\3\322"+
    "\1\327\1\322\5\0\12\322\1\0\5\322\5\0\1\322"+
    "\2\0\1\322\1\0\1\322\1\0\1\322\3\0\5\322"+
    "\5\0\2\322\1\330\7\322\1\0\5\322\35\0\1\331"+
    "\37\0\1\302\64\0\1\332\51\0\1\166\47\0\1\333"+
    "\22\0\1\334\2\0\1\334\1\0\1\334\1\0\1\334"+
    "\3\0\5\334\5\0\12\334\1\0\5\334\5\0\1\335"+
    "\2\0\1\334\1\0\1\334\1\0\1\334\3\0\5\334"+
    "\5\0\12\334\1\0\5\334\5\0\1\334\2\0\1\334"+
    "\1\0\1\334\1\0\1\334\3\0\5\334\5\0\4\334"+
    "\1\336\5\334\1\0\5\334\5\0\1\334\2\0\1\334"+
    "\1\0\1\334\1\0\1\334\3\0\2\334\1\337\2\334"+
    "\5\0\12\334\1\0\5\334\5\0\1\334\2\0\1\334"+
    "\1\0\1\334\1\0\1\334\3\0\1\334\1\340\3\334"+
    "\5\0\12\334\1\0\5\334\14\0\1\267\56\0\1\341"+
    "\63\0\1\271\23\0\1\342\2\0\1\342\1\0\1\342"+
    "\1\0\1\342\3\0\5\342\5\0\12\342\1\0\5\342"+
    "\5\0\1\343\2\0\1\342\1\0\1\342\1\0\1\342"+
    "\3\0\5\342\5\0\12\342\1\0\5\342\5\0\1\342"+
    "\2\0\1\342\1\0\1\342\1\0\1\342\3\0\1\342"+
    "\1\344\3\342\5\0\12\342\1\0\5\342\24\0\1\345"+
    "\32\0\1\346\2\0\1\346\1\0\1\346\1\0\1\346"+
    "\3\0\5\346\5\0\12\346\1\0\5\346\5\0\1\347"+
    "\2\0\1\346\1\0\1\346\1\0\1\346\3\0\5\346"+
    "\5\0\12\346\1\0\5\346\5\0\1\346\2\0\1\346"+
    "\1\0\1\346\1\0\1\346\3\0\4\346\1\350\5\0"+
    "\12\346\1\0\5\346\23\0\1\351\33\0\1\352\2\0"+
    "\1\352\1\0\1\352\1\0\1\352\3\0\5\352\5\0"+
    "\12\352\1\0\5\352\5\0\1\353\2\0\1\352\1\0"+
    "\1\352\1\0\1\352\3\0\5\352\5\0\12\352\1\0"+
    "\5\352\34\0\1\354\22\0\1\355\2\0\1\355\1\0"+
    "\1\355\1\0\1\355\3\0\5\355\5\0\12\355\1\0"+
    "\5\355\5\0\1\356\2\0\1\355\1\0\1\355\1\0"+
    "\1\355\3\0\5\355\5\0\12\355\1\0\5\355\5\0"+
    "\1\357\2\0\1\357\1\0\1\357\1\0\1\357\3\0"+
    "\5\357\5\0\12\357\1\0\5\357\5\0\1\360\2\0"+
    "\1\357\1\0\1\357\1\0\1\357\3\0\5\357\5\0"+
    "\12\357\1\0\5\357\5\0\1\361\2\0\1\361\1\0"+
    "\1\361\1\0\1\361\3\0\5\361\5\0\12\361\1\0"+
    "\5\361\5\0\1\362\2\0\1\361\1\0\1\361\1\0"+
    "\1\361\3\0\5\361\5\0\12\361\1\0\5\361\5\0"+
    "\1\363\2\0\1\363\1\0\1\363\1\0\1\363\3\0"+
    "\5\363\5\0\12\363\1\0\5\363\5\0\1\364\2\0"+
    "\1\363\1\0\1\363\1\0\1\363\3\0\5\363\5\0"+
    "\12\363\1\0\5\363\5\0\1\365\2\0\1\365\1\0"+
    "\1\365\1\0\1\365\3\0\5\365\5\0\12\365\1\0"+
    "\5\365\5\0\1\366\2\0\1\365\1\0\1\365\1\0"+
    "\1\365\3\0\5\365\5\0\12\365\1\0\5\365\5\0"+
    "\1\367\2\0\1\367\1\0\1\367\1\0\1\367\3\0"+
    "\5\367\5\0\12\367\1\0\5\367\5\0\1\370\2\0"+
    "\1\367\1\0\1\367\1\0\1\367\3\0\5\367\5\0"+
    "\12\367\1\0\5\367\5\0\1\371\2\0\1\371\1\0"+
    "\1\371\1\0\1\371\3\0\5\371\5\0\12\371\1\0"+
    "\5\371\5\0\1\372\2\0\1\371\1\0\1\371\1\0"+
    "\1\371\3\0\5\371\5\0\12\371\1\0\5\371\5\0"+
    "\1\373\2\0\1\373\1\0\1\373\1\0\1\373\3\0"+
    "\5\373\5\0\12\373\1\0\5\373\5\0\1\374\2\0"+
    "\1\373\1\0\1\373\1\0\1\373\3\0\5\373\5\0"+
    "\12\373\1\0\5\373\5\0\1\375\2\0\1\375\1\0"+
    "\1\375\1\0\1\375\3\0\5\375\5\0\12\375\1\0"+
    "\5\375\5\0\1\376\2\0\1\375\1\0\1\375\1\0"+
    "\1\375\3\0\5\375\5\0\12\375\1\0\5\375\5\0"+
    "\1\377\2\0\1\377\1\0\1\377\1\0\1\377\3\0"+
    "\5\377\5\0\12\377\1\0\5\377\5\0\1\u0100\2\0"+
    "\1\377\1\0\1\377\1\0\1\377\3\0\5\377\5\0"+
    "\12\377\1\0\5\377\5\0\1\u0101\2\0\1\u0101\1\0"+
    "\1\u0101\1\0\1\u0101\3\0\5\u0101\5\0\12\u0101\1\0"+
    "\5\u0101\5\0\1\u0102\2\0\1\u0101\1\0\1\u0101\1\0"+
    "\1\u0101\3\0\5\u0101\5\0\12\u0101\1\0\5\u0101\5\0"+
    "\1\u0103\2\0\1\u0103\1\0\1\u0103\1\0\1\u0103\3\0"+
    "\5\u0103\5\0\12\u0103\1\0\5\u0103\5\0\1\u0104\2\0"+
    "\1\u0103\1\0\1\u0103\1\0\1\u0103\3\0\5\u0103\5\0"+
    "\12\u0103\1\0\5\u0103\5\0\1\u0105\2\0\1\u0105\1\0"+
    "\1\u0105\1\0\1\u0105\3\0\5\u0105\5\0\12\u0105\1\0"+
    "\5\u0105\5\0\1\u0106\2\0\1\u0105\1\0\1\u0105\1\0"+
    "\1\u0105\3\0\5\u0105\5\0\12\u0105\1\0\5\u0105\5\0"+
    "\1\u0107\2\0\1\u0107\1\0\1\u0107\1\0\1\u0107\3\0"+
    "\5\u0107\5\0\12\u0107\1\0\5\u0107\5\0\1\u0108\2\0"+
    "\1\u0107\1\0\1\u0107\1\0\1\u0107\3\0\5\u0107\5\0"+
    "\12\u0107\1\0\5\u0107\5\0\1\u0109\2\0\1\u0109\1\0"+
    "\1\u0109\1\0\1\u0109\3\0\5\u0109\5\0\12\u0109\1\0"+
    "\5\u0109\5\0\1\u010a\2\0\1\u0109\1\0\1\u0109\1\0"+
    "\1\u0109\3\0\5\u0109\5\0\12\u0109\1\0\5\u0109\5\0"+
    "\1\u010b\2\0\1\u010b\1\0\1\u010b\1\0\1\u010b\3\0"+
    "\5\u010b\5\0\12\u010b\1\0\5\u010b\5\0\1\u010c\2\0"+
    "\1\u010b\1\0\1\u010b\1\0\1\u010b\3\0\5\u010b\5\0"+
    "\12\u010b\1\0\5\u010b\5\0\1\u010d\2\0\1\u010d\1\0"+
    "\1\u010d\1\0\1\u010d\3\0\5\u010d\5\0\12\u010d\1\0"+
    "\5\u010d\5\0\1\u010e\2\0\1\u010d\1\0\1\u010d\1\0"+
    "\1\u010d\3\0\5\u010d\5\0\12\u010d\1\0\5\u010d\5\0"+
    "\1\u010f\2\0\1\u010f\1\0\1\u010f\1\0\1\u010f\3\0"+
    "\5\u010f\5\0\12\u010f\1\0\5\u010f\5\0\1\u0110\2\0"+
    "\1\u010f\1\0\1\u010f\1\0\1\u010f\3\0\5\u010f\5\0"+
    "\12\u010f\1\0\5\u010f\5\0\1\u0111\2\0\1\u0111\1\0"+
    "\1\u0111\1\0\1\u0111\3\0\5\u0111\5\0\12\u0111\1\0"+
    "\5\u0111\5\0\1\u0112\2\0\1\u0111\1\0\1\u0111\1\0"+
    "\1\u0111\3\0\5\u0111\5\0\12\u0111\1\0\5\u0111\5\0"+
    "\1\u0113\2\0\1\u0113\1\0\1\u0113\1\0\1\u0113\3\0"+
    "\5\u0113\5\0\12\u0113\1\0\5\u0113\5\0\1\u0114\2\0"+
    "\1\u0113\1\0\1\u0113\1\0\1\u0113\3\0\5\u0113\5\0"+
    "\12\u0113\1\0\5\u0113\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10038];
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
    "\1\0\1\11\4\1\1\11\12\1\2\11\11\1\4\11"+
    "\2\0\4\1\1\0\1\1\1\0\1\11\3\1\1\11"+
    "\12\1\13\0\17\1\23\0\16\1\25\0\16\1\1\0"+
    "\1\11\12\0\1\11\6\0\14\1\1\0\1\11\12\0"+
    "\2\11\11\1\5\0\7\1\3\0\5\1\1\0\3\1"+
    "\1\0\3\1\1\0\2\1\1\11\46\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[276];
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
        case 18: 
          { return new Symbol(sym.RESERVADA_NO, yychar, yyline, yytext());
          }
        case 40: break;
        case 17: 
          { return new Symbol(sym.CADENA_TEXTO,      yychar, yyline, yytext());
          }
        case 41: break;
        case 29: 
          { return new Symbol(sym.ESPECIALES_PARAMETRO , yychar, yyline, yytext());
          }
        case 42: break;
        case 12: 
          { return new Symbol(sym.DOS_PUNTOS,        yychar, yyline, yytext());
          }
        case 43: break;
        case 13: 
          { return new Symbol(sym.PUNTO_COMA,        yychar, yyline, yytext());
          }
        case 44: break;
        case 14: 
          { return new Symbol(sym.PARENTESIS_IZQ, yychar, yyline, yytext());
          }
        case 45: break;
        case 2: 
          { return new Symbol(sym.NUMERO,            yychar, yyline, new Integer(yytext()));
          }
        case 46: break;
        case 16: 
          { return new Symbol(sym.NUMERO_DECIMAL, yychar, yyline, new Double(yytext()));
          }
        case 47: break;
        case 6: 
          { return new Symbol(sym.OP_LOGICO,         yychar, yyline, yytext());
          }
        case 48: break;
        case 3: 
          { return new Symbol(sym.OP_MAS,  yychar, yyline, yytext());
          }
        case 49: break;
        case 38: 
          { return new Symbol(sym.RESERVADA_DECLARACION, yychar, yyline, yytext());
          }
        case 50: break;
        case 9: 
          { return new Symbol(sym.OP_RELACIONAL,     yychar, yyline, yytext());
          }
        case 51: break;
        case 36: 
          { return new Symbol(sym.RESERVADA_PRINCIPAL, yychar, yyline, yytext());
          }
        case 52: break;
        case 4: 
          { return new Symbol(sym.OP_MENOS,  yychar, yyline, yytext());
          }
        case 53: break;
        case 28: 
          { return new Symbol(sym.RESERVADA_CADENA,  yychar, yyline, yytext());
          }
        case 54: break;
        case 24: 
          { return new Symbol(sym.ESPECIALES_CT , yychar, yyline, yytext());
          }
        case 55: break;
        case 22: 
          { return new Symbol(sym.RESERVADA_CORTO,   yychar, yyline, yytext());
          }
        case 56: break;
        case 10: 
          { return new Symbol(sym.OP_ARITMETICO2,  yychar, yyline, yytext());
          }
        case 57: break;
        case 11: 
          { return new Symbol(sym.COMA, yychar, yyline, yytext());
          }
        case 58: break;
        case 35: 
          { return new Symbol(sym.RESERVADA_MIENTRAS,     yychar, yyline, yytext());
          }
        case 59: break;
        case 23: 
          { return new Symbol(sym.RESERVADA_FALSO, yychar, yyline, yytext());
          }
        case 60: break;
        case 33: 
          { return new Symbol(sym.RESERVADA_INICIAR, yychar, yyline, yytext());
          }
        case 61: break;
        case 30: 
          { return new Symbol(sym.ESPECIALES_SOLAS , yychar, yyline, yytext());
          }
        case 62: break;
        case 32: 
          { return new Symbol(sym.RESERVADA_DECIMAL, yychar, yyline, yytext());
          }
        case 63: break;
        case 25: 
          { return new Symbol(sym.ESPECIALES_RUTA , yychar, yyline, yytext());
          }
        case 64: break;
        case 19: 
          { return new Symbol(sym.RESERVADA_SI,     yychar, yyline, yytext());
          }
        case 65: break;
        case 27: 
          { return new Symbol(sym.RESERVADA_LLAMAR,     yychar, yyline, yytext());
          }
        case 66: break;
        case 20: 
          { return new Symbol(sym.NUMERO_EXPONENTE, yychar, yyline, new Double(yytext()));
          }
        case 67: break;
        case 26: 
          { return new Symbol(sym.RESERVADA_ENTERO,  yychar, yyline, yytext());
          }
        case 68: break;
        case 39: 
          { return new Symbol(sym.ESPECIALES_DOS , yychar, yyline, yytext());
          }
        case 69: break;
        case 21: 
          { return new Symbol(sym.RESERVADA_FIN,     yychar, yyline, yytext());
          }
        case 70: break;
        case 37: 
          { return new Symbol(sym.RESERVADA_VERDADERO, yychar, yyline, yytext());
          }
        case 71: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 72: break;
        case 34: 
          { return new Symbol(sym.RESERVADA_BOOLEANO, yychar, yyline, yytext());
          }
        case 73: break;
        case 7: 
          { /*Ignore*/
          }
        case 74: break;
        case 8: 
          { return new Symbol(sym.ASIGNACION,         yychar, yyline, yytext());
          }
        case 75: break;
        case 5: 
          { return new Symbol(sym.IDENTIFICADOR,     yychar, yyline, new String(yytext()));
          }
        case 76: break;
        case 15: 
          { return new Symbol(sym.PARENTESIS_DER, yychar, yyline, yytext());
          }
        case 77: break;
        case 31: 
          { return new Symbol(sym.ESPECIALES_ID , yychar, yyline, yytext());
          }
        case 78: break;
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
