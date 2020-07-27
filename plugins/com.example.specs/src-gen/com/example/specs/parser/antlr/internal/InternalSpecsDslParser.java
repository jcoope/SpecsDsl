package com.example.specs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.example.specs.services.SpecsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification'", "':'", "'Processor'", "'{'", "'}'", "'clockSpeed'", "'cores'", "'Motherboard'", "'Memory'", "'capacity'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSpecsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpecsDsl.g"; }



     	private SpecsDslGrammarAccess grammarAccess;

        public InternalSpecsDslParser(TokenStream input, SpecsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SpecsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSpecsDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSpecsDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSpecsDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpecsDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_specs_0_0= ruleSpec ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_specs_0_0 = null;



        	enterRule();

        try {
            // InternalSpecsDsl.g:77:2: ( ( (lv_specs_0_0= ruleSpec ) )* )
            // InternalSpecsDsl.g:78:2: ( (lv_specs_0_0= ruleSpec ) )*
            {
            // InternalSpecsDsl.g:78:2: ( (lv_specs_0_0= ruleSpec ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpecsDsl.g:79:3: (lv_specs_0_0= ruleSpec )
            	    {
            	    // InternalSpecsDsl.g:79:3: (lv_specs_0_0= ruleSpec )
            	    // InternalSpecsDsl.g:80:4: lv_specs_0_0= ruleSpec
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getSpecsSpecParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_specs_0_0=ruleSpec();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"specs",
            	    					lv_specs_0_0,
            	    					"com.example.specs.SpecsDsl.Spec");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpec"
    // InternalSpecsDsl.g:100:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // InternalSpecsDsl.g:100:45: (iv_ruleSpec= ruleSpec EOF )
            // InternalSpecsDsl.g:101:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalSpecsDsl.g:107:1: ruleSpec returns [EObject current=null] : (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_processor_3_0= ruleProcessor ) ) ( (lv_motherboard_4_0= ruleMotherboard ) ) ( (lv_memories_5_0= ruleMemory ) )* ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_processor_3_0 = null;

        EObject lv_motherboard_4_0 = null;

        EObject lv_memories_5_0 = null;



        	enterRule();

        try {
            // InternalSpecsDsl.g:113:2: ( (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_processor_3_0= ruleProcessor ) ) ( (lv_motherboard_4_0= ruleMotherboard ) ) ( (lv_memories_5_0= ruleMemory ) )* ) )
            // InternalSpecsDsl.g:114:2: (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_processor_3_0= ruleProcessor ) ) ( (lv_motherboard_4_0= ruleMotherboard ) ) ( (lv_memories_5_0= ruleMemory ) )* )
            {
            // InternalSpecsDsl.g:114:2: (otherlv_0= 'Specification' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_processor_3_0= ruleProcessor ) ) ( (lv_motherboard_4_0= ruleMotherboard ) ) ( (lv_memories_5_0= ruleMemory ) )* )
            // InternalSpecsDsl.g:115:3: otherlv_0= 'Specification' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_processor_3_0= ruleProcessor ) ) ( (lv_motherboard_4_0= ruleMotherboard ) ) ( (lv_memories_5_0= ruleMemory ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getSpecificationKeyword_0());
            		
            // InternalSpecsDsl.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSpecsDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSpecsDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalSpecsDsl.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpecAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecAccess().getColonKeyword_2());
            		
            // InternalSpecsDsl.g:141:3: ( (lv_processor_3_0= ruleProcessor ) )
            // InternalSpecsDsl.g:142:4: (lv_processor_3_0= ruleProcessor )
            {
            // InternalSpecsDsl.g:142:4: (lv_processor_3_0= ruleProcessor )
            // InternalSpecsDsl.g:143:5: lv_processor_3_0= ruleProcessor
            {

            					newCompositeNode(grammarAccess.getSpecAccess().getProcessorProcessorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_processor_3_0=ruleProcessor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecRule());
            					}
            					set(
            						current,
            						"processor",
            						lv_processor_3_0,
            						"com.example.specs.SpecsDsl.Processor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecsDsl.g:160:3: ( (lv_motherboard_4_0= ruleMotherboard ) )
            // InternalSpecsDsl.g:161:4: (lv_motherboard_4_0= ruleMotherboard )
            {
            // InternalSpecsDsl.g:161:4: (lv_motherboard_4_0= ruleMotherboard )
            // InternalSpecsDsl.g:162:5: lv_motherboard_4_0= ruleMotherboard
            {

            					newCompositeNode(grammarAccess.getSpecAccess().getMotherboardMotherboardParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_motherboard_4_0=ruleMotherboard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecRule());
            					}
            					set(
            						current,
            						"motherboard",
            						lv_motherboard_4_0,
            						"com.example.specs.SpecsDsl.Motherboard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecsDsl.g:179:3: ( (lv_memories_5_0= ruleMemory ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpecsDsl.g:180:4: (lv_memories_5_0= ruleMemory )
            	    {
            	    // InternalSpecsDsl.g:180:4: (lv_memories_5_0= ruleMemory )
            	    // InternalSpecsDsl.g:181:5: lv_memories_5_0= ruleMemory
            	    {

            	    					newCompositeNode(grammarAccess.getSpecAccess().getMemoriesMemoryParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_memories_5_0=ruleMemory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"memories",
            	    						lv_memories_5_0,
            	    						"com.example.specs.SpecsDsl.Memory");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleProcessor"
    // InternalSpecsDsl.g:202:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalSpecsDsl.g:202:50: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalSpecsDsl.g:203:2: iv_ruleProcessor= ruleProcessor EOF
            {
             newCompositeNode(grammarAccess.getProcessorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;

             current =iv_ruleProcessor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // InternalSpecsDsl.g:209:1: ruleProcessor returns [EObject current=null] : (otherlv_0= 'Processor' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_clockSpeed_3_0= ruleClockSpeed ) ) ( (lv_cores_4_0= ruleCores ) ) otherlv_5= '}' ) ;
    public final EObject ruleProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_clockSpeed_3_0 = null;

        EObject lv_cores_4_0 = null;



        	enterRule();

        try {
            // InternalSpecsDsl.g:215:2: ( (otherlv_0= 'Processor' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_clockSpeed_3_0= ruleClockSpeed ) ) ( (lv_cores_4_0= ruleCores ) ) otherlv_5= '}' ) )
            // InternalSpecsDsl.g:216:2: (otherlv_0= 'Processor' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_clockSpeed_3_0= ruleClockSpeed ) ) ( (lv_cores_4_0= ruleCores ) ) otherlv_5= '}' )
            {
            // InternalSpecsDsl.g:216:2: (otherlv_0= 'Processor' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_clockSpeed_3_0= ruleClockSpeed ) ) ( (lv_cores_4_0= ruleCores ) ) otherlv_5= '}' )
            // InternalSpecsDsl.g:217:3: otherlv_0= 'Processor' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_clockSpeed_3_0= ruleClockSpeed ) ) ( (lv_cores_4_0= ruleCores ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getProcessorKeyword_0());
            		
            // InternalSpecsDsl.g:221:3: ( (otherlv_1= RULE_ID ) )
            // InternalSpecsDsl.g:222:4: (otherlv_1= RULE_ID )
            {
            // InternalSpecsDsl.g:222:4: (otherlv_1= RULE_ID )
            // InternalSpecsDsl.g:223:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getProcessorAccess().getNameProcessorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpecsDsl.g:238:3: ( (lv_clockSpeed_3_0= ruleClockSpeed ) )
            // InternalSpecsDsl.g:239:4: (lv_clockSpeed_3_0= ruleClockSpeed )
            {
            // InternalSpecsDsl.g:239:4: (lv_clockSpeed_3_0= ruleClockSpeed )
            // InternalSpecsDsl.g:240:5: lv_clockSpeed_3_0= ruleClockSpeed
            {

            					newCompositeNode(grammarAccess.getProcessorAccess().getClockSpeedClockSpeedParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_clockSpeed_3_0=ruleClockSpeed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessorRule());
            					}
            					set(
            						current,
            						"clockSpeed",
            						lv_clockSpeed_3_0,
            						"com.example.specs.SpecsDsl.ClockSpeed");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecsDsl.g:257:3: ( (lv_cores_4_0= ruleCores ) )
            // InternalSpecsDsl.g:258:4: (lv_cores_4_0= ruleCores )
            {
            // InternalSpecsDsl.g:258:4: (lv_cores_4_0= ruleCores )
            // InternalSpecsDsl.g:259:5: lv_cores_4_0= ruleCores
            {

            					newCompositeNode(grammarAccess.getProcessorAccess().getCoresCoresParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_cores_4_0=ruleCores();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessorRule());
            					}
            					set(
            						current,
            						"cores",
            						lv_cores_4_0,
            						"com.example.specs.SpecsDsl.Cores");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleClockSpeed"
    // InternalSpecsDsl.g:284:1: entryRuleClockSpeed returns [EObject current=null] : iv_ruleClockSpeed= ruleClockSpeed EOF ;
    public final EObject entryRuleClockSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockSpeed = null;


        try {
            // InternalSpecsDsl.g:284:51: (iv_ruleClockSpeed= ruleClockSpeed EOF )
            // InternalSpecsDsl.g:285:2: iv_ruleClockSpeed= ruleClockSpeed EOF
            {
             newCompositeNode(grammarAccess.getClockSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClockSpeed=ruleClockSpeed();

            state._fsp--;

             current =iv_ruleClockSpeed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockSpeed"


    // $ANTLR start "ruleClockSpeed"
    // InternalSpecsDsl.g:291:1: ruleClockSpeed returns [EObject current=null] : (otherlv_0= 'clockSpeed' ( (lv_clockSpeed_1_0= ruleFLOAT ) ) ) ;
    public final EObject ruleClockSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_clockSpeed_1_0 = null;



        	enterRule();

        try {
            // InternalSpecsDsl.g:297:2: ( (otherlv_0= 'clockSpeed' ( (lv_clockSpeed_1_0= ruleFLOAT ) ) ) )
            // InternalSpecsDsl.g:298:2: (otherlv_0= 'clockSpeed' ( (lv_clockSpeed_1_0= ruleFLOAT ) ) )
            {
            // InternalSpecsDsl.g:298:2: (otherlv_0= 'clockSpeed' ( (lv_clockSpeed_1_0= ruleFLOAT ) ) )
            // InternalSpecsDsl.g:299:3: otherlv_0= 'clockSpeed' ( (lv_clockSpeed_1_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getClockSpeedAccess().getClockSpeedKeyword_0());
            		
            // InternalSpecsDsl.g:303:3: ( (lv_clockSpeed_1_0= ruleFLOAT ) )
            // InternalSpecsDsl.g:304:4: (lv_clockSpeed_1_0= ruleFLOAT )
            {
            // InternalSpecsDsl.g:304:4: (lv_clockSpeed_1_0= ruleFLOAT )
            // InternalSpecsDsl.g:305:5: lv_clockSpeed_1_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getClockSpeedAccess().getClockSpeedFLOATParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_clockSpeed_1_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClockSpeedRule());
            					}
            					set(
            						current,
            						"clockSpeed",
            						lv_clockSpeed_1_0,
            						"com.example.specs.SpecsDsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClockSpeed"


    // $ANTLR start "entryRuleCores"
    // InternalSpecsDsl.g:326:1: entryRuleCores returns [EObject current=null] : iv_ruleCores= ruleCores EOF ;
    public final EObject entryRuleCores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCores = null;


        try {
            // InternalSpecsDsl.g:326:46: (iv_ruleCores= ruleCores EOF )
            // InternalSpecsDsl.g:327:2: iv_ruleCores= ruleCores EOF
            {
             newCompositeNode(grammarAccess.getCoresRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCores=ruleCores();

            state._fsp--;

             current =iv_ruleCores; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCores"


    // $ANTLR start "ruleCores"
    // InternalSpecsDsl.g:333:1: ruleCores returns [EObject current=null] : (otherlv_0= 'cores' ( (lv_cores_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCores() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cores_1_0=null;


        	enterRule();

        try {
            // InternalSpecsDsl.g:339:2: ( (otherlv_0= 'cores' ( (lv_cores_1_0= RULE_INT ) ) ) )
            // InternalSpecsDsl.g:340:2: (otherlv_0= 'cores' ( (lv_cores_1_0= RULE_INT ) ) )
            {
            // InternalSpecsDsl.g:340:2: (otherlv_0= 'cores' ( (lv_cores_1_0= RULE_INT ) ) )
            // InternalSpecsDsl.g:341:3: otherlv_0= 'cores' ( (lv_cores_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCoresAccess().getCoresKeyword_0());
            		
            // InternalSpecsDsl.g:345:3: ( (lv_cores_1_0= RULE_INT ) )
            // InternalSpecsDsl.g:346:4: (lv_cores_1_0= RULE_INT )
            {
            // InternalSpecsDsl.g:346:4: (lv_cores_1_0= RULE_INT )
            // InternalSpecsDsl.g:347:5: lv_cores_1_0= RULE_INT
            {
            lv_cores_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_cores_1_0, grammarAccess.getCoresAccess().getCoresINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoresRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cores",
            						lv_cores_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCores"


    // $ANTLR start "entryRuleMotherboard"
    // InternalSpecsDsl.g:367:1: entryRuleMotherboard returns [EObject current=null] : iv_ruleMotherboard= ruleMotherboard EOF ;
    public final EObject entryRuleMotherboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotherboard = null;


        try {
            // InternalSpecsDsl.g:367:52: (iv_ruleMotherboard= ruleMotherboard EOF )
            // InternalSpecsDsl.g:368:2: iv_ruleMotherboard= ruleMotherboard EOF
            {
             newCompositeNode(grammarAccess.getMotherboardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotherboard=ruleMotherboard();

            state._fsp--;

             current =iv_ruleMotherboard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMotherboard"


    // $ANTLR start "ruleMotherboard"
    // InternalSpecsDsl.g:374:1: ruleMotherboard returns [EObject current=null] : (otherlv_0= 'Motherboard' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMotherboard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSpecsDsl.g:380:2: ( (otherlv_0= 'Motherboard' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSpecsDsl.g:381:2: (otherlv_0= 'Motherboard' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSpecsDsl.g:381:2: (otherlv_0= 'Motherboard' ( (otherlv_1= RULE_ID ) ) )
            // InternalSpecsDsl.g:382:3: otherlv_0= 'Motherboard' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMotherboardAccess().getMotherboardKeyword_0());
            		
            // InternalSpecsDsl.g:386:3: ( (otherlv_1= RULE_ID ) )
            // InternalSpecsDsl.g:387:4: (otherlv_1= RULE_ID )
            {
            // InternalSpecsDsl.g:387:4: (otherlv_1= RULE_ID )
            // InternalSpecsDsl.g:388:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMotherboardRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMotherboardAccess().getNameMotherboardCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMotherboard"


    // $ANTLR start "entryRuleMemory"
    // InternalSpecsDsl.g:403:1: entryRuleMemory returns [EObject current=null] : iv_ruleMemory= ruleMemory EOF ;
    public final EObject entryRuleMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemory = null;


        try {
            // InternalSpecsDsl.g:403:47: (iv_ruleMemory= ruleMemory EOF )
            // InternalSpecsDsl.g:404:2: iv_ruleMemory= ruleMemory EOF
            {
             newCompositeNode(grammarAccess.getMemoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemory=ruleMemory();

            state._fsp--;

             current =iv_ruleMemory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemory"


    // $ANTLR start "ruleMemory"
    // InternalSpecsDsl.g:410:1: ruleMemory returns [EObject current=null] : (otherlv_0= 'Memory' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_capacity_3_0= ruleCapacity ) ) otherlv_4= '}' ) ;
    public final EObject ruleMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_capacity_3_0 = null;



        	enterRule();

        try {
            // InternalSpecsDsl.g:416:2: ( (otherlv_0= 'Memory' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_capacity_3_0= ruleCapacity ) ) otherlv_4= '}' ) )
            // InternalSpecsDsl.g:417:2: (otherlv_0= 'Memory' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_capacity_3_0= ruleCapacity ) ) otherlv_4= '}' )
            {
            // InternalSpecsDsl.g:417:2: (otherlv_0= 'Memory' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_capacity_3_0= ruleCapacity ) ) otherlv_4= '}' )
            // InternalSpecsDsl.g:418:3: otherlv_0= 'Memory' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_capacity_3_0= ruleCapacity ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMemoryAccess().getMemoryKeyword_0());
            		
            // InternalSpecsDsl.g:422:3: ( (otherlv_1= RULE_ID ) )
            // InternalSpecsDsl.g:423:4: (otherlv_1= RULE_ID )
            {
            // InternalSpecsDsl.g:423:4: (otherlv_1= RULE_ID )
            // InternalSpecsDsl.g:424:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemoryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getMemoryAccess().getNameMemoryCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpecsDsl.g:439:3: ( (lv_capacity_3_0= ruleCapacity ) )
            // InternalSpecsDsl.g:440:4: (lv_capacity_3_0= ruleCapacity )
            {
            // InternalSpecsDsl.g:440:4: (lv_capacity_3_0= ruleCapacity )
            // InternalSpecsDsl.g:441:5: lv_capacity_3_0= ruleCapacity
            {

            					newCompositeNode(grammarAccess.getMemoryAccess().getCapacityCapacityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_capacity_3_0=ruleCapacity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemoryRule());
            					}
            					set(
            						current,
            						"capacity",
            						lv_capacity_3_0,
            						"com.example.specs.SpecsDsl.Capacity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMemoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemory"


    // $ANTLR start "entryRuleCapacity"
    // InternalSpecsDsl.g:466:1: entryRuleCapacity returns [EObject current=null] : iv_ruleCapacity= ruleCapacity EOF ;
    public final EObject entryRuleCapacity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapacity = null;


        try {
            // InternalSpecsDsl.g:466:49: (iv_ruleCapacity= ruleCapacity EOF )
            // InternalSpecsDsl.g:467:2: iv_ruleCapacity= ruleCapacity EOF
            {
             newCompositeNode(grammarAccess.getCapacityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapacity=ruleCapacity();

            state._fsp--;

             current =iv_ruleCapacity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapacity"


    // $ANTLR start "ruleCapacity"
    // InternalSpecsDsl.g:473:1: ruleCapacity returns [EObject current=null] : (otherlv_0= 'capacity' ( (lv_capacity_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCapacity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_capacity_1_0=null;


        	enterRule();

        try {
            // InternalSpecsDsl.g:479:2: ( (otherlv_0= 'capacity' ( (lv_capacity_1_0= RULE_INT ) ) ) )
            // InternalSpecsDsl.g:480:2: (otherlv_0= 'capacity' ( (lv_capacity_1_0= RULE_INT ) ) )
            {
            // InternalSpecsDsl.g:480:2: (otherlv_0= 'capacity' ( (lv_capacity_1_0= RULE_INT ) ) )
            // InternalSpecsDsl.g:481:3: otherlv_0= 'capacity' ( (lv_capacity_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCapacityAccess().getCapacityKeyword_0());
            		
            // InternalSpecsDsl.g:485:3: ( (lv_capacity_1_0= RULE_INT ) )
            // InternalSpecsDsl.g:486:4: (lv_capacity_1_0= RULE_INT )
            {
            // InternalSpecsDsl.g:486:4: (lv_capacity_1_0= RULE_INT )
            // InternalSpecsDsl.g:487:5: lv_capacity_1_0= RULE_INT
            {
            lv_capacity_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_capacity_1_0, grammarAccess.getCapacityAccess().getCapacityINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapacityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capacity",
            						lv_capacity_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapacity"


    // $ANTLR start "entryRuleFLOAT"
    // InternalSpecsDsl.g:507:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalSpecsDsl.g:507:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalSpecsDsl.g:508:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalSpecsDsl.g:514:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSpecsDsl.g:520:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalSpecsDsl.g:521:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalSpecsDsl.g:521:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalSpecsDsl.g:522:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            // InternalSpecsDsl.g:529:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpecsDsl.g:530:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,21,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});

}