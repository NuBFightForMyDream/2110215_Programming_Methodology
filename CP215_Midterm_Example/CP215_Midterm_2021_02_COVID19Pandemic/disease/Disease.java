package disease;

import util.SevereLevel;

public abstract class Disease {
	
	public final SevereLevel getSevereLevel(boolean isVaccinated) {
		return severeLevel(isVaccinated);
	}
	
	protected abstract SevereLevel severeLevel(boolean isVaccinated);
}
