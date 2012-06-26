/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.twofishes;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class GeocodeFeature implements TBase<GeocodeFeature, GeocodeFeature._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GeocodeFeature");

  private static final TField CC_FIELD_DESC = new TField("cc", TType.STRING, (short)1);
  private static final TField GEOMETRY_FIELD_DESC = new TField("geometry", TType.STRUCT, (short)2);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)3);
  private static final TField DISPLAY_NAME_FIELD_DESC = new TField("displayName", TType.STRING, (short)4);
  private static final TField WOE_TYPE_FIELD_DESC = new TField("woeType", TType.I32, (short)5);
  private static final TField IDS_FIELD_DESC = new TField("ids", TType.LIST, (short)6);
  private static final TField NAMES_FIELD_DESC = new TField("names", TType.LIST, (short)7);
  private static final TField ATTRIBUTION_FIELD_DESC = new TField("attribution", TType.LIST, (short)8);
  private static final TField TIMEZONES_FIELD_DESC = new TField("timezones", TType.LIST, (short)9);
  private static final TField HIGHLIGHTED_NAME_FIELD_DESC = new TField("highlightedName", TType.STRING, (short)11);
  private static final TField MATCHED_NAME_FIELD_DESC = new TField("matchedName", TType.STRING, (short)12);

  public String cc;
  public FeatureGeometry geometry;
  public String name;
  public String displayName;
  /**
   * 
   * @see YahooWoeType
   */
  public YahooWoeType woeType;
  public List<FeatureId> ids;
  public List<FeatureName> names;
  public List<String> attribution;
  public List<String> timezones;
  public String highlightedName;
  public String matchedName;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    CC((short)1, "cc"),
    GEOMETRY((short)2, "geometry"),
    NAME((short)3, "name"),
    DISPLAY_NAME((short)4, "displayName"),
    /**
     * 
     * @see YahooWoeType
     */
    WOE_TYPE((short)5, "woeType"),
    IDS((short)6, "ids"),
    NAMES((short)7, "names"),
    ATTRIBUTION((short)8, "attribution"),
    TIMEZONES((short)9, "timezones"),
    HIGHLIGHTED_NAME((short)11, "highlightedName"),
    MATCHED_NAME((short)12, "matchedName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CC
          return CC;
        case 2: // GEOMETRY
          return GEOMETRY;
        case 3: // NAME
          return NAME;
        case 4: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 5: // WOE_TYPE
          return WOE_TYPE;
        case 6: // IDS
          return IDS;
        case 7: // NAMES
          return NAMES;
        case 8: // ATTRIBUTION
          return ATTRIBUTION;
        case 9: // TIMEZONES
          return TIMEZONES;
        case 11: // HIGHLIGHTED_NAME
          return HIGHLIGHTED_NAME;
        case 12: // MATCHED_NAME
          return MATCHED_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CC, new FieldMetaData("cc", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.GEOMETRY, new FieldMetaData("geometry", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, FeatureGeometry.class)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new FieldMetaData("displayName", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.WOE_TYPE, new FieldMetaData("woeType", TFieldRequirementType.OPTIONAL, 
        new EnumMetaData(TType.ENUM, YahooWoeType.class)));
    tmpMap.put(_Fields.IDS, new FieldMetaData("ids", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, FeatureId.class))));
    tmpMap.put(_Fields.NAMES, new FieldMetaData("names", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, FeatureName.class))));
    tmpMap.put(_Fields.ATTRIBUTION, new FieldMetaData("attribution", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.TIMEZONES, new FieldMetaData("timezones", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.HIGHLIGHTED_NAME, new FieldMetaData("highlightedName", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.MATCHED_NAME, new FieldMetaData("matchedName", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(GeocodeFeature.class, metaDataMap);
  }

  public GeocodeFeature() {
  }

  public GeocodeFeature(
    String cc,
    FeatureGeometry geometry)
  {
    this();
    this.cc = cc;
    this.geometry = geometry;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GeocodeFeature(GeocodeFeature other) {
    if (other.isSetCc()) {
      this.cc = other.cc;
    }
    if (other.isSetGeometry()) {
      this.geometry = new FeatureGeometry(other.geometry);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetWoeType()) {
      this.woeType = other.woeType;
    }
    if (other.isSetIds()) {
      List<FeatureId> __this__ids = new ArrayList<FeatureId>();
      for (FeatureId other_element : other.ids) {
        __this__ids.add(new FeatureId(other_element));
      }
      this.ids = __this__ids;
    }
    if (other.isSetNames()) {
      List<FeatureName> __this__names = new ArrayList<FeatureName>();
      for (FeatureName other_element : other.names) {
        __this__names.add(new FeatureName(other_element));
      }
      this.names = __this__names;
    }
    if (other.isSetAttribution()) {
      List<String> __this__attribution = new ArrayList<String>();
      for (String other_element : other.attribution) {
        __this__attribution.add(other_element);
      }
      this.attribution = __this__attribution;
    }
    if (other.isSetTimezones()) {
      List<String> __this__timezones = new ArrayList<String>();
      for (String other_element : other.timezones) {
        __this__timezones.add(other_element);
      }
      this.timezones = __this__timezones;
    }
    if (other.isSetHighlightedName()) {
      this.highlightedName = other.highlightedName;
    }
    if (other.isSetMatchedName()) {
      this.matchedName = other.matchedName;
    }
  }

  public GeocodeFeature deepCopy() {
    return new GeocodeFeature(this);
  }

  @Override
  public void clear() {
    this.cc = null;
    this.geometry = null;
    this.name = null;
    this.displayName = null;
    this.woeType = null;
    this.ids = null;
    this.names = null;
    this.attribution = null;
    this.timezones = null;
    this.highlightedName = null;
    this.matchedName = null;
  }

  public String getCc() {
    return this.cc;
  }

  public GeocodeFeature setCc(String cc) {
    this.cc = cc;
    return this;
  }

  public void unsetCc() {
    this.cc = null;
  }

  /** Returns true if field cc is set (has been asigned a value) and false otherwise */
  public boolean isSetCc() {
    return this.cc != null;
  }

  public void setCcIsSet(boolean value) {
    if (!value) {
      this.cc = null;
    }
  }

  public FeatureGeometry getGeometry() {
    return this.geometry;
  }

  public GeocodeFeature setGeometry(FeatureGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

  public void unsetGeometry() {
    this.geometry = null;
  }

  /** Returns true if field geometry is set (has been asigned a value) and false otherwise */
  public boolean isSetGeometry() {
    return this.geometry != null;
  }

  public void setGeometryIsSet(boolean value) {
    if (!value) {
      this.geometry = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public GeocodeFeature setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public GeocodeFeature setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been asigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  /**
   * 
   * @see YahooWoeType
   */
  public YahooWoeType getWoeType() {
    return this.woeType;
  }

  /**
   * 
   * @see YahooWoeType
   */
  public GeocodeFeature setWoeType(YahooWoeType woeType) {
    this.woeType = woeType;
    return this;
  }

  public void unsetWoeType() {
    this.woeType = null;
  }

  /** Returns true if field woeType is set (has been asigned a value) and false otherwise */
  public boolean isSetWoeType() {
    return this.woeType != null;
  }

  public void setWoeTypeIsSet(boolean value) {
    if (!value) {
      this.woeType = null;
    }
  }

  public int getIdsSize() {
    return (this.ids == null) ? 0 : this.ids.size();
  }

  public java.util.Iterator<FeatureId> getIdsIterator() {
    return (this.ids == null) ? null : this.ids.iterator();
  }

  public void addToIds(FeatureId elem) {
    if (this.ids == null) {
      this.ids = new ArrayList<FeatureId>();
    }
    this.ids.add(elem);
  }

  public List<FeatureId> getIds() {
    return this.ids;
  }

  public GeocodeFeature setIds(List<FeatureId> ids) {
    this.ids = ids;
    return this;
  }

  public void unsetIds() {
    this.ids = null;
  }

  /** Returns true if field ids is set (has been asigned a value) and false otherwise */
  public boolean isSetIds() {
    return this.ids != null;
  }

  public void setIdsIsSet(boolean value) {
    if (!value) {
      this.ids = null;
    }
  }

  public int getNamesSize() {
    return (this.names == null) ? 0 : this.names.size();
  }

  public java.util.Iterator<FeatureName> getNamesIterator() {
    return (this.names == null) ? null : this.names.iterator();
  }

  public void addToNames(FeatureName elem) {
    if (this.names == null) {
      this.names = new ArrayList<FeatureName>();
    }
    this.names.add(elem);
  }

  public List<FeatureName> getNames() {
    return this.names;
  }

  public GeocodeFeature setNames(List<FeatureName> names) {
    this.names = names;
    return this;
  }

  public void unsetNames() {
    this.names = null;
  }

  /** Returns true if field names is set (has been asigned a value) and false otherwise */
  public boolean isSetNames() {
    return this.names != null;
  }

  public void setNamesIsSet(boolean value) {
    if (!value) {
      this.names = null;
    }
  }

  public int getAttributionSize() {
    return (this.attribution == null) ? 0 : this.attribution.size();
  }

  public java.util.Iterator<String> getAttributionIterator() {
    return (this.attribution == null) ? null : this.attribution.iterator();
  }

  public void addToAttribution(String elem) {
    if (this.attribution == null) {
      this.attribution = new ArrayList<String>();
    }
    this.attribution.add(elem);
  }

  public List<String> getAttribution() {
    return this.attribution;
  }

  public GeocodeFeature setAttribution(List<String> attribution) {
    this.attribution = attribution;
    return this;
  }

  public void unsetAttribution() {
    this.attribution = null;
  }

  /** Returns true if field attribution is set (has been asigned a value) and false otherwise */
  public boolean isSetAttribution() {
    return this.attribution != null;
  }

  public void setAttributionIsSet(boolean value) {
    if (!value) {
      this.attribution = null;
    }
  }

  public int getTimezonesSize() {
    return (this.timezones == null) ? 0 : this.timezones.size();
  }

  public java.util.Iterator<String> getTimezonesIterator() {
    return (this.timezones == null) ? null : this.timezones.iterator();
  }

  public void addToTimezones(String elem) {
    if (this.timezones == null) {
      this.timezones = new ArrayList<String>();
    }
    this.timezones.add(elem);
  }

  public List<String> getTimezones() {
    return this.timezones;
  }

  public GeocodeFeature setTimezones(List<String> timezones) {
    this.timezones = timezones;
    return this;
  }

  public void unsetTimezones() {
    this.timezones = null;
  }

  /** Returns true if field timezones is set (has been asigned a value) and false otherwise */
  public boolean isSetTimezones() {
    return this.timezones != null;
  }

  public void setTimezonesIsSet(boolean value) {
    if (!value) {
      this.timezones = null;
    }
  }

  public String getHighlightedName() {
    return this.highlightedName;
  }

  public GeocodeFeature setHighlightedName(String highlightedName) {
    this.highlightedName = highlightedName;
    return this;
  }

  public void unsetHighlightedName() {
    this.highlightedName = null;
  }

  /** Returns true if field highlightedName is set (has been asigned a value) and false otherwise */
  public boolean isSetHighlightedName() {
    return this.highlightedName != null;
  }

  public void setHighlightedNameIsSet(boolean value) {
    if (!value) {
      this.highlightedName = null;
    }
  }

  public String getMatchedName() {
    return this.matchedName;
  }

  public GeocodeFeature setMatchedName(String matchedName) {
    this.matchedName = matchedName;
    return this;
  }

  public void unsetMatchedName() {
    this.matchedName = null;
  }

  /** Returns true if field matchedName is set (has been asigned a value) and false otherwise */
  public boolean isSetMatchedName() {
    return this.matchedName != null;
  }

  public void setMatchedNameIsSet(boolean value) {
    if (!value) {
      this.matchedName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CC:
      if (value == null) {
        unsetCc();
      } else {
        setCc((String)value);
      }
      break;

    case GEOMETRY:
      if (value == null) {
        unsetGeometry();
      } else {
        setGeometry((FeatureGeometry)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    case WOE_TYPE:
      if (value == null) {
        unsetWoeType();
      } else {
        setWoeType((YahooWoeType)value);
      }
      break;

    case IDS:
      if (value == null) {
        unsetIds();
      } else {
        setIds((List<FeatureId>)value);
      }
      break;

    case NAMES:
      if (value == null) {
        unsetNames();
      } else {
        setNames((List<FeatureName>)value);
      }
      break;

    case ATTRIBUTION:
      if (value == null) {
        unsetAttribution();
      } else {
        setAttribution((List<String>)value);
      }
      break;

    case TIMEZONES:
      if (value == null) {
        unsetTimezones();
      } else {
        setTimezones((List<String>)value);
      }
      break;

    case HIGHLIGHTED_NAME:
      if (value == null) {
        unsetHighlightedName();
      } else {
        setHighlightedName((String)value);
      }
      break;

    case MATCHED_NAME:
      if (value == null) {
        unsetMatchedName();
      } else {
        setMatchedName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CC:
      return getCc();

    case GEOMETRY:
      return getGeometry();

    case NAME:
      return getName();

    case DISPLAY_NAME:
      return getDisplayName();

    case WOE_TYPE:
      return getWoeType();

    case IDS:
      return getIds();

    case NAMES:
      return getNames();

    case ATTRIBUTION:
      return getAttribution();

    case TIMEZONES:
      return getTimezones();

    case HIGHLIGHTED_NAME:
      return getHighlightedName();

    case MATCHED_NAME:
      return getMatchedName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CC:
      return isSetCc();
    case GEOMETRY:
      return isSetGeometry();
    case NAME:
      return isSetName();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case WOE_TYPE:
      return isSetWoeType();
    case IDS:
      return isSetIds();
    case NAMES:
      return isSetNames();
    case ATTRIBUTION:
      return isSetAttribution();
    case TIMEZONES:
      return isSetTimezones();
    case HIGHLIGHTED_NAME:
      return isSetHighlightedName();
    case MATCHED_NAME:
      return isSetMatchedName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GeocodeFeature)
      return this.equals((GeocodeFeature)that);
    return false;
  }

  public boolean equals(GeocodeFeature that) {
    if (that == null)
      return false;

    boolean this_present_cc = true && this.isSetCc();
    boolean that_present_cc = true && that.isSetCc();
    if (this_present_cc || that_present_cc) {
      if (!(this_present_cc && that_present_cc))
        return false;
      if (!this.cc.equals(that.cc))
        return false;
    }

    boolean this_present_geometry = true && this.isSetGeometry();
    boolean that_present_geometry = true && that.isSetGeometry();
    if (this_present_geometry || that_present_geometry) {
      if (!(this_present_geometry && that_present_geometry))
        return false;
      if (!this.geometry.equals(that.geometry))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_woeType = true && this.isSetWoeType();
    boolean that_present_woeType = true && that.isSetWoeType();
    if (this_present_woeType || that_present_woeType) {
      if (!(this_present_woeType && that_present_woeType))
        return false;
      if (!this.woeType.equals(that.woeType))
        return false;
    }

    boolean this_present_ids = true && this.isSetIds();
    boolean that_present_ids = true && that.isSetIds();
    if (this_present_ids || that_present_ids) {
      if (!(this_present_ids && that_present_ids))
        return false;
      if (!this.ids.equals(that.ids))
        return false;
    }

    boolean this_present_names = true && this.isSetNames();
    boolean that_present_names = true && that.isSetNames();
    if (this_present_names || that_present_names) {
      if (!(this_present_names && that_present_names))
        return false;
      if (!this.names.equals(that.names))
        return false;
    }

    boolean this_present_attribution = true && this.isSetAttribution();
    boolean that_present_attribution = true && that.isSetAttribution();
    if (this_present_attribution || that_present_attribution) {
      if (!(this_present_attribution && that_present_attribution))
        return false;
      if (!this.attribution.equals(that.attribution))
        return false;
    }

    boolean this_present_timezones = true && this.isSetTimezones();
    boolean that_present_timezones = true && that.isSetTimezones();
    if (this_present_timezones || that_present_timezones) {
      if (!(this_present_timezones && that_present_timezones))
        return false;
      if (!this.timezones.equals(that.timezones))
        return false;
    }

    boolean this_present_highlightedName = true && this.isSetHighlightedName();
    boolean that_present_highlightedName = true && that.isSetHighlightedName();
    if (this_present_highlightedName || that_present_highlightedName) {
      if (!(this_present_highlightedName && that_present_highlightedName))
        return false;
      if (!this.highlightedName.equals(that.highlightedName))
        return false;
    }

    boolean this_present_matchedName = true && this.isSetMatchedName();
    boolean that_present_matchedName = true && that.isSetMatchedName();
    if (this_present_matchedName || that_present_matchedName) {
      if (!(this_present_matchedName && that_present_matchedName))
        return false;
      if (!this.matchedName.equals(that.matchedName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GeocodeFeature other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GeocodeFeature typedOther = (GeocodeFeature)other;

    lastComparison = Boolean.valueOf(isSetCc()).compareTo(typedOther.isSetCc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCc()) {
      lastComparison = TBaseHelper.compareTo(this.cc, typedOther.cc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGeometry()).compareTo(typedOther.isSetGeometry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGeometry()) {
      lastComparison = TBaseHelper.compareTo(this.geometry, typedOther.geometry);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayName()).compareTo(typedOther.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = TBaseHelper.compareTo(this.displayName, typedOther.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWoeType()).compareTo(typedOther.isSetWoeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWoeType()) {
      lastComparison = TBaseHelper.compareTo(this.woeType, typedOther.woeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIds()).compareTo(typedOther.isSetIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIds()) {
      lastComparison = TBaseHelper.compareTo(this.ids, typedOther.ids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNames()).compareTo(typedOther.isSetNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNames()) {
      lastComparison = TBaseHelper.compareTo(this.names, typedOther.names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttribution()).compareTo(typedOther.isSetAttribution());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttribution()) {
      lastComparison = TBaseHelper.compareTo(this.attribution, typedOther.attribution);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimezones()).compareTo(typedOther.isSetTimezones());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimezones()) {
      lastComparison = TBaseHelper.compareTo(this.timezones, typedOther.timezones);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHighlightedName()).compareTo(typedOther.isSetHighlightedName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHighlightedName()) {
      lastComparison = TBaseHelper.compareTo(this.highlightedName, typedOther.highlightedName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMatchedName()).compareTo(typedOther.isSetMatchedName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMatchedName()) {
      lastComparison = TBaseHelper.compareTo(this.matchedName, typedOther.matchedName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CC
          if (field.type == TType.STRING) {
            this.cc = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // GEOMETRY
          if (field.type == TType.STRUCT) {
            this.geometry = new FeatureGeometry();
            this.geometry.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // DISPLAY_NAME
          if (field.type == TType.STRING) {
            this.displayName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // WOE_TYPE
          if (field.type == TType.I32) {
            this.woeType = YahooWoeType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // IDS
          if (field.type == TType.LIST) {
            {
              TList _list8 = iprot.readListBegin();
              this.ids = new ArrayList<FeatureId>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9)
              {
                FeatureId _elem10;
                _elem10 = new FeatureId();
                _elem10.read(iprot);
                this.ids.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // NAMES
          if (field.type == TType.LIST) {
            {
              TList _list11 = iprot.readListBegin();
              this.names = new ArrayList<FeatureName>(_list11.size);
              for (int _i12 = 0; _i12 < _list11.size; ++_i12)
              {
                FeatureName _elem13;
                _elem13 = new FeatureName();
                _elem13.read(iprot);
                this.names.add(_elem13);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // ATTRIBUTION
          if (field.type == TType.LIST) {
            {
              TList _list14 = iprot.readListBegin();
              this.attribution = new ArrayList<String>(_list14.size);
              for (int _i15 = 0; _i15 < _list14.size; ++_i15)
              {
                String _elem16;
                _elem16 = iprot.readString();
                this.attribution.add(_elem16);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // TIMEZONES
          if (field.type == TType.LIST) {
            {
              TList _list17 = iprot.readListBegin();
              this.timezones = new ArrayList<String>(_list17.size);
              for (int _i18 = 0; _i18 < _list17.size; ++_i18)
              {
                String _elem19;
                _elem19 = iprot.readString();
                this.timezones.add(_elem19);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // HIGHLIGHTED_NAME
          if (field.type == TType.STRING) {
            this.highlightedName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // MATCHED_NAME
          if (field.type == TType.STRING) {
            this.matchedName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.cc != null) {
      oprot.writeFieldBegin(CC_FIELD_DESC);
      oprot.writeString(this.cc);
      oprot.writeFieldEnd();
    }
    if (this.geometry != null) {
      oprot.writeFieldBegin(GEOMETRY_FIELD_DESC);
      this.geometry.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      if (isSetName()) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
    }
    if (this.displayName != null) {
      if (isSetDisplayName()) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
    }
    if (this.woeType != null) {
      if (isSetWoeType()) {
        oprot.writeFieldBegin(WOE_TYPE_FIELD_DESC);
        oprot.writeI32(this.woeType.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (this.ids != null) {
      if (isSetIds()) {
        oprot.writeFieldBegin(IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.ids.size()));
          for (FeatureId _iter20 : this.ids)
          {
            _iter20.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.names != null) {
      if (isSetNames()) {
        oprot.writeFieldBegin(NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.names.size()));
          for (FeatureName _iter21 : this.names)
          {
            _iter21.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.attribution != null) {
      if (isSetAttribution()) {
        oprot.writeFieldBegin(ATTRIBUTION_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.attribution.size()));
          for (String _iter22 : this.attribution)
          {
            oprot.writeString(_iter22);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.timezones != null) {
      if (isSetTimezones()) {
        oprot.writeFieldBegin(TIMEZONES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.timezones.size()));
          for (String _iter23 : this.timezones)
          {
            oprot.writeString(_iter23);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.highlightedName != null) {
      if (isSetHighlightedName()) {
        oprot.writeFieldBegin(HIGHLIGHTED_NAME_FIELD_DESC);
        oprot.writeString(this.highlightedName);
        oprot.writeFieldEnd();
      }
    }
    if (this.matchedName != null) {
      if (isSetMatchedName()) {
        oprot.writeFieldBegin(MATCHED_NAME_FIELD_DESC);
        oprot.writeString(this.matchedName);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GeocodeFeature(");
    boolean first = true;

    sb.append("cc:");
    if (this.cc == null) {
      sb.append("null");
    } else {
      sb.append(this.cc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("geometry:");
    if (this.geometry == null) {
      sb.append("null");
    } else {
      sb.append(this.geometry);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetDisplayName()) {
      if (!first) sb.append(", ");
      sb.append("displayName:");
      if (this.displayName == null) {
        sb.append("null");
      } else {
        sb.append(this.displayName);
      }
      first = false;
    }
    if (isSetWoeType()) {
      if (!first) sb.append(", ");
      sb.append("woeType:");
      if (this.woeType == null) {
        sb.append("null");
      } else {
        sb.append(this.woeType);
      }
      first = false;
    }
    if (isSetIds()) {
      if (!first) sb.append(", ");
      sb.append("ids:");
      if (this.ids == null) {
        sb.append("null");
      } else {
        sb.append(this.ids);
      }
      first = false;
    }
    if (isSetNames()) {
      if (!first) sb.append(", ");
      sb.append("names:");
      if (this.names == null) {
        sb.append("null");
      } else {
        sb.append(this.names);
      }
      first = false;
    }
    if (isSetAttribution()) {
      if (!first) sb.append(", ");
      sb.append("attribution:");
      if (this.attribution == null) {
        sb.append("null");
      } else {
        sb.append(this.attribution);
      }
      first = false;
    }
    if (isSetTimezones()) {
      if (!first) sb.append(", ");
      sb.append("timezones:");
      if (this.timezones == null) {
        sb.append("null");
      } else {
        sb.append(this.timezones);
      }
      first = false;
    }
    if (isSetHighlightedName()) {
      if (!first) sb.append(", ");
      sb.append("highlightedName:");
      if (this.highlightedName == null) {
        sb.append("null");
      } else {
        sb.append(this.highlightedName);
      }
      first = false;
    }
    if (isSetMatchedName()) {
      if (!first) sb.append(", ");
      sb.append("matchedName:");
      if (this.matchedName == null) {
        sb.append("null");
      } else {
        sb.append(this.matchedName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

