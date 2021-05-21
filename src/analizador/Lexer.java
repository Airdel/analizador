/* The following code was generated by JFlex 1.4.3 on 21/05/21 13:43 */

package analizador;
import java.io.*;
import static analizador.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21/05/21 13:43 from the specification file
 * <tt>C:/Users/danyc/Downloads/numeroLineas-master/src/analizador/Lexer.flex</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\10\2\0\1\7\22\0\1\7\1\0\1\0\2\0"+
    "\1\15\1\13\1\0\1\17\1\20\1\6\1\3\1\0\1\4\1\45"+
    "\1\12\12\2\1\23\1\16\1\22\1\11\1\21\1\0\1\24\3\1"+
    "\1\1\26\1\6\0\1\33\1\43\1\32\1\34\1\25\1\36\2\5"+
    "\1\35\2\5\1\44\1\41\1\26\1\31\1\42\1\5\1\30\1\40"+
    "\1\27\1\37\5\5\1\0\1\14\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\11\5\1\0\2\1\1\0"+
    "\1\2\1\7\1\5\1\24\1\5\1\25\4\5\1\26"+
    "\4\5\1\0\1\27\1\30\1\0\3\5\1\31\5\5"+
    "\1\27\6\5\1\32\10\5\1\33\1\34\5\5\1\35"+
    "\1\36\3\5\1\37\1\5\1\40\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[94];
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
    "\0\0\0\46\0\114\0\162\0\46\0\230\0\276\0\46"+
    "\0\46\0\344\0\46\0\46\0\46\0\46\0\46\0\46"+
    "\0\46\0\46\0\46\0\46\0\46\0\u010a\0\u0130\0\u0156"+
    "\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a\0\u0260\0\u0286"+
    "\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344\0\46\0\u036a\0\276"+
    "\0\u0390\0\u03b6\0\u03dc\0\u0402\0\276\0\u0428\0\u044e\0\u0474"+
    "\0\u049a\0\u04c0\0\u02ac\0\u04e6\0\u050c\0\u0532\0\u0558\0\u057e"+
    "\0\276\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u050c\0\u0662"+
    "\0\u0688\0\u06ae\0\u06d4\0\u06fa\0\u0720\0\276\0\u0746\0\u076c"+
    "\0\u0792\0\u07b8\0\u07de\0\u0804\0\u082a\0\u0850\0\276\0\276"+
    "\0\u0876\0\u089c\0\u08c2\0\u08e8\0\u090e\0\276\0\276\0\u0934"+
    "\0\u095a\0\u0980\0\276\0\u09a6\0\276\0\276";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[94];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\3\7\1\30"+
    "\2\7\1\31\1\32\1\7\1\33\1\34\1\35\1\36"+
    "\1\7\1\2\47\0\1\3\3\0\1\3\17\0\20\3"+
    "\3\0\1\4\1\0\1\37\1\40\17\0\1\41\17\40"+
    "\1\42\2\0\1\43\1\0\1\44\42\0\1\3\1\45"+
    "\2\0\1\7\17\0\20\7\12\0\1\46\35\0\1\3"+
    "\1\45\2\0\1\7\17\0\1\7\1\47\16\7\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\4\7\1\50\13\7"+
    "\2\0\1\3\1\45\2\0\1\7\17\0\6\7\1\51"+
    "\11\7\2\0\1\3\1\45\2\0\1\7\17\0\1\7"+
    "\1\52\16\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\10\7\1\53\1\7\1\54\5\7\2\0\1\3\1\45"+
    "\2\0\1\7\17\0\10\7\1\55\7\7\2\0\1\3"+
    "\1\45\2\0\1\7\17\0\10\7\1\56\7\7\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\3\7\1\57\2\7"+
    "\1\60\11\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\4\7\1\61\13\7\3\0\1\62\45\0\1\40\2\0"+
    "\1\40\17\0\20\40\3\0\1\63\2\0\1\40\17\0"+
    "\20\40\3\0\1\64\45\0\1\43\1\0\1\37\20\0"+
    "\1\65\17\0\1\42\10\44\1\0\35\44\2\0\1\45"+
    "\2\0\1\45\17\0\20\45\2\0\1\3\1\45\2\0"+
    "\1\7\17\0\2\7\1\66\15\7\2\0\1\3\1\45"+
    "\2\0\1\7\17\0\7\7\1\67\10\7\2\0\1\3"+
    "\1\45\2\0\1\7\17\0\10\7\1\70\7\7\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\1\7\1\71\16\7"+
    "\2\0\1\3\1\45\2\0\1\7\17\0\1\7\1\72"+
    "\16\7\2\0\1\3\1\45\2\0\1\7\17\0\1\73"+
    "\17\7\2\0\1\3\1\45\2\0\1\7\17\0\10\7"+
    "\1\74\7\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\3\7\1\75\14\7\2\0\1\3\1\45\2\0\1\7"+
    "\17\0\4\7\1\76\13\7\3\0\1\62\1\0\1\37"+
    "\20\0\1\65\17\0\1\42\25\0\1\65\17\0\1\42"+
    "\2\0\1\77\44\0\1\3\1\45\2\0\1\7\17\0"+
    "\1\100\17\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\1\101\17\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\5\7\1\102\12\7\2\0\1\3\1\45\2\0\1\7"+
    "\17\0\5\7\1\103\12\7\2\0\1\3\1\45\2\0"+
    "\1\7\17\0\1\7\1\104\16\7\2\0\1\3\1\45"+
    "\2\0\1\7\17\0\1\7\1\105\16\7\2\0\1\3"+
    "\1\45\2\0\1\7\17\0\6\7\1\106\11\7\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\17\7\1\107\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\3\7\1\110\14\7"+
    "\2\0\1\3\1\45\2\0\1\7\17\0\1\7\1\111"+
    "\16\7\2\0\1\3\1\45\2\0\1\7\17\0\10\7"+
    "\1\112\7\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\10\7\1\113\7\7\2\0\1\3\1\45\2\0\1\7"+
    "\17\0\2\7\1\114\15\7\2\0\1\3\1\45\2\0"+
    "\1\7\17\0\5\7\1\115\12\7\2\0\1\3\1\45"+
    "\2\0\1\7\17\0\1\116\17\7\2\0\1\3\1\45"+
    "\2\0\1\7\17\0\4\7\1\117\13\7\2\0\1\3"+
    "\1\45\2\0\1\7\17\0\6\7\1\120\11\7\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\6\7\1\121\11\7"+
    "\2\0\1\3\1\45\2\0\1\7\17\0\4\7\1\122"+
    "\13\7\2\0\1\3\1\45\2\0\1\7\17\0\3\7"+
    "\1\123\14\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\10\7\1\124\7\7\2\0\1\3\1\45\2\0\1\7"+
    "\17\0\6\7\1\125\11\7\2\0\1\3\1\45\2\0"+
    "\1\7\17\0\3\7\1\126\14\7\2\0\1\3\1\45"+
    "\2\0\1\7\17\0\1\7\1\127\16\7\2\0\1\3"+
    "\1\45\2\0\1\7\17\0\6\7\1\130\11\7\2\0"+
    "\1\3\1\45\2\0\1\7\17\0\15\7\1\131\2\7"+
    "\2\0\1\3\1\45\2\0\1\7\17\0\1\7\1\132"+
    "\16\7\2\0\1\3\1\45\2\0\1\7\17\0\13\7"+
    "\1\133\4\7\2\0\1\3\1\45\2\0\1\7\17\0"+
    "\6\7\1\134\11\7\2\0\1\3\1\45\2\0\1\7"+
    "\17\0\4\7\1\135\13\7\2\0\1\3\1\45\2\0"+
    "\1\7\17\0\17\7\1\136\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2508];
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
    "\1\0\1\11\2\1\1\11\2\1\2\11\1\1\13\11"+
    "\11\1\1\0\2\1\1\0\3\1\1\11\13\1\1\0"+
    "\2\1\1\0\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[94];
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
    public String lexeme;
    InformacionAnalisis c = new InformacionAnalisis();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 112) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
        case 25: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_FIN;
          }
        case 34: break;
        case 10: 
          { c.linea=yyline; lexeme=yytext(); return Y;
          }
        case 35: break;
        case 6: 
          { c.linea=yyline; lexeme=yytext(); return POR;
          }
        case 36: break;
        case 28: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_CADENA;
          }
        case 37: break;
        case 26: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_PARA;
          }
        case 38: break;
        case 13: 
          { c.linea=yyline; lexeme=yytext(); return PUNTO_COMA;
          }
        case 39: break;
        case 4: 
          { c.linea=yyline; lexeme=yytext(); return MENOS;
          }
        case 40: break;
        case 3: 
          { c.linea=yyline; lexeme=yytext(); return MAS;
          }
        case 41: break;
        case 29: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_INICIAR;
          }
        case 42: break;
        case 30: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_FUNCION;
          }
        case 43: break;
        case 32: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_BOOLEANO;
          }
        case 44: break;
        case 18: 
          { c.linea=yyline; lexeme=yytext(); return DOS_PUNTOS;
          }
        case 45: break;
        case 1: 
          { c.linea=yyline; lexeme=yytext(); return ERROR;
          }
        case 46: break;
        case 9: 
          { c.linea=yyline; lexeme=yytext(); return DIVISION;
          }
        case 47: break;
        case 33: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_PRINCIPAL;
          }
        case 48: break;
        case 5: 
          { c.linea=yyline; lexeme=yytext(); return IDENTIFICADOR;
          }
        case 49: break;
        case 22: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_SI;
          }
        case 50: break;
        case 8: 
          { c.linea=yyline; lexeme=yytext(); return ASIGNACION;
          }
        case 51: break;
        case 11: 
          { c.linea=yyline; lexeme=yytext(); return O;
          }
        case 52: break;
        case 12: 
          { c.linea=yyline; lexeme=yytext(); return MODULO;
          }
        case 53: break;
        case 19: 
          { c.linea=yyline; lexeme=yytext(); return ARROBA;
          }
        case 54: break;
        case 20: 
          { c.linea=yyline; lexeme=yytext(); return IGUAL;
          }
        case 55: break;
        case 17: 
          { c.linea=yyline; lexeme=yytext(); return MENOR;
          }
        case 56: break;
        case 21: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_NO;
          }
        case 57: break;
        case 7: 
          { /*Ignore*/
          }
        case 58: break;
        case 2: 
          { c.linea=yyline; lexeme=yytext(); return NUMERO;
          }
        case 59: break;
        case 31: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_MIENTRAS;
          }
        case 60: break;
        case 24: 
          { c.linea=yyline; lexeme=yytext(); return NUMERO_DECIMAL;
          }
        case 61: break;
        case 15: 
          { c.linea=yyline; lexeme=yytext(); return PARENTESIS_DER;
          }
        case 62: break;
        case 27: 
          { c.linea=yyline; lexeme=yytext(); return RESERVADA_ENTERO;
          }
        case 63: break;
        case 14: 
          { c.linea=yyline; lexeme=yytext(); return PARENTESIS_IZQ;
          }
        case 64: break;
        case 23: 
          { c.linea=yyline; lexeme=yytext(); return NUMERO_EXPONENTE;
          }
        case 65: break;
        case 16: 
          { c.linea=yyline; lexeme=yytext(); return MAYOR;
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
