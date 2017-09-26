package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TreeView extends JsObject {

    private String jsBase;

    public TreeView() {

    }

    protected TreeView(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String child;
    private TreeDataItem child1;
    private TreeviewDataItem child2;

    public void setAddchild(String child) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child = child;
        } else {
            this.child = child;

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", child));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", child));
                js.setLength(0);
            }
        }
    }


    public void setAddchild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child1 = child1;
        } else {
            this.child1 = child1;

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", (child1 != null) ? child1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", (child1 != null) ? child1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setAddchild(TreeviewDataItem child2) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child2 = child2;
        } else {
            this.child2 = child2;

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", (child2 != null) ? child2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", (child2 != null) ? child2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String child3;
    private TreeDataItem child4;
    private TreeviewDataItem child5;
    private Double index;

    public void setAddchildat(String child3, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child3 = child3;
            this.index = index;
        } else {
            this.child3 = child3;
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", child3, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", child3, index));
                js.setLength(0);
            }
        }
    }


    public void setAddchildat(TreeDataItem child4, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child4 = child4;
            this.index = index;
        } else {
            this.child4 = child4;
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child4 != null) ? child4.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child4 != null) ? child4.generateJs() : "null", index));
                js.setLength(0);
            }
        }
    }


    public void setAddchildat(TreeviewDataItem child5, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child5 = child5;
            this.index = index;
        } else {
            this.child5 = child5;
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child5 != null) ? child5.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child5 != null) ? child5.generateJs() : "null", index));
                js.setLength(0);
            }
        }
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillMethodOrCsvMapping;
    private String fillMethodOrCsvMapping1;
    private String csvSettingsOrDeps;
    private Dependency[] csvSettingsOrDeps1;

    public void setAdddata(String data, TreeFillingMethod fillMethodOrCsvMapping, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps = csvSettingsOrDeps;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null", csvSettingsOrDeps));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null", csvSettingsOrDeps));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String data, TreeFillingMethod fillMethodOrCsvMapping, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null", arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null", arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String data, String fillMethodOrCsvMapping1, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps = csvSettingsOrDeps;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillMethodOrCsvMapping1, csvSettingsOrDeps));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillMethodOrCsvMapping1, csvSettingsOrDeps));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String data, String fillMethodOrCsvMapping1, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillMethodOrCsvMapping1, arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillMethodOrCsvMapping1, arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private TreeDataItem child6;
    private TreeviewDataItem child7;

    public void setIndexofchild(TreeDataItem child6) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            
            this.child6 = child6;
        } else {
            this.child6 = child6;

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child6 != null) ? child6.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child6 != null) ? child6.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIndexofchild(TreeviewDataItem child7) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            
            this.child7 = child7;
        } else {
            this.child7 = child7;

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child7 != null) ? child7.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child7 != null) ? child7.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private TreeDataItem child8;
    private TreeviewDataItem child9;

    public void setRemovechild(TreeDataItem child8) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            this.child8 = null;
            this.child9 = null;
            
            this.child8 = child8;
        } else {
            this.child8 = child8;

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", (child8 != null) ? child8.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", (child8 != null) ? child8.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setRemovechild(TreeviewDataItem child9) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            this.child8 = null;
            this.child9 = null;
            
            this.child9 = child9;
        } else {
            this.child9 = child9;

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", (child9 != null) ? child9.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", (child9 != null) ? child9.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

            js.append(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));
                js.setLength(0);
            }
        }
    }

    private String soughtField;
    private String search;
    private Double search1;
    private Boolean search2;
    private String comparisonFn;

    public void setSearch(String search, String soughtField, String comparisonFn) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search = search;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
        } else {
            this.search = search;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;

            js.append(String.format(Locale.US, jsBase + ".search(%s, %s, %s);", search, soughtField, comparisonFn));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s, %s);", search, soughtField, comparisonFn));
                js.setLength(0);
            }
        }
    }


    public void setSearch(Double search1, String soughtField, String comparisonFn) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search1 = search1;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
        } else {
            this.search1 = search1;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s, %s);", search1, soughtField, comparisonFn));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s, %s);", search1, soughtField, comparisonFn));
                js.setLength(0);
            }
        }
    }


    public void setSearch(Boolean search2, String soughtField, String comparisonFn) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search2 = search2;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
        } else {
            this.search2 = search2;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;

            js.append(String.format(Locale.US, jsBase + ".search(%b, %s, %s);", search2, soughtField, comparisonFn));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%b, %s, %s);", search2, soughtField, comparisonFn));
                js.setLength(0);
            }
        }
    }

    private String soughtField1;
    private String searchItems;
    private Double searchItems1;
    private Boolean searchItems2;
    private String comparisonFn1;

    public void setSearchitems(String searchItems, String soughtField1, String comparisonFn1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems = searchItems;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.searchItems = searchItems;
            this.soughtField1 = soughtField1;
            this.comparisonFn1 = comparisonFn1;

            js.append(String.format(Locale.US, jsBase + ".searchItems(%s, %s, %s);", searchItems, soughtField1, comparisonFn1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s, %s);", searchItems, soughtField1, comparisonFn1));
                js.setLength(0);
            }
        }
    }


    public void setSearchitems(Double searchItems1, String soughtField1, String comparisonFn1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems1 = searchItems1;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.searchItems1 = searchItems1;
            this.soughtField1 = soughtField1;
            this.comparisonFn1 = comparisonFn1;

            js.append(String.format(Locale.US, jsBase + ".searchItems(%f, %s, %s);", searchItems1, soughtField1, comparisonFn1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%f, %s, %s);", searchItems1, soughtField1, comparisonFn1));
                js.setLength(0);
            }
        }
    }


    public void setSearchitems(Boolean searchItems2, String soughtField1, String comparisonFn1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems2 = searchItems2;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.searchItems2 = searchItems2;
            this.soughtField1 = soughtField1;
            this.comparisonFn1 = comparisonFn1;

            js.append(String.format(Locale.US, jsBase + ".searchItems(%b, %s, %s);", searchItems2, soughtField1, comparisonFn1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%b, %s, %s);", searchItems2, soughtField1, comparisonFn1));
                js.setLength(0);
            }
        }
    }

    private String generateJSchild() {
        if (child != null) {
            return String.format(Locale.US, "child: %s,", child);
        }
        return "";
    }

    private String generateJSchild1() {
        if (child1 != null) {
            return String.format(Locale.US, "child: %s,", (child1 != null) ? child1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild2() {
        if (child2 != null) {
            return String.format(Locale.US, "child: %s,", (child2 != null) ? child2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild3() {
        if (child3 != null) {
            return String.format(Locale.US, "child: %s,", child3);
        }
        return "";
    }

    private String generateJSchild4() {
        if (child4 != null) {
            return String.format(Locale.US, "child: %s,", (child4 != null) ? child4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild5() {
        if (child5 != null) {
            return String.format(Locale.US, "child: %s,", (child5 != null) ? child5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", data);
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", data1);
        }
        return "";
    }

    private String generateJSfillMethodOrCsvMapping() {
        if (fillMethodOrCsvMapping != null) {
            return String.format(Locale.US, "fillMethodOrCsvMapping: %s,", (fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillMethodOrCsvMapping1() {
        if (fillMethodOrCsvMapping1 != null) {
            return String.format(Locale.US, "fillMethodOrCsvMapping: %s,", fillMethodOrCsvMapping1);
        }
        return "";
    }

    private String generateJScsvSettingsOrDeps() {
        if (csvSettingsOrDeps != null) {
            return String.format(Locale.US, "csvSettingsOrDeps: %s,", csvSettingsOrDeps);
        }
        return "";
    }

    private String generateJScsvSettingsOrDeps1() {
        if (csvSettingsOrDeps1 != null) {
            return String.format(Locale.US, "csvSettingsOrDeps: %s,", arrayToString(csvSettingsOrDeps1));
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSchild6() {
        if (child6 != null) {
            return String.format(Locale.US, "child: %s,", (child6 != null) ? child6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild7() {
        if (child7 != null) {
            return String.format(Locale.US, "child: %s,", (child7 != null) ? child7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild8() {
        if (child8 != null) {
            return String.format(Locale.US, "child: %s,", (child8 != null) ? child8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild9() {
        if (child9 != null) {
            return String.format(Locale.US, "child: %s,", (child9 != null) ? child9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSsoughtField() {
        if (soughtField != null) {
            return String.format(Locale.US, "soughtField: %s,", soughtField);
        }
        return "";
    }

    private String generateJSsearch() {
        if (search != null) {
            return String.format(Locale.US, "search: %s,", search);
        }
        return "";
    }

    private String generateJSsearch1() {
        if (search1 != null) {
            return String.format(Locale.US, "search: %f,", search1);
        }
        return "";
    }

    private String generateJSsearch2() {
        if (search2 != null) {
            return String.format(Locale.US, "search: %b,", search2);
        }
        return "";
    }

    private String generateJScomparisonFn() {
        if (comparisonFn != null) {
            return String.format(Locale.US, "comparisonFn: %s,", comparisonFn);
        }
        return "";
    }

    private String generateJSsoughtField1() {
        if (soughtField1 != null) {
            return String.format(Locale.US, "soughtField: %s,", soughtField1);
        }
        return "";
    }

    private String generateJSsearchItems() {
        if (searchItems != null) {
            return String.format(Locale.US, "searchItems: %s,", searchItems);
        }
        return "";
    }

    private String generateJSsearchItems1() {
        if (searchItems1 != null) {
            return String.format(Locale.US, "searchItems: %f,", searchItems1);
        }
        return "";
    }

    private String generateJSsearchItems2() {
        if (searchItems2 != null) {
            return String.format(Locale.US, "searchItems: %b,", searchItems2);
        }
        return "";
    }

    private String generateJScomparisonFn1() {
        if (comparisonFn1 != null) {
            return String.format(Locale.US, "comparisonFn: %s,", comparisonFn1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSchild());
            js.append(generateJSchild1());
            js.append(generateJSchild2());
            js.append(generateJSchild3());
            js.append(generateJSchild4());
            js.append(generateJSchild5());
            js.append(generateJSindex());
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSfillMethodOrCsvMapping());
            js.append(generateJSfillMethodOrCsvMapping1());
            js.append(generateJScsvSettingsOrDeps());
            js.append(generateJScsvSettingsOrDeps1());
            js.append(generateJSindex1());
            js.append(generateJSchild6());
            js.append(generateJSchild7());
            js.append(generateJSchild8());
            js.append(generateJSchild9());
            js.append(generateJSindex2());
            js.append(generateJSsoughtField());
            js.append(generateJSsearch());
            js.append(generateJSsearch1());
            js.append(generateJSsearch2());
            js.append(generateJScomparisonFn());
            js.append(generateJSsoughtField1());
            js.append(generateJSsearchItems());
            js.append(generateJSsearchItems1());
            js.append(generateJSsearchItems2());
            js.append(generateJScomparisonFn1());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}