package io.sevcik.hypherator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import io.sevcik.hypherator.HyphenDict.BreakRule;
import io.sevcik.hypherator.dto.PotentialBreak;

// NOTE Public to make JacsonSerializable
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class PotentialBreakImpl implements PotentialBreak {

	private final int position;
	private final int priority; 
	private final HyphenDict.BreakRule breakRule;

	PotentialBreakImpl(int position, int priority, BreakRule breakRule) {
		this.position = position;
		this.priority = priority;
		this.breakRule = breakRule;
	}

	int position() {
		return position;
	}

	int priority() {
		return priority;
	}

	HyphenDict.BreakRule breakRule() {
		return breakRule;
	}
}
