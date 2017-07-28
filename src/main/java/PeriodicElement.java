package main.java;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class PeriodicElement implements Serializable{
	
	String AtomicNumber;	
	String ElementSymbol;	
	String AtomicWeight;
	String Period;
	String Group;	
	String Phase;
	String MostStableCrystal;
	String Type;
	String IonicRadius;
	String AtomicRadius;
	String Electronegativity;	
	String FirstIonization; 
	String Potential;
	String Density;
	String MeltingPoint;
	String BoilingPoint;	
	String Isotopes;
	String Discoverer;
	String YearOfDiscovery;
	String SpecificHeatCapacity;
	String ElectronConfiguration;	
	String DisplayRow;
	String DisplayColumn;
	
	@Override
	public String toString() {
		return "PeriodicElement [AtomicNumber=" + AtomicNumber
				+ ", ElementSymbol=" + ElementSymbol + ", AtomicWeight="
				+ AtomicWeight + ", Period=" + Period + ", Group=" + Group
				+ ", Phase=" + Phase + ", MostStableCrystal="
				+ MostStableCrystal + ", Type=" + Type + ", IonicRadius="
				+ IonicRadius + ", AtomicRadius=" + AtomicRadius
				+ ", Electronegativity=" + Electronegativity
				+ ", FirstIonization=" + FirstIonization + ", Potential="
				+ Potential + ", Density=" + Density + ", MeltingPoint="
				+ MeltingPoint + ", BoilingPoint=" + BoilingPoint
				+ ", Isotopes=" + Isotopes + ", Discoverer=" + Discoverer
				+ ", YearOfDiscovery=" + YearOfDiscovery
				+ ", SpecificHeatCapacity=" + SpecificHeatCapacity
				+ ", ElectronConfiguration=" + ElectronConfiguration
				+ ", DisplayRow=" + DisplayRow + ", DisplayColumn="
				+ DisplayColumn + ", hashCode()=" + hashCode()
				+ ", getAtomicNumber()=" + getAtomicNumber()
				+ ", getElementSymbol()=" + getElementSymbol()
				+ ", getAtomicWeight()=" + getAtomicWeight() + ", getPeriod()="
				+ getPeriod() + ", getGroup()=" + getGroup() + ", getPhase()="
				+ getPhase() + ", getMostStableCrystal()="
				+ getMostStableCrystal() + ", getType()=" + getType()
				+ ", getIonicRadius()=" + getIonicRadius()
				+ ", getAtomicRadius()=" + getAtomicRadius()
				+ ", getElectronegativity()=" + getElectronegativity()
				+ ", getFirstIonization()=" + getFirstIonization()
				+ ", getPotential()=" + getPotential() + ", getDensity()="
				+ getDensity() + ", getMeltingPoint()=" + getMeltingPoint()
				+ ", getBoilingPoint()=" + getBoilingPoint()
				+ ", getIsotopes()=" + getIsotopes() + ", getDiscoverer()="
				+ getDiscoverer() + ", getYearOfDiscovery()="
				+ getYearOfDiscovery() + ", getSpecificHeatCapacity()="
				+ getSpecificHeatCapacity() + ", getElectronConfiguration()="
				+ getElectronConfiguration() + ", getDisplayRow()="
				+ getDisplayRow() + ", getDisplayColumn()="
				+ getDisplayColumn() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((AtomicNumber == null) ? 0 : AtomicNumber.hashCode());
		result = prime * result
				+ ((AtomicRadius == null) ? 0 : AtomicRadius.hashCode());
		result = prime * result
				+ ((AtomicWeight == null) ? 0 : AtomicWeight.hashCode());
		result = prime * result
				+ ((BoilingPoint == null) ? 0 : BoilingPoint.hashCode());
		result = prime * result + ((Density == null) ? 0 : Density.hashCode());
		result = prime * result
				+ ((Discoverer == null) ? 0 : Discoverer.hashCode());
		result = prime * result
				+ ((DisplayColumn == null) ? 0 : DisplayColumn.hashCode());
		result = prime * result
				+ ((DisplayRow == null) ? 0 : DisplayRow.hashCode());
		result = prime
				* result
				+ ((ElectronConfiguration == null) ? 0 : ElectronConfiguration
						.hashCode());
		result = prime
				* result
				+ ((Electronegativity == null) ? 0 : Electronegativity
						.hashCode());
		result = prime * result
				+ ((ElementSymbol == null) ? 0 : ElementSymbol.hashCode());
		result = prime * result
				+ ((FirstIonization == null) ? 0 : FirstIonization.hashCode());
		result = prime * result + ((Group == null) ? 0 : Group.hashCode());
		result = prime * result
				+ ((IonicRadius == null) ? 0 : IonicRadius.hashCode());
		result = prime * result
				+ ((Isotopes == null) ? 0 : Isotopes.hashCode());
		result = prime * result
				+ ((MeltingPoint == null) ? 0 : MeltingPoint.hashCode());
		result = prime
				* result
				+ ((MostStableCrystal == null) ? 0 : MostStableCrystal
						.hashCode());
		result = prime * result + ((Period == null) ? 0 : Period.hashCode());
		result = prime * result + ((Phase == null) ? 0 : Phase.hashCode());
		result = prime * result
				+ ((Potential == null) ? 0 : Potential.hashCode());
		result = prime
				* result
				+ ((SpecificHeatCapacity == null) ? 0 : SpecificHeatCapacity
						.hashCode());
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result
				+ ((YearOfDiscovery == null) ? 0 : YearOfDiscovery.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeriodicElement other = (PeriodicElement) obj;
		if (AtomicNumber == null) {
			if (other.AtomicNumber != null)
				return false;
		} else if (!AtomicNumber.equals(other.AtomicNumber))
			return false;
		if (AtomicRadius == null) {
			if (other.AtomicRadius != null)
				return false;
		} else if (!AtomicRadius.equals(other.AtomicRadius))
			return false;
		if (AtomicWeight == null) {
			if (other.AtomicWeight != null)
				return false;
		} else if (!AtomicWeight.equals(other.AtomicWeight))
			return false;
		if (BoilingPoint == null) {
			if (other.BoilingPoint != null)
				return false;
		} else if (!BoilingPoint.equals(other.BoilingPoint))
			return false;
		if (Density == null) {
			if (other.Density != null)
				return false;
		} else if (!Density.equals(other.Density))
			return false;
		if (Discoverer == null) {
			if (other.Discoverer != null)
				return false;
		} else if (!Discoverer.equals(other.Discoverer))
			return false;
		if (DisplayColumn == null) {
			if (other.DisplayColumn != null)
				return false;
		} else if (!DisplayColumn.equals(other.DisplayColumn))
			return false;
		if (DisplayRow == null) {
			if (other.DisplayRow != null)
				return false;
		} else if (!DisplayRow.equals(other.DisplayRow))
			return false;
		if (ElectronConfiguration == null) {
			if (other.ElectronConfiguration != null)
				return false;
		} else if (!ElectronConfiguration.equals(other.ElectronConfiguration))
			return false;
		if (Electronegativity == null) {
			if (other.Electronegativity != null)
				return false;
		} else if (!Electronegativity.equals(other.Electronegativity))
			return false;
		if (ElementSymbol == null) {
			if (other.ElementSymbol != null)
				return false;
		} else if (!ElementSymbol.equals(other.ElementSymbol))
			return false;
		if (FirstIonization == null) {
			if (other.FirstIonization != null)
				return false;
		} else if (!FirstIonization.equals(other.FirstIonization))
			return false;
		if (Group == null) {
			if (other.Group != null)
				return false;
		} else if (!Group.equals(other.Group))
			return false;
		if (IonicRadius == null) {
			if (other.IonicRadius != null)
				return false;
		} else if (!IonicRadius.equals(other.IonicRadius))
			return false;
		if (Isotopes == null) {
			if (other.Isotopes != null)
				return false;
		} else if (!Isotopes.equals(other.Isotopes))
			return false;
		if (MeltingPoint == null) {
			if (other.MeltingPoint != null)
				return false;
		} else if (!MeltingPoint.equals(other.MeltingPoint))
			return false;
		if (MostStableCrystal == null) {
			if (other.MostStableCrystal != null)
				return false;
		} else if (!MostStableCrystal.equals(other.MostStableCrystal))
			return false;
		if (Period == null) {
			if (other.Period != null)
				return false;
		} else if (!Period.equals(other.Period))
			return false;
		if (Phase == null) {
			if (other.Phase != null)
				return false;
		} else if (!Phase.equals(other.Phase))
			return false;
		if (Potential == null) {
			if (other.Potential != null)
				return false;
		} else if (!Potential.equals(other.Potential))
			return false;
		if (SpecificHeatCapacity == null) {
			if (other.SpecificHeatCapacity != null)
				return false;
		} else if (!SpecificHeatCapacity.equals(other.SpecificHeatCapacity))
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (YearOfDiscovery == null) {
			if (other.YearOfDiscovery != null)
				return false;
		} else if (!YearOfDiscovery.equals(other.YearOfDiscovery))
			return false;
		return true;
	}
	@XmlElement
	public String getAtomicNumber() {
		return AtomicNumber;
	}
	public void setAtomicNumber(String atomicNumber) {
		AtomicNumber = atomicNumber;
	}
	@XmlElement
	public String getElementSymbol() {
		return ElementSymbol;
	}
	public void setElementSymbol(String elementSymbol) {
		ElementSymbol = elementSymbol;
	}
	@XmlElement
	public String getAtomicWeight() {
		return AtomicWeight;
	}
	public void setAtomicWeight(String atomicWeight) {
		AtomicWeight = atomicWeight;
	}
	@XmlElement
	public String getPeriod() {
		return Period;
	}
	public void setPeriod(String period) {
		Period = period;
	}
	@XmlElement
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	@XmlElement
	public String getPhase() {
		return Phase;
	}
	public void setPhase(String phase) {
		Phase = phase;
	}
	@XmlElement
	public String getMostStableCrystal() {
		return MostStableCrystal;
	}
	public void setMostStableCrystal(String mostStableCrystal) {
		MostStableCrystal = mostStableCrystal;
	}
	@XmlElement
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@XmlElement
	public String getIonicRadius() {
		return IonicRadius;
	}
	public void setIonicRadius(String ionicRadius) {
		IonicRadius = ionicRadius;
	}
	@XmlElement
	public String getAtomicRadius() {
		return AtomicRadius;
	}
	public void setAtomicRadius(String atomicRadius) {
		AtomicRadius = atomicRadius;
	}
	@XmlElement
	public String getElectronegativity() {
		return Electronegativity;
	}
	public void setElectronegativity(String electronegativity) {
		Electronegativity = electronegativity;
	}
	@XmlElement
	public String getFirstIonization() {
		return FirstIonization;
	}
	public void setFirstIonization(String firstIonization) {
		FirstIonization = firstIonization;
	}
	@XmlElement
	public String getPotential() {
		return Potential;
	}
	public void setPotential(String potential) {
		Potential = potential;
	}
	@XmlElement
	public String getDensity() {
		return Density;
	}
	public void setDensity(String density) {
		Density = density;
	}
	@XmlElement
	public String getMeltingPoint() {
		return MeltingPoint;
	}
	public void setMeltingPoint(String meltingPoint) {
		MeltingPoint = meltingPoint;
	}
	@XmlElement
	public String getBoilingPoint() {
		return BoilingPoint;
	}
	public void setBoilingPoint(String boilingPoint) {
		BoilingPoint = boilingPoint;
	}
	@XmlElement
	public String getIsotopes() {
		return Isotopes;
	}
	public void setIsotopes(String isotopes) {
		Isotopes = isotopes;
	}
	@XmlElement
	public String getDiscoverer() {
		return Discoverer;
	}
	public void setDiscoverer(String discoverer) {
		Discoverer = discoverer;
	}
	@XmlElement
	public String getYearOfDiscovery() {
		return YearOfDiscovery;
	}
	public void setYearOfDiscovery(String yearOfDiscovery) {
		YearOfDiscovery = yearOfDiscovery;
	}
	@XmlElement
	public String getSpecificHeatCapacity() {
		return SpecificHeatCapacity;
	}
	public void setSpecificHeatCapacity(String specificHeatCapacity) {
		SpecificHeatCapacity = specificHeatCapacity;
	}
	@XmlElement
	public String getElectronConfiguration() {
		return ElectronConfiguration;
	}
	public void setElectronConfiguration(String electronConfiguration) {
		ElectronConfiguration = electronConfiguration;
	}
	@XmlElement
	public String getDisplayRow() {
		return DisplayRow;
	}
	public void setDisplayRow(String displayRow) {
		DisplayRow = displayRow;
	}
	@XmlElement
	public String getDisplayColumn() {
		return DisplayColumn;
	}
	public void setDisplayColumn(String displayColumn) {
		DisplayColumn = displayColumn;
	}
	
	

}
