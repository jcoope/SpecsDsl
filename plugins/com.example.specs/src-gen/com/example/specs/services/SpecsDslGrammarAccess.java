/*
 * generated by Xtext 2.21.0
 */
package com.example.specs.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SpecsDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Model");
		private final Assignment cSpecsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSpecsSpecParserRuleCall_0 = (RuleCall)cSpecsAssignment.eContents().get(0);
		
		//Model:
		//	specs+=Spec*;
		@Override public ParserRule getRule() { return rule; }
		
		//specs+=Spec*
		public Assignment getSpecsAssignment() { return cSpecsAssignment; }
		
		//Spec
		public RuleCall getSpecsSpecParserRuleCall_0() { return cSpecsSpecParserRuleCall_0; }
	}
	public class SpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Spec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpecificationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProcessorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProcessorProcessorParserRuleCall_3_0 = (RuleCall)cProcessorAssignment_3.eContents().get(0);
		private final Assignment cMotherboardAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMotherboardMotherboardParserRuleCall_4_0 = (RuleCall)cMotherboardAssignment_4.eContents().get(0);
		private final Assignment cMemoriesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMemoriesMemoryParserRuleCall_5_0 = (RuleCall)cMemoriesAssignment_5.eContents().get(0);
		
		//Spec:
		//	'Specification' name=STRING ":"
		//	processor=Processor
		//	motherboard=Motherboard
		//	memories+=Memory*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Specification' name=STRING ":" processor=Processor motherboard=Motherboard memories+=Memory*
		public Group getGroup() { return cGroup; }
		
		//'Specification'
		public Keyword getSpecificationKeyword_0() { return cSpecificationKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//processor=Processor
		public Assignment getProcessorAssignment_3() { return cProcessorAssignment_3; }
		
		//Processor
		public RuleCall getProcessorProcessorParserRuleCall_3_0() { return cProcessorProcessorParserRuleCall_3_0; }
		
		//motherboard=Motherboard
		public Assignment getMotherboardAssignment_4() { return cMotherboardAssignment_4; }
		
		//Motherboard
		public RuleCall getMotherboardMotherboardParserRuleCall_4_0() { return cMotherboardMotherboardParserRuleCall_4_0; }
		
		//memories+=Memory*
		public Assignment getMemoriesAssignment_5() { return cMemoriesAssignment_5; }
		
		//Memory
		public RuleCall getMemoriesMemoryParserRuleCall_5_0() { return cMemoriesMemoryParserRuleCall_5_0; }
	}
	public class ProcessorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Processor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcessorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameProcessorCrossReference_1_0 = (CrossReference)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameProcessorIDTerminalRuleCall_1_0_1 = (RuleCall)cNameProcessorCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cClockSpeedAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClockSpeedClockSpeedParserRuleCall_3_0 = (RuleCall)cClockSpeedAssignment_3.eContents().get(0);
		private final Assignment cCoresAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCoresCoresParserRuleCall_4_0 = (RuleCall)cCoresAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Processor:
		//	'Processor' name=[library::Processor] "{"
		//	clockSpeed=ClockSpeed
		//	cores=Cores
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//'Processor' name=[library::Processor] "{" clockSpeed=ClockSpeed cores=Cores "}"
		public Group getGroup() { return cGroup; }
		
		//'Processor'
		public Keyword getProcessorKeyword_0() { return cProcessorKeyword_0; }
		
		//name=[library::Processor]
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//[library::Processor]
		public CrossReference getNameProcessorCrossReference_1_0() { return cNameProcessorCrossReference_1_0; }
		
		//ID
		public RuleCall getNameProcessorIDTerminalRuleCall_1_0_1() { return cNameProcessorIDTerminalRuleCall_1_0_1; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//clockSpeed=ClockSpeed
		public Assignment getClockSpeedAssignment_3() { return cClockSpeedAssignment_3; }
		
		//ClockSpeed
		public RuleCall getClockSpeedClockSpeedParserRuleCall_3_0() { return cClockSpeedClockSpeedParserRuleCall_3_0; }
		
		//cores=Cores
		public Assignment getCoresAssignment_4() { return cCoresAssignment_4; }
		
		//Cores
		public RuleCall getCoresCoresParserRuleCall_4_0() { return cCoresCoresParserRuleCall_4_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ClockSpeedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.ClockSpeed");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClockSpeedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cClockSpeedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClockSpeedFLOATParserRuleCall_1_0 = (RuleCall)cClockSpeedAssignment_1.eContents().get(0);
		
		//ClockSpeed:
		//	'clockSpeed' clockSpeed=FLOAT;
		@Override public ParserRule getRule() { return rule; }
		
		//'clockSpeed' clockSpeed=FLOAT
		public Group getGroup() { return cGroup; }
		
		//'clockSpeed'
		public Keyword getClockSpeedKeyword_0() { return cClockSpeedKeyword_0; }
		
		//clockSpeed=FLOAT
		public Assignment getClockSpeedAssignment_1() { return cClockSpeedAssignment_1; }
		
		//FLOAT
		public RuleCall getClockSpeedFLOATParserRuleCall_1_0() { return cClockSpeedFLOATParserRuleCall_1_0; }
	}
	public class CoresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Cores");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCoresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCoresAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCoresINTTerminalRuleCall_1_0 = (RuleCall)cCoresAssignment_1.eContents().get(0);
		
		//Cores:
		//	'cores' cores=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'cores' cores=INT
		public Group getGroup() { return cGroup; }
		
		//'cores'
		public Keyword getCoresKeyword_0() { return cCoresKeyword_0; }
		
		//cores=INT
		public Assignment getCoresAssignment_1() { return cCoresAssignment_1; }
		
		//INT
		public RuleCall getCoresINTTerminalRuleCall_1_0() { return cCoresINTTerminalRuleCall_1_0; }
	}
	public class MotherboardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Motherboard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMotherboardKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameMotherboardCrossReference_1_0 = (CrossReference)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameMotherboardIDTerminalRuleCall_1_0_1 = (RuleCall)cNameMotherboardCrossReference_1_0.eContents().get(1);
		
		//Motherboard:
		//	'Motherboard' name=[library::Motherboard];
		@Override public ParserRule getRule() { return rule; }
		
		//'Motherboard' name=[library::Motherboard]
		public Group getGroup() { return cGroup; }
		
		//'Motherboard'
		public Keyword getMotherboardKeyword_0() { return cMotherboardKeyword_0; }
		
		//name=[library::Motherboard]
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//[library::Motherboard]
		public CrossReference getNameMotherboardCrossReference_1_0() { return cNameMotherboardCrossReference_1_0; }
		
		//ID
		public RuleCall getNameMotherboardIDTerminalRuleCall_1_0_1() { return cNameMotherboardIDTerminalRuleCall_1_0_1; }
	}
	public class MemoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Memory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMemoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameMemoryCrossReference_1_0 = (CrossReference)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameMemoryIDTerminalRuleCall_1_0_1 = (RuleCall)cNameMemoryCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCapacityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCapacityCapacityParserRuleCall_3_0 = (RuleCall)cCapacityAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Memory:
		//	'Memory' name=[library::Memory] "{"
		//	capacity=Capacity
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//'Memory' name=[library::Memory] "{" capacity=Capacity "}"
		public Group getGroup() { return cGroup; }
		
		//'Memory'
		public Keyword getMemoryKeyword_0() { return cMemoryKeyword_0; }
		
		//name=[library::Memory]
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//[library::Memory]
		public CrossReference getNameMemoryCrossReference_1_0() { return cNameMemoryCrossReference_1_0; }
		
		//ID
		public RuleCall getNameMemoryIDTerminalRuleCall_1_0_1() { return cNameMemoryIDTerminalRuleCall_1_0_1; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//capacity=Capacity
		public Assignment getCapacityAssignment_3() { return cCapacityAssignment_3; }
		
		//Capacity
		public RuleCall getCapacityCapacityParserRuleCall_3_0() { return cCapacityCapacityParserRuleCall_3_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CapacityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.Capacity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCapacityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCapacityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCapacityINTTerminalRuleCall_1_0 = (RuleCall)cCapacityAssignment_1.eContents().get(0);
		
		//Capacity:
		//	'capacity' capacity=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'capacity' capacity=INT
		public Group getGroup() { return cGroup; }
		
		//'capacity'
		public Keyword getCapacityKeyword_0() { return cCapacityKeyword_0; }
		
		//capacity=INT
		public Assignment getCapacityAssignment_1() { return cCapacityAssignment_1; }
		
		//INT
		public RuleCall getCapacityINTTerminalRuleCall_1_0() { return cCapacityINTTerminalRuleCall_1_0; }
	}
	public class FLOATElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.FLOAT");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FLOAT ecore::EFloat:
		//	INT ('.' INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//INT ('.' INT)?
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//('.' INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final SpecElements pSpec;
	private final ProcessorElements pProcessor;
	private final ClockSpeedElements pClockSpeed;
	private final CoresElements pCores;
	private final MotherboardElements pMotherboard;
	private final MemoryElements pMemory;
	private final CapacityElements pCapacity;
	private final TerminalRule tSL_COMMENT;
	private final FLOATElements pFLOAT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SpecsDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSpec = new SpecElements();
		this.pProcessor = new ProcessorElements();
		this.pClockSpeed = new ClockSpeedElements();
		this.pCores = new CoresElements();
		this.pMotherboard = new MotherboardElements();
		this.pMemory = new MemoryElements();
		this.pCapacity = new CapacityElements();
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.example.specs.SpecsDsl.SL_COMMENT");
		this.pFLOAT = new FLOATElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.example.specs.SpecsDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	specs+=Spec*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Spec:
	//	'Specification' name=STRING ":"
	//	processor=Processor
	//	motherboard=Motherboard
	//	memories+=Memory*;
	public SpecElements getSpecAccess() {
		return pSpec;
	}
	
	public ParserRule getSpecRule() {
		return getSpecAccess().getRule();
	}
	
	//Processor:
	//	'Processor' name=[library::Processor] "{"
	//	clockSpeed=ClockSpeed
	//	cores=Cores
	//	"}";
	public ProcessorElements getProcessorAccess() {
		return pProcessor;
	}
	
	public ParserRule getProcessorRule() {
		return getProcessorAccess().getRule();
	}
	
	//ClockSpeed:
	//	'clockSpeed' clockSpeed=FLOAT;
	public ClockSpeedElements getClockSpeedAccess() {
		return pClockSpeed;
	}
	
	public ParserRule getClockSpeedRule() {
		return getClockSpeedAccess().getRule();
	}
	
	//Cores:
	//	'cores' cores=INT;
	public CoresElements getCoresAccess() {
		return pCores;
	}
	
	public ParserRule getCoresRule() {
		return getCoresAccess().getRule();
	}
	
	//Motherboard:
	//	'Motherboard' name=[library::Motherboard];
	public MotherboardElements getMotherboardAccess() {
		return pMotherboard;
	}
	
	public ParserRule getMotherboardRule() {
		return getMotherboardAccess().getRule();
	}
	
	//Memory:
	//	'Memory' name=[library::Memory] "{"
	//	capacity=Capacity
	//	"}";
	public MemoryElements getMemoryAccess() {
		return pMemory;
	}
	
	public ParserRule getMemoryRule() {
		return getMemoryAccess().getRule();
	}
	
	//Capacity:
	//	'capacity' capacity=INT;
	public CapacityElements getCapacityAccess() {
		return pCapacity;
	}
	
	public ParserRule getCapacityRule() {
		return getCapacityAccess().getRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//	'--' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//FLOAT ecore::EFloat:
	//	INT ('.' INT)?;
	public FLOATElements getFLOATAccess() {
		return pFLOAT;
	}
	
	public ParserRule getFLOATRule() {
		return getFLOATAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}