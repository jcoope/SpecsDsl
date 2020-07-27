/*
 * generated by Xtext 2.21.0
 */
package com.example.specs.ide.contentassist.antlr;

import com.example.specs.ide.contentassist.antlr.internal.InternalSpecsDslParser;
import com.example.specs.services.SpecsDslGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SpecsDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SpecsDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SpecsDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSpecAccess().getGroup(), "rule__Spec__Group__0");
			builder.put(grammarAccess.getProcessorAccess().getGroup(), "rule__Processor__Group__0");
			builder.put(grammarAccess.getClockSpeedAccess().getGroup(), "rule__ClockSpeed__Group__0");
			builder.put(grammarAccess.getCoresAccess().getGroup(), "rule__Cores__Group__0");
			builder.put(grammarAccess.getMotherboardAccess().getGroup(), "rule__Motherboard__Group__0");
			builder.put(grammarAccess.getMemoryAccess().getGroup(), "rule__Memory__Group__0");
			builder.put(grammarAccess.getCapacityAccess().getGroup(), "rule__Capacity__Group__0");
			builder.put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
			builder.put(grammarAccess.getFLOATAccess().getGroup_1(), "rule__FLOAT__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getSpecsAssignment(), "rule__Model__SpecsAssignment");
			builder.put(grammarAccess.getSpecAccess().getNameAssignment_1(), "rule__Spec__NameAssignment_1");
			builder.put(grammarAccess.getSpecAccess().getProcessorAssignment_3(), "rule__Spec__ProcessorAssignment_3");
			builder.put(grammarAccess.getSpecAccess().getMotherboardAssignment_4(), "rule__Spec__MotherboardAssignment_4");
			builder.put(grammarAccess.getSpecAccess().getMemoriesAssignment_5(), "rule__Spec__MemoriesAssignment_5");
			builder.put(grammarAccess.getProcessorAccess().getNameAssignment_1(), "rule__Processor__NameAssignment_1");
			builder.put(grammarAccess.getProcessorAccess().getClockSpeedAssignment_3(), "rule__Processor__ClockSpeedAssignment_3");
			builder.put(grammarAccess.getProcessorAccess().getCoresAssignment_4(), "rule__Processor__CoresAssignment_4");
			builder.put(grammarAccess.getClockSpeedAccess().getClockSpeedAssignment_1(), "rule__ClockSpeed__ClockSpeedAssignment_1");
			builder.put(grammarAccess.getCoresAccess().getCoresAssignment_1(), "rule__Cores__CoresAssignment_1");
			builder.put(grammarAccess.getMotherboardAccess().getNameAssignment_1(), "rule__Motherboard__NameAssignment_1");
			builder.put(grammarAccess.getMemoryAccess().getNameAssignment_1(), "rule__Memory__NameAssignment_1");
			builder.put(grammarAccess.getMemoryAccess().getCapacityAssignment_3(), "rule__Memory__CapacityAssignment_3");
			builder.put(grammarAccess.getCapacityAccess().getCapacityAssignment_1(), "rule__Capacity__CapacityAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SpecsDslGrammarAccess grammarAccess;

	@Override
	protected InternalSpecsDslParser createParser() {
		InternalSpecsDslParser result = new InternalSpecsDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SpecsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpecsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}