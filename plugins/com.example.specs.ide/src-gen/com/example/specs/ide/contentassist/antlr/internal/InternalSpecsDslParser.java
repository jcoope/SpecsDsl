package com.example.specs.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.example.specs.services.SpecsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecsDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Specification'", "':'", "'Processor'", "'{'", "'}'", "'clockSpeed'", "'cores'", "'Motherboard'", "'Memory'", "'capacity'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(SpecsDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSpecsDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:54:1: ( ruleModel EOF )
            // InternalSpecsDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpecsDsl.g:62:1: ruleModel : ( ( rule__Model__SpecsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:66:2: ( ( ( rule__Model__SpecsAssignment )* ) )
            // InternalSpecsDsl.g:67:2: ( ( rule__Model__SpecsAssignment )* )
            {
            // InternalSpecsDsl.g:67:2: ( ( rule__Model__SpecsAssignment )* )
            // InternalSpecsDsl.g:68:3: ( rule__Model__SpecsAssignment )*
            {
             before(grammarAccess.getModelAccess().getSpecsAssignment()); 
            // InternalSpecsDsl.g:69:3: ( rule__Model__SpecsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpecsDsl.g:69:4: rule__Model__SpecsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__SpecsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSpecsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpec"
    // InternalSpecsDsl.g:78:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:79:1: ( ruleSpec EOF )
            // InternalSpecsDsl.g:80:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalSpecsDsl.g:87:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:91:2: ( ( ( rule__Spec__Group__0 ) ) )
            // InternalSpecsDsl.g:92:2: ( ( rule__Spec__Group__0 ) )
            {
            // InternalSpecsDsl.g:92:2: ( ( rule__Spec__Group__0 ) )
            // InternalSpecsDsl.g:93:3: ( rule__Spec__Group__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup()); 
            // InternalSpecsDsl.g:94:3: ( rule__Spec__Group__0 )
            // InternalSpecsDsl.g:94:4: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleProcessor"
    // InternalSpecsDsl.g:103:1: entryRuleProcessor : ruleProcessor EOF ;
    public final void entryRuleProcessor() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:104:1: ( ruleProcessor EOF )
            // InternalSpecsDsl.g:105:1: ruleProcessor EOF
            {
             before(grammarAccess.getProcessorRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessor();

            state._fsp--;

             after(grammarAccess.getProcessorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // InternalSpecsDsl.g:112:1: ruleProcessor : ( ( rule__Processor__Group__0 ) ) ;
    public final void ruleProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:116:2: ( ( ( rule__Processor__Group__0 ) ) )
            // InternalSpecsDsl.g:117:2: ( ( rule__Processor__Group__0 ) )
            {
            // InternalSpecsDsl.g:117:2: ( ( rule__Processor__Group__0 ) )
            // InternalSpecsDsl.g:118:3: ( rule__Processor__Group__0 )
            {
             before(grammarAccess.getProcessorAccess().getGroup()); 
            // InternalSpecsDsl.g:119:3: ( rule__Processor__Group__0 )
            // InternalSpecsDsl.g:119:4: rule__Processor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Processor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleClockSpeed"
    // InternalSpecsDsl.g:128:1: entryRuleClockSpeed : ruleClockSpeed EOF ;
    public final void entryRuleClockSpeed() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:129:1: ( ruleClockSpeed EOF )
            // InternalSpecsDsl.g:130:1: ruleClockSpeed EOF
            {
             before(grammarAccess.getClockSpeedRule()); 
            pushFollow(FOLLOW_1);
            ruleClockSpeed();

            state._fsp--;

             after(grammarAccess.getClockSpeedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClockSpeed"


    // $ANTLR start "ruleClockSpeed"
    // InternalSpecsDsl.g:137:1: ruleClockSpeed : ( ( rule__ClockSpeed__Group__0 ) ) ;
    public final void ruleClockSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:141:2: ( ( ( rule__ClockSpeed__Group__0 ) ) )
            // InternalSpecsDsl.g:142:2: ( ( rule__ClockSpeed__Group__0 ) )
            {
            // InternalSpecsDsl.g:142:2: ( ( rule__ClockSpeed__Group__0 ) )
            // InternalSpecsDsl.g:143:3: ( rule__ClockSpeed__Group__0 )
            {
             before(grammarAccess.getClockSpeedAccess().getGroup()); 
            // InternalSpecsDsl.g:144:3: ( rule__ClockSpeed__Group__0 )
            // InternalSpecsDsl.g:144:4: rule__ClockSpeed__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClockSpeed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClockSpeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClockSpeed"


    // $ANTLR start "entryRuleCores"
    // InternalSpecsDsl.g:153:1: entryRuleCores : ruleCores EOF ;
    public final void entryRuleCores() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:154:1: ( ruleCores EOF )
            // InternalSpecsDsl.g:155:1: ruleCores EOF
            {
             before(grammarAccess.getCoresRule()); 
            pushFollow(FOLLOW_1);
            ruleCores();

            state._fsp--;

             after(grammarAccess.getCoresRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCores"


    // $ANTLR start "ruleCores"
    // InternalSpecsDsl.g:162:1: ruleCores : ( ( rule__Cores__Group__0 ) ) ;
    public final void ruleCores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:166:2: ( ( ( rule__Cores__Group__0 ) ) )
            // InternalSpecsDsl.g:167:2: ( ( rule__Cores__Group__0 ) )
            {
            // InternalSpecsDsl.g:167:2: ( ( rule__Cores__Group__0 ) )
            // InternalSpecsDsl.g:168:3: ( rule__Cores__Group__0 )
            {
             before(grammarAccess.getCoresAccess().getGroup()); 
            // InternalSpecsDsl.g:169:3: ( rule__Cores__Group__0 )
            // InternalSpecsDsl.g:169:4: rule__Cores__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cores__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoresAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCores"


    // $ANTLR start "entryRuleMotherboard"
    // InternalSpecsDsl.g:178:1: entryRuleMotherboard : ruleMotherboard EOF ;
    public final void entryRuleMotherboard() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:179:1: ( ruleMotherboard EOF )
            // InternalSpecsDsl.g:180:1: ruleMotherboard EOF
            {
             before(grammarAccess.getMotherboardRule()); 
            pushFollow(FOLLOW_1);
            ruleMotherboard();

            state._fsp--;

             after(grammarAccess.getMotherboardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMotherboard"


    // $ANTLR start "ruleMotherboard"
    // InternalSpecsDsl.g:187:1: ruleMotherboard : ( ( rule__Motherboard__Group__0 ) ) ;
    public final void ruleMotherboard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:191:2: ( ( ( rule__Motherboard__Group__0 ) ) )
            // InternalSpecsDsl.g:192:2: ( ( rule__Motherboard__Group__0 ) )
            {
            // InternalSpecsDsl.g:192:2: ( ( rule__Motherboard__Group__0 ) )
            // InternalSpecsDsl.g:193:3: ( rule__Motherboard__Group__0 )
            {
             before(grammarAccess.getMotherboardAccess().getGroup()); 
            // InternalSpecsDsl.g:194:3: ( rule__Motherboard__Group__0 )
            // InternalSpecsDsl.g:194:4: rule__Motherboard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Motherboard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMotherboardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMotherboard"


    // $ANTLR start "entryRuleMemory"
    // InternalSpecsDsl.g:203:1: entryRuleMemory : ruleMemory EOF ;
    public final void entryRuleMemory() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:204:1: ( ruleMemory EOF )
            // InternalSpecsDsl.g:205:1: ruleMemory EOF
            {
             before(grammarAccess.getMemoryRule()); 
            pushFollow(FOLLOW_1);
            ruleMemory();

            state._fsp--;

             after(grammarAccess.getMemoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemory"


    // $ANTLR start "ruleMemory"
    // InternalSpecsDsl.g:212:1: ruleMemory : ( ( rule__Memory__Group__0 ) ) ;
    public final void ruleMemory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:216:2: ( ( ( rule__Memory__Group__0 ) ) )
            // InternalSpecsDsl.g:217:2: ( ( rule__Memory__Group__0 ) )
            {
            // InternalSpecsDsl.g:217:2: ( ( rule__Memory__Group__0 ) )
            // InternalSpecsDsl.g:218:3: ( rule__Memory__Group__0 )
            {
             before(grammarAccess.getMemoryAccess().getGroup()); 
            // InternalSpecsDsl.g:219:3: ( rule__Memory__Group__0 )
            // InternalSpecsDsl.g:219:4: rule__Memory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Memory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemory"


    // $ANTLR start "entryRuleCapacity"
    // InternalSpecsDsl.g:228:1: entryRuleCapacity : ruleCapacity EOF ;
    public final void entryRuleCapacity() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:229:1: ( ruleCapacity EOF )
            // InternalSpecsDsl.g:230:1: ruleCapacity EOF
            {
             before(grammarAccess.getCapacityRule()); 
            pushFollow(FOLLOW_1);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getCapacityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapacity"


    // $ANTLR start "ruleCapacity"
    // InternalSpecsDsl.g:237:1: ruleCapacity : ( ( rule__Capacity__Group__0 ) ) ;
    public final void ruleCapacity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:241:2: ( ( ( rule__Capacity__Group__0 ) ) )
            // InternalSpecsDsl.g:242:2: ( ( rule__Capacity__Group__0 ) )
            {
            // InternalSpecsDsl.g:242:2: ( ( rule__Capacity__Group__0 ) )
            // InternalSpecsDsl.g:243:3: ( rule__Capacity__Group__0 )
            {
             before(grammarAccess.getCapacityAccess().getGroup()); 
            // InternalSpecsDsl.g:244:3: ( rule__Capacity__Group__0 )
            // InternalSpecsDsl.g:244:4: rule__Capacity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapacityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapacity"


    // $ANTLR start "entryRuleFLOAT"
    // InternalSpecsDsl.g:253:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalSpecsDsl.g:254:1: ( ruleFLOAT EOF )
            // InternalSpecsDsl.g:255:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalSpecsDsl.g:262:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:266:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalSpecsDsl.g:267:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalSpecsDsl.g:267:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalSpecsDsl.g:268:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalSpecsDsl.g:269:3: ( rule__FLOAT__Group__0 )
            // InternalSpecsDsl.g:269:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "rule__Spec__Group__0"
    // InternalSpecsDsl.g:277:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:281:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // InternalSpecsDsl.g:282:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0"


    // $ANTLR start "rule__Spec__Group__0__Impl"
    // InternalSpecsDsl.g:289:1: rule__Spec__Group__0__Impl : ( 'Specification' ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:293:1: ( ( 'Specification' ) )
            // InternalSpecsDsl.g:294:1: ( 'Specification' )
            {
            // InternalSpecsDsl.g:294:1: ( 'Specification' )
            // InternalSpecsDsl.g:295:2: 'Specification'
            {
             before(grammarAccess.getSpecAccess().getSpecificationKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getSpecificationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0__Impl"


    // $ANTLR start "rule__Spec__Group__1"
    // InternalSpecsDsl.g:304:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl rule__Spec__Group__2 ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:308:1: ( rule__Spec__Group__1__Impl rule__Spec__Group__2 )
            // InternalSpecsDsl.g:309:2: rule__Spec__Group__1__Impl rule__Spec__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Spec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1"


    // $ANTLR start "rule__Spec__Group__1__Impl"
    // InternalSpecsDsl.g:316:1: rule__Spec__Group__1__Impl : ( ( rule__Spec__NameAssignment_1 ) ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:320:1: ( ( ( rule__Spec__NameAssignment_1 ) ) )
            // InternalSpecsDsl.g:321:1: ( ( rule__Spec__NameAssignment_1 ) )
            {
            // InternalSpecsDsl.g:321:1: ( ( rule__Spec__NameAssignment_1 ) )
            // InternalSpecsDsl.g:322:2: ( rule__Spec__NameAssignment_1 )
            {
             before(grammarAccess.getSpecAccess().getNameAssignment_1()); 
            // InternalSpecsDsl.g:323:2: ( rule__Spec__NameAssignment_1 )
            // InternalSpecsDsl.g:323:3: rule__Spec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Spec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1__Impl"


    // $ANTLR start "rule__Spec__Group__2"
    // InternalSpecsDsl.g:331:1: rule__Spec__Group__2 : rule__Spec__Group__2__Impl rule__Spec__Group__3 ;
    public final void rule__Spec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:335:1: ( rule__Spec__Group__2__Impl rule__Spec__Group__3 )
            // InternalSpecsDsl.g:336:2: rule__Spec__Group__2__Impl rule__Spec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Spec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__2"


    // $ANTLR start "rule__Spec__Group__2__Impl"
    // InternalSpecsDsl.g:343:1: rule__Spec__Group__2__Impl : ( ':' ) ;
    public final void rule__Spec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:347:1: ( ( ':' ) )
            // InternalSpecsDsl.g:348:1: ( ':' )
            {
            // InternalSpecsDsl.g:348:1: ( ':' )
            // InternalSpecsDsl.g:349:2: ':'
            {
             before(grammarAccess.getSpecAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__2__Impl"


    // $ANTLR start "rule__Spec__Group__3"
    // InternalSpecsDsl.g:358:1: rule__Spec__Group__3 : rule__Spec__Group__3__Impl rule__Spec__Group__4 ;
    public final void rule__Spec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:362:1: ( rule__Spec__Group__3__Impl rule__Spec__Group__4 )
            // InternalSpecsDsl.g:363:2: rule__Spec__Group__3__Impl rule__Spec__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Spec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__3"


    // $ANTLR start "rule__Spec__Group__3__Impl"
    // InternalSpecsDsl.g:370:1: rule__Spec__Group__3__Impl : ( ( rule__Spec__ProcessorAssignment_3 ) ) ;
    public final void rule__Spec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:374:1: ( ( ( rule__Spec__ProcessorAssignment_3 ) ) )
            // InternalSpecsDsl.g:375:1: ( ( rule__Spec__ProcessorAssignment_3 ) )
            {
            // InternalSpecsDsl.g:375:1: ( ( rule__Spec__ProcessorAssignment_3 ) )
            // InternalSpecsDsl.g:376:2: ( rule__Spec__ProcessorAssignment_3 )
            {
             before(grammarAccess.getSpecAccess().getProcessorAssignment_3()); 
            // InternalSpecsDsl.g:377:2: ( rule__Spec__ProcessorAssignment_3 )
            // InternalSpecsDsl.g:377:3: rule__Spec__ProcessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Spec__ProcessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getProcessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__3__Impl"


    // $ANTLR start "rule__Spec__Group__4"
    // InternalSpecsDsl.g:385:1: rule__Spec__Group__4 : rule__Spec__Group__4__Impl rule__Spec__Group__5 ;
    public final void rule__Spec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:389:1: ( rule__Spec__Group__4__Impl rule__Spec__Group__5 )
            // InternalSpecsDsl.g:390:2: rule__Spec__Group__4__Impl rule__Spec__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Spec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__4"


    // $ANTLR start "rule__Spec__Group__4__Impl"
    // InternalSpecsDsl.g:397:1: rule__Spec__Group__4__Impl : ( ( rule__Spec__MotherboardAssignment_4 ) ) ;
    public final void rule__Spec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:401:1: ( ( ( rule__Spec__MotherboardAssignment_4 ) ) )
            // InternalSpecsDsl.g:402:1: ( ( rule__Spec__MotherboardAssignment_4 ) )
            {
            // InternalSpecsDsl.g:402:1: ( ( rule__Spec__MotherboardAssignment_4 ) )
            // InternalSpecsDsl.g:403:2: ( rule__Spec__MotherboardAssignment_4 )
            {
             before(grammarAccess.getSpecAccess().getMotherboardAssignment_4()); 
            // InternalSpecsDsl.g:404:2: ( rule__Spec__MotherboardAssignment_4 )
            // InternalSpecsDsl.g:404:3: rule__Spec__MotherboardAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Spec__MotherboardAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getMotherboardAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__4__Impl"


    // $ANTLR start "rule__Spec__Group__5"
    // InternalSpecsDsl.g:412:1: rule__Spec__Group__5 : rule__Spec__Group__5__Impl ;
    public final void rule__Spec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:416:1: ( rule__Spec__Group__5__Impl )
            // InternalSpecsDsl.g:417:2: rule__Spec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__5"


    // $ANTLR start "rule__Spec__Group__5__Impl"
    // InternalSpecsDsl.g:423:1: rule__Spec__Group__5__Impl : ( ( rule__Spec__MemoriesAssignment_5 )* ) ;
    public final void rule__Spec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:427:1: ( ( ( rule__Spec__MemoriesAssignment_5 )* ) )
            // InternalSpecsDsl.g:428:1: ( ( rule__Spec__MemoriesAssignment_5 )* )
            {
            // InternalSpecsDsl.g:428:1: ( ( rule__Spec__MemoriesAssignment_5 )* )
            // InternalSpecsDsl.g:429:2: ( rule__Spec__MemoriesAssignment_5 )*
            {
             before(grammarAccess.getSpecAccess().getMemoriesAssignment_5()); 
            // InternalSpecsDsl.g:430:2: ( rule__Spec__MemoriesAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpecsDsl.g:430:3: rule__Spec__MemoriesAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Spec__MemoriesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSpecAccess().getMemoriesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__5__Impl"


    // $ANTLR start "rule__Processor__Group__0"
    // InternalSpecsDsl.g:439:1: rule__Processor__Group__0 : rule__Processor__Group__0__Impl rule__Processor__Group__1 ;
    public final void rule__Processor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:443:1: ( rule__Processor__Group__0__Impl rule__Processor__Group__1 )
            // InternalSpecsDsl.g:444:2: rule__Processor__Group__0__Impl rule__Processor__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Processor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Processor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__0"


    // $ANTLR start "rule__Processor__Group__0__Impl"
    // InternalSpecsDsl.g:451:1: rule__Processor__Group__0__Impl : ( 'Processor' ) ;
    public final void rule__Processor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:455:1: ( ( 'Processor' ) )
            // InternalSpecsDsl.g:456:1: ( 'Processor' )
            {
            // InternalSpecsDsl.g:456:1: ( 'Processor' )
            // InternalSpecsDsl.g:457:2: 'Processor'
            {
             before(grammarAccess.getProcessorAccess().getProcessorKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProcessorAccess().getProcessorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__0__Impl"


    // $ANTLR start "rule__Processor__Group__1"
    // InternalSpecsDsl.g:466:1: rule__Processor__Group__1 : rule__Processor__Group__1__Impl rule__Processor__Group__2 ;
    public final void rule__Processor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:470:1: ( rule__Processor__Group__1__Impl rule__Processor__Group__2 )
            // InternalSpecsDsl.g:471:2: rule__Processor__Group__1__Impl rule__Processor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Processor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Processor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__1"


    // $ANTLR start "rule__Processor__Group__1__Impl"
    // InternalSpecsDsl.g:478:1: rule__Processor__Group__1__Impl : ( ( rule__Processor__NameAssignment_1 ) ) ;
    public final void rule__Processor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:482:1: ( ( ( rule__Processor__NameAssignment_1 ) ) )
            // InternalSpecsDsl.g:483:1: ( ( rule__Processor__NameAssignment_1 ) )
            {
            // InternalSpecsDsl.g:483:1: ( ( rule__Processor__NameAssignment_1 ) )
            // InternalSpecsDsl.g:484:2: ( rule__Processor__NameAssignment_1 )
            {
             before(grammarAccess.getProcessorAccess().getNameAssignment_1()); 
            // InternalSpecsDsl.g:485:2: ( rule__Processor__NameAssignment_1 )
            // InternalSpecsDsl.g:485:3: rule__Processor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Processor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__1__Impl"


    // $ANTLR start "rule__Processor__Group__2"
    // InternalSpecsDsl.g:493:1: rule__Processor__Group__2 : rule__Processor__Group__2__Impl rule__Processor__Group__3 ;
    public final void rule__Processor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:497:1: ( rule__Processor__Group__2__Impl rule__Processor__Group__3 )
            // InternalSpecsDsl.g:498:2: rule__Processor__Group__2__Impl rule__Processor__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Processor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Processor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__2"


    // $ANTLR start "rule__Processor__Group__2__Impl"
    // InternalSpecsDsl.g:505:1: rule__Processor__Group__2__Impl : ( '{' ) ;
    public final void rule__Processor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:509:1: ( ( '{' ) )
            // InternalSpecsDsl.g:510:1: ( '{' )
            {
            // InternalSpecsDsl.g:510:1: ( '{' )
            // InternalSpecsDsl.g:511:2: '{'
            {
             before(grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__2__Impl"


    // $ANTLR start "rule__Processor__Group__3"
    // InternalSpecsDsl.g:520:1: rule__Processor__Group__3 : rule__Processor__Group__3__Impl rule__Processor__Group__4 ;
    public final void rule__Processor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:524:1: ( rule__Processor__Group__3__Impl rule__Processor__Group__4 )
            // InternalSpecsDsl.g:525:2: rule__Processor__Group__3__Impl rule__Processor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Processor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Processor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__3"


    // $ANTLR start "rule__Processor__Group__3__Impl"
    // InternalSpecsDsl.g:532:1: rule__Processor__Group__3__Impl : ( ( rule__Processor__ClockSpeedAssignment_3 ) ) ;
    public final void rule__Processor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:536:1: ( ( ( rule__Processor__ClockSpeedAssignment_3 ) ) )
            // InternalSpecsDsl.g:537:1: ( ( rule__Processor__ClockSpeedAssignment_3 ) )
            {
            // InternalSpecsDsl.g:537:1: ( ( rule__Processor__ClockSpeedAssignment_3 ) )
            // InternalSpecsDsl.g:538:2: ( rule__Processor__ClockSpeedAssignment_3 )
            {
             before(grammarAccess.getProcessorAccess().getClockSpeedAssignment_3()); 
            // InternalSpecsDsl.g:539:2: ( rule__Processor__ClockSpeedAssignment_3 )
            // InternalSpecsDsl.g:539:3: rule__Processor__ClockSpeedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Processor__ClockSpeedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccess().getClockSpeedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__3__Impl"


    // $ANTLR start "rule__Processor__Group__4"
    // InternalSpecsDsl.g:547:1: rule__Processor__Group__4 : rule__Processor__Group__4__Impl rule__Processor__Group__5 ;
    public final void rule__Processor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:551:1: ( rule__Processor__Group__4__Impl rule__Processor__Group__5 )
            // InternalSpecsDsl.g:552:2: rule__Processor__Group__4__Impl rule__Processor__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Processor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Processor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__4"


    // $ANTLR start "rule__Processor__Group__4__Impl"
    // InternalSpecsDsl.g:559:1: rule__Processor__Group__4__Impl : ( ( rule__Processor__CoresAssignment_4 ) ) ;
    public final void rule__Processor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:563:1: ( ( ( rule__Processor__CoresAssignment_4 ) ) )
            // InternalSpecsDsl.g:564:1: ( ( rule__Processor__CoresAssignment_4 ) )
            {
            // InternalSpecsDsl.g:564:1: ( ( rule__Processor__CoresAssignment_4 ) )
            // InternalSpecsDsl.g:565:2: ( rule__Processor__CoresAssignment_4 )
            {
             before(grammarAccess.getProcessorAccess().getCoresAssignment_4()); 
            // InternalSpecsDsl.g:566:2: ( rule__Processor__CoresAssignment_4 )
            // InternalSpecsDsl.g:566:3: rule__Processor__CoresAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Processor__CoresAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccess().getCoresAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__4__Impl"


    // $ANTLR start "rule__Processor__Group__5"
    // InternalSpecsDsl.g:574:1: rule__Processor__Group__5 : rule__Processor__Group__5__Impl ;
    public final void rule__Processor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:578:1: ( rule__Processor__Group__5__Impl )
            // InternalSpecsDsl.g:579:2: rule__Processor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Processor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__5"


    // $ANTLR start "rule__Processor__Group__5__Impl"
    // InternalSpecsDsl.g:585:1: rule__Processor__Group__5__Impl : ( '}' ) ;
    public final void rule__Processor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:589:1: ( ( '}' ) )
            // InternalSpecsDsl.g:590:1: ( '}' )
            {
            // InternalSpecsDsl.g:590:1: ( '}' )
            // InternalSpecsDsl.g:591:2: '}'
            {
             before(grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__5__Impl"


    // $ANTLR start "rule__ClockSpeed__Group__0"
    // InternalSpecsDsl.g:601:1: rule__ClockSpeed__Group__0 : rule__ClockSpeed__Group__0__Impl rule__ClockSpeed__Group__1 ;
    public final void rule__ClockSpeed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:605:1: ( rule__ClockSpeed__Group__0__Impl rule__ClockSpeed__Group__1 )
            // InternalSpecsDsl.g:606:2: rule__ClockSpeed__Group__0__Impl rule__ClockSpeed__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ClockSpeed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClockSpeed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClockSpeed__Group__0"


    // $ANTLR start "rule__ClockSpeed__Group__0__Impl"
    // InternalSpecsDsl.g:613:1: rule__ClockSpeed__Group__0__Impl : ( 'clockSpeed' ) ;
    public final void rule__ClockSpeed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:617:1: ( ( 'clockSpeed' ) )
            // InternalSpecsDsl.g:618:1: ( 'clockSpeed' )
            {
            // InternalSpecsDsl.g:618:1: ( 'clockSpeed' )
            // InternalSpecsDsl.g:619:2: 'clockSpeed'
            {
             before(grammarAccess.getClockSpeedAccess().getClockSpeedKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClockSpeedAccess().getClockSpeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClockSpeed__Group__0__Impl"


    // $ANTLR start "rule__ClockSpeed__Group__1"
    // InternalSpecsDsl.g:628:1: rule__ClockSpeed__Group__1 : rule__ClockSpeed__Group__1__Impl ;
    public final void rule__ClockSpeed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:632:1: ( rule__ClockSpeed__Group__1__Impl )
            // InternalSpecsDsl.g:633:2: rule__ClockSpeed__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClockSpeed__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClockSpeed__Group__1"


    // $ANTLR start "rule__ClockSpeed__Group__1__Impl"
    // InternalSpecsDsl.g:639:1: rule__ClockSpeed__Group__1__Impl : ( ( rule__ClockSpeed__ClockSpeedAssignment_1 ) ) ;
    public final void rule__ClockSpeed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:643:1: ( ( ( rule__ClockSpeed__ClockSpeedAssignment_1 ) ) )
            // InternalSpecsDsl.g:644:1: ( ( rule__ClockSpeed__ClockSpeedAssignment_1 ) )
            {
            // InternalSpecsDsl.g:644:1: ( ( rule__ClockSpeed__ClockSpeedAssignment_1 ) )
            // InternalSpecsDsl.g:645:2: ( rule__ClockSpeed__ClockSpeedAssignment_1 )
            {
             before(grammarAccess.getClockSpeedAccess().getClockSpeedAssignment_1()); 
            // InternalSpecsDsl.g:646:2: ( rule__ClockSpeed__ClockSpeedAssignment_1 )
            // InternalSpecsDsl.g:646:3: rule__ClockSpeed__ClockSpeedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClockSpeed__ClockSpeedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClockSpeedAccess().getClockSpeedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClockSpeed__Group__1__Impl"


    // $ANTLR start "rule__Cores__Group__0"
    // InternalSpecsDsl.g:655:1: rule__Cores__Group__0 : rule__Cores__Group__0__Impl rule__Cores__Group__1 ;
    public final void rule__Cores__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:659:1: ( rule__Cores__Group__0__Impl rule__Cores__Group__1 )
            // InternalSpecsDsl.g:660:2: rule__Cores__Group__0__Impl rule__Cores__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Cores__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cores__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cores__Group__0"


    // $ANTLR start "rule__Cores__Group__0__Impl"
    // InternalSpecsDsl.g:667:1: rule__Cores__Group__0__Impl : ( 'cores' ) ;
    public final void rule__Cores__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:671:1: ( ( 'cores' ) )
            // InternalSpecsDsl.g:672:1: ( 'cores' )
            {
            // InternalSpecsDsl.g:672:1: ( 'cores' )
            // InternalSpecsDsl.g:673:2: 'cores'
            {
             before(grammarAccess.getCoresAccess().getCoresKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCoresAccess().getCoresKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cores__Group__0__Impl"


    // $ANTLR start "rule__Cores__Group__1"
    // InternalSpecsDsl.g:682:1: rule__Cores__Group__1 : rule__Cores__Group__1__Impl ;
    public final void rule__Cores__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:686:1: ( rule__Cores__Group__1__Impl )
            // InternalSpecsDsl.g:687:2: rule__Cores__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cores__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cores__Group__1"


    // $ANTLR start "rule__Cores__Group__1__Impl"
    // InternalSpecsDsl.g:693:1: rule__Cores__Group__1__Impl : ( ( rule__Cores__CoresAssignment_1 ) ) ;
    public final void rule__Cores__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:697:1: ( ( ( rule__Cores__CoresAssignment_1 ) ) )
            // InternalSpecsDsl.g:698:1: ( ( rule__Cores__CoresAssignment_1 ) )
            {
            // InternalSpecsDsl.g:698:1: ( ( rule__Cores__CoresAssignment_1 ) )
            // InternalSpecsDsl.g:699:2: ( rule__Cores__CoresAssignment_1 )
            {
             before(grammarAccess.getCoresAccess().getCoresAssignment_1()); 
            // InternalSpecsDsl.g:700:2: ( rule__Cores__CoresAssignment_1 )
            // InternalSpecsDsl.g:700:3: rule__Cores__CoresAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cores__CoresAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoresAccess().getCoresAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cores__Group__1__Impl"


    // $ANTLR start "rule__Motherboard__Group__0"
    // InternalSpecsDsl.g:709:1: rule__Motherboard__Group__0 : rule__Motherboard__Group__0__Impl rule__Motherboard__Group__1 ;
    public final void rule__Motherboard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:713:1: ( rule__Motherboard__Group__0__Impl rule__Motherboard__Group__1 )
            // InternalSpecsDsl.g:714:2: rule__Motherboard__Group__0__Impl rule__Motherboard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Motherboard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motherboard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motherboard__Group__0"


    // $ANTLR start "rule__Motherboard__Group__0__Impl"
    // InternalSpecsDsl.g:721:1: rule__Motherboard__Group__0__Impl : ( 'Motherboard' ) ;
    public final void rule__Motherboard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:725:1: ( ( 'Motherboard' ) )
            // InternalSpecsDsl.g:726:1: ( 'Motherboard' )
            {
            // InternalSpecsDsl.g:726:1: ( 'Motherboard' )
            // InternalSpecsDsl.g:727:2: 'Motherboard'
            {
             before(grammarAccess.getMotherboardAccess().getMotherboardKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMotherboardAccess().getMotherboardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motherboard__Group__0__Impl"


    // $ANTLR start "rule__Motherboard__Group__1"
    // InternalSpecsDsl.g:736:1: rule__Motherboard__Group__1 : rule__Motherboard__Group__1__Impl ;
    public final void rule__Motherboard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:740:1: ( rule__Motherboard__Group__1__Impl )
            // InternalSpecsDsl.g:741:2: rule__Motherboard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Motherboard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motherboard__Group__1"


    // $ANTLR start "rule__Motherboard__Group__1__Impl"
    // InternalSpecsDsl.g:747:1: rule__Motherboard__Group__1__Impl : ( ( rule__Motherboard__NameAssignment_1 ) ) ;
    public final void rule__Motherboard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:751:1: ( ( ( rule__Motherboard__NameAssignment_1 ) ) )
            // InternalSpecsDsl.g:752:1: ( ( rule__Motherboard__NameAssignment_1 ) )
            {
            // InternalSpecsDsl.g:752:1: ( ( rule__Motherboard__NameAssignment_1 ) )
            // InternalSpecsDsl.g:753:2: ( rule__Motherboard__NameAssignment_1 )
            {
             before(grammarAccess.getMotherboardAccess().getNameAssignment_1()); 
            // InternalSpecsDsl.g:754:2: ( rule__Motherboard__NameAssignment_1 )
            // InternalSpecsDsl.g:754:3: rule__Motherboard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Motherboard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMotherboardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motherboard__Group__1__Impl"


    // $ANTLR start "rule__Memory__Group__0"
    // InternalSpecsDsl.g:763:1: rule__Memory__Group__0 : rule__Memory__Group__0__Impl rule__Memory__Group__1 ;
    public final void rule__Memory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:767:1: ( rule__Memory__Group__0__Impl rule__Memory__Group__1 )
            // InternalSpecsDsl.g:768:2: rule__Memory__Group__0__Impl rule__Memory__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Memory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__0"


    // $ANTLR start "rule__Memory__Group__0__Impl"
    // InternalSpecsDsl.g:775:1: rule__Memory__Group__0__Impl : ( 'Memory' ) ;
    public final void rule__Memory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:779:1: ( ( 'Memory' ) )
            // InternalSpecsDsl.g:780:1: ( 'Memory' )
            {
            // InternalSpecsDsl.g:780:1: ( 'Memory' )
            // InternalSpecsDsl.g:781:2: 'Memory'
            {
             before(grammarAccess.getMemoryAccess().getMemoryKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMemoryAccess().getMemoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__0__Impl"


    // $ANTLR start "rule__Memory__Group__1"
    // InternalSpecsDsl.g:790:1: rule__Memory__Group__1 : rule__Memory__Group__1__Impl rule__Memory__Group__2 ;
    public final void rule__Memory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:794:1: ( rule__Memory__Group__1__Impl rule__Memory__Group__2 )
            // InternalSpecsDsl.g:795:2: rule__Memory__Group__1__Impl rule__Memory__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Memory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__1"


    // $ANTLR start "rule__Memory__Group__1__Impl"
    // InternalSpecsDsl.g:802:1: rule__Memory__Group__1__Impl : ( ( rule__Memory__NameAssignment_1 ) ) ;
    public final void rule__Memory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:806:1: ( ( ( rule__Memory__NameAssignment_1 ) ) )
            // InternalSpecsDsl.g:807:1: ( ( rule__Memory__NameAssignment_1 ) )
            {
            // InternalSpecsDsl.g:807:1: ( ( rule__Memory__NameAssignment_1 ) )
            // InternalSpecsDsl.g:808:2: ( rule__Memory__NameAssignment_1 )
            {
             before(grammarAccess.getMemoryAccess().getNameAssignment_1()); 
            // InternalSpecsDsl.g:809:2: ( rule__Memory__NameAssignment_1 )
            // InternalSpecsDsl.g:809:3: rule__Memory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Memory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__1__Impl"


    // $ANTLR start "rule__Memory__Group__2"
    // InternalSpecsDsl.g:817:1: rule__Memory__Group__2 : rule__Memory__Group__2__Impl rule__Memory__Group__3 ;
    public final void rule__Memory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:821:1: ( rule__Memory__Group__2__Impl rule__Memory__Group__3 )
            // InternalSpecsDsl.g:822:2: rule__Memory__Group__2__Impl rule__Memory__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Memory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__2"


    // $ANTLR start "rule__Memory__Group__2__Impl"
    // InternalSpecsDsl.g:829:1: rule__Memory__Group__2__Impl : ( '{' ) ;
    public final void rule__Memory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:833:1: ( ( '{' ) )
            // InternalSpecsDsl.g:834:1: ( '{' )
            {
            // InternalSpecsDsl.g:834:1: ( '{' )
            // InternalSpecsDsl.g:835:2: '{'
            {
             before(grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__2__Impl"


    // $ANTLR start "rule__Memory__Group__3"
    // InternalSpecsDsl.g:844:1: rule__Memory__Group__3 : rule__Memory__Group__3__Impl rule__Memory__Group__4 ;
    public final void rule__Memory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:848:1: ( rule__Memory__Group__3__Impl rule__Memory__Group__4 )
            // InternalSpecsDsl.g:849:2: rule__Memory__Group__3__Impl rule__Memory__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Memory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Memory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__3"


    // $ANTLR start "rule__Memory__Group__3__Impl"
    // InternalSpecsDsl.g:856:1: rule__Memory__Group__3__Impl : ( ( rule__Memory__CapacityAssignment_3 ) ) ;
    public final void rule__Memory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:860:1: ( ( ( rule__Memory__CapacityAssignment_3 ) ) )
            // InternalSpecsDsl.g:861:1: ( ( rule__Memory__CapacityAssignment_3 ) )
            {
            // InternalSpecsDsl.g:861:1: ( ( rule__Memory__CapacityAssignment_3 ) )
            // InternalSpecsDsl.g:862:2: ( rule__Memory__CapacityAssignment_3 )
            {
             before(grammarAccess.getMemoryAccess().getCapacityAssignment_3()); 
            // InternalSpecsDsl.g:863:2: ( rule__Memory__CapacityAssignment_3 )
            // InternalSpecsDsl.g:863:3: rule__Memory__CapacityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Memory__CapacityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemoryAccess().getCapacityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__3__Impl"


    // $ANTLR start "rule__Memory__Group__4"
    // InternalSpecsDsl.g:871:1: rule__Memory__Group__4 : rule__Memory__Group__4__Impl ;
    public final void rule__Memory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:875:1: ( rule__Memory__Group__4__Impl )
            // InternalSpecsDsl.g:876:2: rule__Memory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Memory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__4"


    // $ANTLR start "rule__Memory__Group__4__Impl"
    // InternalSpecsDsl.g:882:1: rule__Memory__Group__4__Impl : ( '}' ) ;
    public final void rule__Memory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:886:1: ( ( '}' ) )
            // InternalSpecsDsl.g:887:1: ( '}' )
            {
            // InternalSpecsDsl.g:887:1: ( '}' )
            // InternalSpecsDsl.g:888:2: '}'
            {
             before(grammarAccess.getMemoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__Group__4__Impl"


    // $ANTLR start "rule__Capacity__Group__0"
    // InternalSpecsDsl.g:898:1: rule__Capacity__Group__0 : rule__Capacity__Group__0__Impl rule__Capacity__Group__1 ;
    public final void rule__Capacity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:902:1: ( rule__Capacity__Group__0__Impl rule__Capacity__Group__1 )
            // InternalSpecsDsl.g:903:2: rule__Capacity__Group__0__Impl rule__Capacity__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Capacity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capacity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capacity__Group__0"


    // $ANTLR start "rule__Capacity__Group__0__Impl"
    // InternalSpecsDsl.g:910:1: rule__Capacity__Group__0__Impl : ( 'capacity' ) ;
    public final void rule__Capacity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:914:1: ( ( 'capacity' ) )
            // InternalSpecsDsl.g:915:1: ( 'capacity' )
            {
            // InternalSpecsDsl.g:915:1: ( 'capacity' )
            // InternalSpecsDsl.g:916:2: 'capacity'
            {
             before(grammarAccess.getCapacityAccess().getCapacityKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCapacityAccess().getCapacityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capacity__Group__0__Impl"


    // $ANTLR start "rule__Capacity__Group__1"
    // InternalSpecsDsl.g:925:1: rule__Capacity__Group__1 : rule__Capacity__Group__1__Impl ;
    public final void rule__Capacity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:929:1: ( rule__Capacity__Group__1__Impl )
            // InternalSpecsDsl.g:930:2: rule__Capacity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capacity__Group__1"


    // $ANTLR start "rule__Capacity__Group__1__Impl"
    // InternalSpecsDsl.g:936:1: rule__Capacity__Group__1__Impl : ( ( rule__Capacity__CapacityAssignment_1 ) ) ;
    public final void rule__Capacity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:940:1: ( ( ( rule__Capacity__CapacityAssignment_1 ) ) )
            // InternalSpecsDsl.g:941:1: ( ( rule__Capacity__CapacityAssignment_1 ) )
            {
            // InternalSpecsDsl.g:941:1: ( ( rule__Capacity__CapacityAssignment_1 ) )
            // InternalSpecsDsl.g:942:2: ( rule__Capacity__CapacityAssignment_1 )
            {
             before(grammarAccess.getCapacityAccess().getCapacityAssignment_1()); 
            // InternalSpecsDsl.g:943:2: ( rule__Capacity__CapacityAssignment_1 )
            // InternalSpecsDsl.g:943:3: rule__Capacity__CapacityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__CapacityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCapacityAccess().getCapacityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capacity__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalSpecsDsl.g:952:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:956:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalSpecsDsl.g:957:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalSpecsDsl.g:964:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:968:1: ( ( RULE_INT ) )
            // InternalSpecsDsl.g:969:1: ( RULE_INT )
            {
            // InternalSpecsDsl.g:969:1: ( RULE_INT )
            // InternalSpecsDsl.g:970:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalSpecsDsl.g:979:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:983:1: ( rule__FLOAT__Group__1__Impl )
            // InternalSpecsDsl.g:984:2: rule__FLOAT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalSpecsDsl.g:990:1: rule__FLOAT__Group__1__Impl : ( ( rule__FLOAT__Group_1__0 )? ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:994:1: ( ( ( rule__FLOAT__Group_1__0 )? ) )
            // InternalSpecsDsl.g:995:1: ( ( rule__FLOAT__Group_1__0 )? )
            {
            // InternalSpecsDsl.g:995:1: ( ( rule__FLOAT__Group_1__0 )? )
            // InternalSpecsDsl.g:996:2: ( rule__FLOAT__Group_1__0 )?
            {
             before(grammarAccess.getFLOATAccess().getGroup_1()); 
            // InternalSpecsDsl.g:997:2: ( rule__FLOAT__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpecsDsl.g:997:3: rule__FLOAT__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FLOAT__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFLOATAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group_1__0"
    // InternalSpecsDsl.g:1006:1: rule__FLOAT__Group_1__0 : rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 ;
    public final void rule__FLOAT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1010:1: ( rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1 )
            // InternalSpecsDsl.g:1011:2: rule__FLOAT__Group_1__0__Impl rule__FLOAT__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__FLOAT__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group_1__0"


    // $ANTLR start "rule__FLOAT__Group_1__0__Impl"
    // InternalSpecsDsl.g:1018:1: rule__FLOAT__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1022:1: ( ( '.' ) )
            // InternalSpecsDsl.g:1023:1: ( '.' )
            {
            // InternalSpecsDsl.g:1023:1: ( '.' )
            // InternalSpecsDsl.g:1024:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group_1__0__Impl"


    // $ANTLR start "rule__FLOAT__Group_1__1"
    // InternalSpecsDsl.g:1033:1: rule__FLOAT__Group_1__1 : rule__FLOAT__Group_1__1__Impl ;
    public final void rule__FLOAT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1037:1: ( rule__FLOAT__Group_1__1__Impl )
            // InternalSpecsDsl.g:1038:2: rule__FLOAT__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group_1__1"


    // $ANTLR start "rule__FLOAT__Group_1__1__Impl"
    // InternalSpecsDsl.g:1044:1: rule__FLOAT__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1048:1: ( ( RULE_INT ) )
            // InternalSpecsDsl.g:1049:1: ( RULE_INT )
            {
            // InternalSpecsDsl.g:1049:1: ( RULE_INT )
            // InternalSpecsDsl.g:1050:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group_1__1__Impl"


    // $ANTLR start "rule__Model__SpecsAssignment"
    // InternalSpecsDsl.g:1060:1: rule__Model__SpecsAssignment : ( ruleSpec ) ;
    public final void rule__Model__SpecsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1064:1: ( ( ruleSpec ) )
            // InternalSpecsDsl.g:1065:2: ( ruleSpec )
            {
            // InternalSpecsDsl.g:1065:2: ( ruleSpec )
            // InternalSpecsDsl.g:1066:3: ruleSpec
            {
             before(grammarAccess.getModelAccess().getSpecsSpecParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecsSpecParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SpecsAssignment"


    // $ANTLR start "rule__Spec__NameAssignment_1"
    // InternalSpecsDsl.g:1075:1: rule__Spec__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Spec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1079:1: ( ( RULE_STRING ) )
            // InternalSpecsDsl.g:1080:2: ( RULE_STRING )
            {
            // InternalSpecsDsl.g:1080:2: ( RULE_STRING )
            // InternalSpecsDsl.g:1081:3: RULE_STRING
            {
             before(grammarAccess.getSpecAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__NameAssignment_1"


    // $ANTLR start "rule__Spec__ProcessorAssignment_3"
    // InternalSpecsDsl.g:1090:1: rule__Spec__ProcessorAssignment_3 : ( ruleProcessor ) ;
    public final void rule__Spec__ProcessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1094:1: ( ( ruleProcessor ) )
            // InternalSpecsDsl.g:1095:2: ( ruleProcessor )
            {
            // InternalSpecsDsl.g:1095:2: ( ruleProcessor )
            // InternalSpecsDsl.g:1096:3: ruleProcessor
            {
             before(grammarAccess.getSpecAccess().getProcessorProcessorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessor();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getProcessorProcessorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__ProcessorAssignment_3"


    // $ANTLR start "rule__Spec__MotherboardAssignment_4"
    // InternalSpecsDsl.g:1105:1: rule__Spec__MotherboardAssignment_4 : ( ruleMotherboard ) ;
    public final void rule__Spec__MotherboardAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1109:1: ( ( ruleMotherboard ) )
            // InternalSpecsDsl.g:1110:2: ( ruleMotherboard )
            {
            // InternalSpecsDsl.g:1110:2: ( ruleMotherboard )
            // InternalSpecsDsl.g:1111:3: ruleMotherboard
            {
             before(grammarAccess.getSpecAccess().getMotherboardMotherboardParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMotherboard();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getMotherboardMotherboardParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__MotherboardAssignment_4"


    // $ANTLR start "rule__Spec__MemoriesAssignment_5"
    // InternalSpecsDsl.g:1120:1: rule__Spec__MemoriesAssignment_5 : ( ruleMemory ) ;
    public final void rule__Spec__MemoriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1124:1: ( ( ruleMemory ) )
            // InternalSpecsDsl.g:1125:2: ( ruleMemory )
            {
            // InternalSpecsDsl.g:1125:2: ( ruleMemory )
            // InternalSpecsDsl.g:1126:3: ruleMemory
            {
             before(grammarAccess.getSpecAccess().getMemoriesMemoryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMemory();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getMemoriesMemoryParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__MemoriesAssignment_5"


    // $ANTLR start "rule__Processor__NameAssignment_1"
    // InternalSpecsDsl.g:1135:1: rule__Processor__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Processor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1139:1: ( ( ( RULE_ID ) ) )
            // InternalSpecsDsl.g:1140:2: ( ( RULE_ID ) )
            {
            // InternalSpecsDsl.g:1140:2: ( ( RULE_ID ) )
            // InternalSpecsDsl.g:1141:3: ( RULE_ID )
            {
             before(grammarAccess.getProcessorAccess().getNameProcessorCrossReference_1_0()); 
            // InternalSpecsDsl.g:1142:3: ( RULE_ID )
            // InternalSpecsDsl.g:1143:4: RULE_ID
            {
             before(grammarAccess.getProcessorAccess().getNameProcessorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessorAccess().getNameProcessorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getProcessorAccess().getNameProcessorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__NameAssignment_1"


    // $ANTLR start "rule__Processor__ClockSpeedAssignment_3"
    // InternalSpecsDsl.g:1154:1: rule__Processor__ClockSpeedAssignment_3 : ( ruleClockSpeed ) ;
    public final void rule__Processor__ClockSpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1158:1: ( ( ruleClockSpeed ) )
            // InternalSpecsDsl.g:1159:2: ( ruleClockSpeed )
            {
            // InternalSpecsDsl.g:1159:2: ( ruleClockSpeed )
            // InternalSpecsDsl.g:1160:3: ruleClockSpeed
            {
             before(grammarAccess.getProcessorAccess().getClockSpeedClockSpeedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClockSpeed();

            state._fsp--;

             after(grammarAccess.getProcessorAccess().getClockSpeedClockSpeedParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__ClockSpeedAssignment_3"


    // $ANTLR start "rule__Processor__CoresAssignment_4"
    // InternalSpecsDsl.g:1169:1: rule__Processor__CoresAssignment_4 : ( ruleCores ) ;
    public final void rule__Processor__CoresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1173:1: ( ( ruleCores ) )
            // InternalSpecsDsl.g:1174:2: ( ruleCores )
            {
            // InternalSpecsDsl.g:1174:2: ( ruleCores )
            // InternalSpecsDsl.g:1175:3: ruleCores
            {
             before(grammarAccess.getProcessorAccess().getCoresCoresParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCores();

            state._fsp--;

             after(grammarAccess.getProcessorAccess().getCoresCoresParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__CoresAssignment_4"


    // $ANTLR start "rule__ClockSpeed__ClockSpeedAssignment_1"
    // InternalSpecsDsl.g:1184:1: rule__ClockSpeed__ClockSpeedAssignment_1 : ( ruleFLOAT ) ;
    public final void rule__ClockSpeed__ClockSpeedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1188:1: ( ( ruleFLOAT ) )
            // InternalSpecsDsl.g:1189:2: ( ruleFLOAT )
            {
            // InternalSpecsDsl.g:1189:2: ( ruleFLOAT )
            // InternalSpecsDsl.g:1190:3: ruleFLOAT
            {
             before(grammarAccess.getClockSpeedAccess().getClockSpeedFLOATParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getClockSpeedAccess().getClockSpeedFLOATParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClockSpeed__ClockSpeedAssignment_1"


    // $ANTLR start "rule__Cores__CoresAssignment_1"
    // InternalSpecsDsl.g:1199:1: rule__Cores__CoresAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cores__CoresAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1203:1: ( ( RULE_INT ) )
            // InternalSpecsDsl.g:1204:2: ( RULE_INT )
            {
            // InternalSpecsDsl.g:1204:2: ( RULE_INT )
            // InternalSpecsDsl.g:1205:3: RULE_INT
            {
             before(grammarAccess.getCoresAccess().getCoresINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoresAccess().getCoresINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cores__CoresAssignment_1"


    // $ANTLR start "rule__Motherboard__NameAssignment_1"
    // InternalSpecsDsl.g:1214:1: rule__Motherboard__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Motherboard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1218:1: ( ( ( RULE_ID ) ) )
            // InternalSpecsDsl.g:1219:2: ( ( RULE_ID ) )
            {
            // InternalSpecsDsl.g:1219:2: ( ( RULE_ID ) )
            // InternalSpecsDsl.g:1220:3: ( RULE_ID )
            {
             before(grammarAccess.getMotherboardAccess().getNameMotherboardCrossReference_1_0()); 
            // InternalSpecsDsl.g:1221:3: ( RULE_ID )
            // InternalSpecsDsl.g:1222:4: RULE_ID
            {
             before(grammarAccess.getMotherboardAccess().getNameMotherboardIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMotherboardAccess().getNameMotherboardIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMotherboardAccess().getNameMotherboardCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motherboard__NameAssignment_1"


    // $ANTLR start "rule__Memory__NameAssignment_1"
    // InternalSpecsDsl.g:1233:1: rule__Memory__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Memory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1237:1: ( ( ( RULE_ID ) ) )
            // InternalSpecsDsl.g:1238:2: ( ( RULE_ID ) )
            {
            // InternalSpecsDsl.g:1238:2: ( ( RULE_ID ) )
            // InternalSpecsDsl.g:1239:3: ( RULE_ID )
            {
             before(grammarAccess.getMemoryAccess().getNameMemoryCrossReference_1_0()); 
            // InternalSpecsDsl.g:1240:3: ( RULE_ID )
            // InternalSpecsDsl.g:1241:4: RULE_ID
            {
             before(grammarAccess.getMemoryAccess().getNameMemoryIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemoryAccess().getNameMemoryIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMemoryAccess().getNameMemoryCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__NameAssignment_1"


    // $ANTLR start "rule__Memory__CapacityAssignment_3"
    // InternalSpecsDsl.g:1252:1: rule__Memory__CapacityAssignment_3 : ( ruleCapacity ) ;
    public final void rule__Memory__CapacityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1256:1: ( ( ruleCapacity ) )
            // InternalSpecsDsl.g:1257:2: ( ruleCapacity )
            {
            // InternalSpecsDsl.g:1257:2: ( ruleCapacity )
            // InternalSpecsDsl.g:1258:3: ruleCapacity
            {
             before(grammarAccess.getMemoryAccess().getCapacityCapacityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getMemoryAccess().getCapacityCapacityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Memory__CapacityAssignment_3"


    // $ANTLR start "rule__Capacity__CapacityAssignment_1"
    // InternalSpecsDsl.g:1267:1: rule__Capacity__CapacityAssignment_1 : ( RULE_INT ) ;
    public final void rule__Capacity__CapacityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecsDsl.g:1271:1: ( ( RULE_INT ) )
            // InternalSpecsDsl.g:1272:2: ( RULE_INT )
            {
            // InternalSpecsDsl.g:1272:2: ( RULE_INT )
            // InternalSpecsDsl.g:1273:3: RULE_INT
            {
             before(grammarAccess.getCapacityAccess().getCapacityINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCapacityAccess().getCapacityINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capacity__CapacityAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});

}