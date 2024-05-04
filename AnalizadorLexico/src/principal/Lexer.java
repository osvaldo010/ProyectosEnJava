/* The following code was generated by JFlex 1.4.3 on 4/30/24 9:11 AM */

package principal;
import static principal.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/30/24 9:11 AM from the specification file
 * <tt>C:/Users/osval/Documents/NetBeansProjects/AnalizadorLexico/src/principal/Lexer.flex</tt>
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
    "\11\0\1\3\1\42\2\0\1\3\22\0\1\3\1\47\1\51\1\50"+
    "\1\52\1\53\1\54\1\60\1\55\1\56\1\46\1\44\1\3\1\45"+
    "\1\75\1\41\12\2\1\77\1\76\1\70\1\43\1\67\1\57\1\0"+
    "\1\30\1\1\1\36\1\31\1\21\3\1\1\7\1\1\1\37\1\34"+
    "\1\23\4\1\1\33\1\13\3\1\1\35\3\1\1\65\1\0\1\66"+
    "\1\72\1\71\1\0\1\26\1\27\1\1\1\22\1\10\1\14\1\11"+
    "\1\20\1\4\2\1\1\15\1\32\1\5\1\24\2\1\1\12\1\16"+
    "\1\6\1\25\1\1\1\17\1\1\1\40\1\1\1\63\1\74\1\64"+
    "\43\0\1\61\16\0\1\73\16\0\1\62\uff40\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\14\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\2\1\44\10\2"+
    "\1\45\4\2\1\4\1\0\1\46\3\2\1\47\1\2"+
    "\1\50\2\2\1\51\3\2\1\0\1\2\1\52\3\2"+
    "\1\53\3\2\1\3\2\2\1\54\6\2\1\55\1\56"+
    "\4\2\1\57\1\2\1\60\1\2\1\61\1\62\1\2"+
    "\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
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
    "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\u0180\0\u01c0"+
    "\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\u0340\0\u0380\0\u03c0"+
    "\0\u0400\0\u0440\0\100\0\100\0\100\0\100\0\100\0\100"+
    "\0\100\0\100\0\100\0\100\0\100\0\100\0\100\0\100"+
    "\0\100\0\100\0\100\0\u0480\0\100\0\100\0\100\0\100"+
    "\0\100\0\200\0\100\0\100\0\100\0\100\0\100\0\100"+
    "\0\u04c0\0\200\0\u0500\0\u0540\0\u0580\0\u05c0\0\u0600\0\u0640"+
    "\0\u0680\0\u06c0\0\200\0\u0700\0\u0740\0\u0780\0\u07c0\0\u0800"+
    "\0\u0840\0\200\0\u0880\0\u08c0\0\u0900\0\200\0\u0940\0\200"+
    "\0\u0980\0\u09c0\0\200\0\u0a00\0\u0a40\0\u0a80\0\u0ac0\0\u0b00"+
    "\0\200\0\u0b40\0\u0b80\0\u0bc0\0\200\0\u0c00\0\u0c40\0\u0c80"+
    "\0\100\0\u0cc0\0\u0d00\0\200\0\u0d40\0\u0d80\0\u0dc0\0\u0e00"+
    "\0\u0e40\0\u0e80\0\200\0\200\0\u0ec0\0\u0f00\0\u0f40\0\u0f80"+
    "\0\200\0\u0fc0\0\200\0\u1000\0\200\0\200\0\u1040\0\200";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
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
    "\1\2\1\3\1\4\1\5\1\6\2\3\1\7\1\10"+
    "\2\3\1\11\3\3\1\12\1\3\1\13\1\3\1\14"+
    "\4\3\1\15\1\16\1\3\1\17\1\3\1\20\1\21"+
    "\2\3\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\101\0\2\3\1\0\35\3\30\0\1\3\10\0\1\4"+
    "\100\0\1\5\75\0\2\3\1\0\1\3\1\61\6\3"+
    "\1\62\24\3\30\0\1\3\7\0\2\3\1\0\1\3"+
    "\1\63\33\3\30\0\1\3\7\0\2\3\1\0\11\3"+
    "\1\64\23\3\30\0\1\3\7\0\2\3\1\0\2\3"+
    "\1\65\16\3\1\66\13\3\30\0\1\3\7\0\2\3"+
    "\1\0\14\3\1\67\20\3\30\0\1\3\7\0\2\3"+
    "\1\0\1\3\1\70\33\3\30\0\1\3\7\0\2\3"+
    "\1\0\20\3\1\71\1\3\1\72\12\3\30\0\1\3"+
    "\7\0\2\3\1\0\12\3\1\73\22\3\30\0\1\3"+
    "\7\0\2\3\1\0\1\74\34\3\30\0\1\3\7\0"+
    "\2\3\1\0\4\3\1\75\30\3\30\0\1\3\7\0"+
    "\2\3\1\0\6\3\1\76\26\3\30\0\1\3\7\0"+
    "\2\3\1\0\20\3\1\77\14\3\30\0\1\3\47\0"+
    "\1\100\103\0\1\101\33\0\2\3\1\0\2\3\1\102"+
    "\32\3\30\0\1\3\7\0\2\3\1\0\2\3\1\103"+
    "\32\3\30\0\1\3\7\0\2\3\1\0\12\3\1\104"+
    "\22\3\30\0\1\3\7\0\2\3\1\0\6\3\1\105"+
    "\26\3\30\0\1\3\7\0\2\3\1\0\23\3\1\106"+
    "\11\3\30\0\1\3\7\0\2\3\1\0\1\107\34\3"+
    "\30\0\1\3\7\0\2\3\1\0\16\3\1\110\16\3"+
    "\30\0\1\3\7\0\2\3\1\0\16\3\1\111\16\3"+
    "\30\0\1\3\7\0\2\3\1\0\1\112\34\3\30\0"+
    "\1\3\7\0\2\3\1\0\26\3\1\113\6\3\30\0"+
    "\1\3\7\0\2\3\1\0\22\3\1\114\12\3\30\0"+
    "\1\3\7\0\2\3\1\0\1\115\34\3\30\0\1\3"+
    "\7\0\2\3\1\0\1\3\1\116\33\3\30\0\1\3"+
    "\6\0\42\100\1\0\35\100\2\0\1\117\76\0\2\3"+
    "\1\0\4\3\1\120\30\3\30\0\1\3\7\0\2\3"+
    "\1\0\4\3\1\121\30\3\30\0\1\3\7\0\2\3"+
    "\1\0\1\122\34\3\30\0\1\3\7\0\2\3\1\0"+
    "\11\3\1\123\23\3\30\0\1\3\7\0\2\3\1\0"+
    "\21\3\1\124\13\3\30\0\1\3\7\0\2\3\1\0"+
    "\1\3\1\125\33\3\30\0\1\3\7\0\2\3\1\0"+
    "\16\3\1\126\16\3\30\0\1\3\7\0\2\3\1\0"+
    "\2\3\1\127\32\3\30\0\1\3\7\0\2\3\1\0"+
    "\12\3\1\130\22\3\30\0\1\3\10\0\1\117\53\0"+
    "\1\131\22\0\2\3\1\0\5\3\1\132\27\3\30\0"+
    "\1\3\7\0\2\3\1\0\1\3\1\133\33\3\30\0"+
    "\1\3\7\0\2\3\1\0\4\3\1\134\30\3\30\0"+
    "\1\3\7\0\2\3\1\0\11\3\1\135\23\3\30\0"+
    "\1\3\7\0\2\3\1\0\30\3\1\136\2\3\1\137"+
    "\1\3\30\0\1\3\7\0\2\3\1\0\4\3\1\140"+
    "\30\3\30\0\1\3\7\0\2\3\1\0\20\3\1\141"+
    "\14\3\30\0\1\3\7\0\2\3\1\0\4\3\1\142"+
    "\30\3\30\0\1\3\7\0\2\3\1\0\5\3\1\143"+
    "\27\3\30\0\1\3\7\0\2\3\1\0\4\3\1\144"+
    "\30\3\30\0\1\3\7\0\2\3\1\0\1\145\34\3"+
    "\30\0\1\3\7\0\2\3\1\0\4\3\1\146\30\3"+
    "\30\0\1\3\7\0\2\3\1\0\30\3\1\147\4\3"+
    "\30\0\1\3\7\0\2\3\1\0\11\3\1\150\23\3"+
    "\30\0\1\3\7\0\2\3\1\0\6\3\1\151\26\3"+
    "\30\0\1\3\7\0\2\3\1\0\1\3\1\152\33\3"+
    "\30\0\1\3\7\0\2\3\1\0\34\3\1\153\30\0"+
    "\1\3\7\0\2\3\1\0\1\154\34\3\30\0\1\3"+
    "\7\0\2\3\1\0\4\3\1\155\30\3\30\0\1\3"+
    "\7\0\2\3\1\0\4\3\1\156\30\3\30\0\1\3"+
    "\7\0\2\3\1\0\1\3\1\157\33\3\30\0\1\3"+
    "\7\0\2\3\1\0\4\3\1\160\30\3\30\0\1\3"+
    "\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4224];
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
    "\1\0\1\11\20\1\21\11\1\1\5\11\1\1\6\11"+
    "\20\1\1\0\15\1\1\0\11\1\1\11\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
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
    while (i < 174) {
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
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 52: break;
        case 32: 
          { lexeme=yytext(); return Op_OR;
          }
        case 53: break;
        case 50: 
          { lexeme=yytext(); return ReadLine;
          }
        case 54: break;
        case 16: 
          { lexeme=yytext(); return Op_AND;
          }
        case 55: break;
        case 34: 
          { lexeme=yytext(); return Signo_puntoycoma;
          }
        case 56: break;
        case 27: 
          { lexeme=yytext(); return Signo_Mayor;
          }
        case 57: break;
        case 39: 
          { lexeme=yytext(); return Sub;
          }
        case 58: break;
        case 42: 
          { lexeme=yytext(); return Else;
          }
        case 59: break;
        case 12: 
          { lexeme=yytext(); return Signo_Numeral;
          }
        case 60: break;
        case 23: 
          { lexeme=yytext(); return Signo_Llave_Abierta;
          }
        case 61: break;
        case 15: 
          { lexeme=yytext(); return Signo_Porcentaje;
          }
        case 62: break;
        case 49: 
          { lexeme=yytext(); return Console;
          }
        case 63: break;
        case 30: 
          { lexeme=yytext(); return Signo_Potencia;
          }
        case 64: break;
        case 11: 
          { lexeme=yytext(); return Signo_Exclamacion;
          }
        case 65: break;
        case 6: 
          { return Linea;
          }
        case 66: break;
        case 45: 
          { lexeme=yytext(); return String;
          }
        case 67: break;
        case 48: 
          { lexeme=yytext(); return ReadKey;
          }
        case 68: break;
        case 24: 
          { lexeme=yytext(); return Signo_Llave_Cerrada;
          }
        case 69: break;
        case 46: 
          { lexeme=yytext(); return Module;
          }
        case 70: break;
        case 29: 
          { lexeme=yytext(); return Signo_Guion_Bajo;
          }
        case 71: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 72: break;
        case 25: 
          { lexeme=yytext(); return Signo_Corchete_Abierto;
          }
        case 73: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 74: break;
        case 4: 
          { /*ignore*/
          }
        case 75: break;
        case 20: 
          { lexeme=yytext(); return Signo_Apostrofe;
          }
        case 76: break;
        case 26: 
          { lexeme=yytext(); return Signo_Corchete_Cerrado;
          }
        case 77: break;
        case 28: 
          { lexeme=yytext(); return Signo_Menor;
          }
        case 78: break;
        case 35: 
          { lexeme=yytext(); return Signo_doblepunto;
          }
        case 79: break;
        case 21: 
          { lexeme=yytext(); return Signo_Exclamacion_Invertida;
          }
        case 80: break;
        case 40: 
          { lexeme=yytext(); return End;
          }
        case 81: break;
        case 33: 
          { lexeme=yytext(); return Signo_punto;
          }
        case 82: break;
        case 37: 
          { lexeme=yytext(); return As;
          }
        case 83: break;
        case 19: 
          { lexeme=yytext(); return Signo_Interrogacion;
          }
        case 84: break;
        case 43: 
          { lexeme=yytext(); return Main;
          }
        case 85: break;
        case 9: 
          { lexeme=yytext(); return Resta;
          }
        case 86: break;
        case 17: 
          { lexeme=yytext(); return Signo_Parentesis_Abierto;
          }
        case 87: break;
        case 41: 
          { lexeme=yytext(); return Dim;
          }
        case 88: break;
        case 31: 
          { lexeme=yytext(); return Signo_Grado;
          }
        case 89: break;
        case 10: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 90: break;
        case 18: 
          { lexeme=yytext(); return Signo_Parentesis_Cerrado;
          }
        case 91: break;
        case 1: 
          { return ERROR;
          }
        case 92: break;
        case 51: 
          { lexeme=yytext(); return WriteLine;
          }
        case 93: break;
        case 47: 
          { lexeme=yytext(); return Integer;
          }
        case 94: break;
        case 14: 
          { lexeme=yytext(); return Signo_Dolar;
          }
        case 95: break;
        case 7: 
          { lexeme=yytext(); return Igual;
          }
        case 96: break;
        case 44: 
          { lexeme=yytext(); return While;
          }
        case 97: break;
        case 38: 
          { lexeme=yytext(); return Int;
          }
        case 98: break;
        case 36: 
          { lexeme=yytext(); return If;
          }
        case 99: break;
        case 22: 
          { lexeme=yytext(); return Signo_Interrogacion_Invertida;
          }
        case 100: break;
        case 8: 
          { lexeme=yytext(); return Suma;
          }
        case 101: break;
        case 13: 
          { lexeme=yytext(); return Signo_Comillas;
          }
        case 102: break;
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