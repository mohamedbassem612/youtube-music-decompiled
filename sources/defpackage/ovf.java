package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ovf implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ovf(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03da A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:126:0x03e9 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:128:0x041f A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0427 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0435 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02b4 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02c3 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02f9 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0301 A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x030f A[Catch: all -> 0x0469, TryCatch #2 {all -> 0x0469, blocks: (B:70:0x0219, B:72:0x021d, B:74:0x022b, B:76:0x0235, B:78:0x023b, B:80:0x0245, B:82:0x024b, B:84:0x02a3, B:87:0x02af, B:89:0x02b4, B:91:0x02bd, B:94:0x02c6, B:99:0x031b, B:93:0x02c3, B:95:0x02f9, B:97:0x0301, B:98:0x030f, B:103:0x0342, B:105:0x0346, B:107:0x0354, B:109:0x035e, B:111:0x0364, B:113:0x036e, B:115:0x0374, B:117:0x03c9, B:120:0x03d5, B:122:0x03da, B:124:0x03e3, B:127:0x03ec, B:132:0x0441, B:126:0x03e9, B:128:0x041f, B:130:0x0427, B:131:0x0435), top: B:141:0x000b }] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r0v52, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r1v25, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        atdg atdgVar;
        ViewGroup.LayoutParams layoutParams;
        View rootView;
        atdg atdgVar2;
        ViewGroup.LayoutParams layoutParams2;
        View rootView2;
        ahnh ahnhVar;
        View view = null;
        try {
            switch (this.$cid) {
                case 0:
                    return ((ovg) this.a).a((ovd) this.b, (ElementsServices) this.c);
                case 1:
                    return ((mkn) this.b).h((View) this.c, (adfx) this.a);
                case 2:
                    float fA = ((ElementsRuntimeImpl) this.a).c.a();
                    boolean zEquals = Objects.equals(Looper.myLooper(), Looper.getMainLooper());
                    Object obj = this.b;
                    Object obj2 = this.c;
                    if (!zEquals || !(obj2 instanceof ViewGroup)) {
                        return obj2;
                    }
                    ViewGroup viewGroup = (ViewGroup) obj2;
                    mep mepVar = atdg.d;
                    if (!((mew) obj).e(mepVar) || (atdgVar = (atdg) ((mew) obj).d(mepVar)) == null || !atdgVar.aU()) {
                        return obj2;
                    }
                    atei ateiVarAV = atdgVar.aV();
                    if (!ateiVarAV.aW() || !ateiVarAV.aX()) {
                        return obj2;
                    }
                    atks atksVarAY = ateiVarAV.aY();
                    atna atnaVarAZ = ateiVarAV.aZ();
                    int iRound = Math.round(Float.intBitsToFloat(Memory.peekInt(atksVarAY.c + 12, false)) * fA);
                    int iRound2 = Math.round(Float.intBitsToFloat(Memory.peekInt(atksVarAY.c + 16, false)) * fA);
                    int iRound3 = Math.round(Float.intBitsToFloat(Memory.peekInt(atnaVarAZ.c + 12, false)) * fA);
                    int iRound4 = Math.round(Float.intBitsToFloat(Memory.peekInt(atnaVarAZ.c + 16, false)) * fA);
                    int childCount = viewGroup.getChildCount();
                    int iE = ElementsRuntimeImpl.e();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getId() == iE) {
                            view = childAt;
                            if (view == null) {
                                rootView = ((View) obj2).getRootView();
                                if (rootView != null || rootView.getContext() == null) {
                                    rootView = (View) obj2;
                                }
                                View view2 = new View(rootView.getContext());
                                view2.setId(ElementsRuntimeImpl.e());
                                view2.setVisibility(4);
                                view2.setClickable(false);
                                view2.setLongClickable(false);
                                view2.setFocusable(false);
                                view2.setImportantForAccessibility(2);
                                view2.setWillNotDraw(true);
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iRound3, iRound4);
                                marginLayoutParams.leftMargin = iRound;
                                marginLayoutParams.topMargin = iRound2;
                                view2.setLayoutParams(marginLayoutParams);
                                viewGroup.addView(view2);
                                view = view2;
                            } else {
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                                    marginLayoutParams2.width = iRound3;
                                    marginLayoutParams2.height = iRound4;
                                    marginLayoutParams2.leftMargin = iRound;
                                    marginLayoutParams2.topMargin = iRound2;
                                    view.setLayoutParams(marginLayoutParams2);
                                } else {
                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(iRound3, iRound4);
                                    marginLayoutParams3.leftMargin = iRound;
                                    marginLayoutParams3.topMargin = iRound2;
                                    view.setLayoutParams(marginLayoutParams3);
                                }
                            }
                            view.layout(iRound, iRound2, iRound3 + iRound, iRound4 + iRound2);
                        }
                        break;
                    }
                    if (view == null) {
                        rootView = ((View) obj2).getRootView();
                        if (rootView != null) {
                            rootView = (View) obj2;
                        } else {
                            rootView = (View) obj2;
                        }
                        View view3 = new View(rootView.getContext());
                        view3.setId(ElementsRuntimeImpl.e());
                        view3.setVisibility(4);
                        view3.setClickable(false);
                        view3.setLongClickable(false);
                        view3.setFocusable(false);
                        view3.setImportantForAccessibility(2);
                        view3.setWillNotDraw(true);
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(iRound3, iRound4);
                        marginLayoutParams4.leftMargin = iRound;
                        marginLayoutParams4.topMargin = iRound2;
                        view3.setLayoutParams(marginLayoutParams4);
                        viewGroup.addView(view3);
                        view = view3;
                    } else {
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams5.width = iRound3;
                            marginLayoutParams5.height = iRound4;
                            marginLayoutParams5.leftMargin = iRound;
                            marginLayoutParams5.topMargin = iRound2;
                            view.setLayoutParams(marginLayoutParams5);
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(iRound3, iRound4);
                            marginLayoutParams6.leftMargin = iRound;
                            marginLayoutParams6.topMargin = iRound2;
                            view.setLayoutParams(marginLayoutParams6);
                        }
                    }
                    view.layout(iRound, iRound2, iRound3 + iRound, iRound4 + iRound2);
                    break;
                    break;
                case 3:
                    float fA2 = ((ElementsRuntimeImpl) this.a).c.a();
                    boolean zEquals2 = Objects.equals(Looper.myLooper(), Looper.getMainLooper());
                    Object obj3 = this.b;
                    Object obj4 = this.c;
                    if (!zEquals2 || !(obj4 instanceof ViewGroup)) {
                        return obj4;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) obj4;
                    mep mepVar2 = atdg.d;
                    if (!((mew) obj3).e(mepVar2) || (atdgVar2 = (atdg) ((mew) obj3).d(mepVar2)) == null || !atdgVar2.aU()) {
                        return obj4;
                    }
                    atei ateiVarAV2 = atdgVar2.aV();
                    if (!ateiVarAV2.aW() || !ateiVarAV2.aX()) {
                        return obj4;
                    }
                    atks atksVarAY2 = ateiVarAV2.aY();
                    atna atnaVarAZ2 = ateiVarAV2.aZ();
                    int iRound5 = Math.round(Float.intBitsToFloat(Memory.peekInt(atksVarAY2.c + 12, false)) * fA2);
                    int iRound6 = Math.round(Float.intBitsToFloat(Memory.peekInt(atksVarAY2.c + 16, false)) * fA2);
                    int iRound7 = Math.round(Float.intBitsToFloat(Memory.peekInt(atnaVarAZ2.c + 12, false)) * fA2);
                    int iRound8 = Math.round(Float.intBitsToFloat(Memory.peekInt(atnaVarAZ2.c + 16, false)) * fA2);
                    int childCount2 = viewGroup2.getChildCount();
                    int iE2 = ElementsRuntimeImpl.e();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = viewGroup2.getChildAt(i2);
                        if (childAt2.getId() == iE2) {
                            view = childAt2;
                            if (view == null) {
                                rootView2 = ((View) obj4).getRootView();
                                if (rootView2 != null || rootView2.getContext() == null) {
                                    rootView2 = (View) obj4;
                                }
                                View view4 = new View(rootView2.getContext());
                                view4.setId(ElementsRuntimeImpl.e());
                                view4.setVisibility(4);
                                view4.setClickable(false);
                                view4.setLongClickable(false);
                                view4.setFocusable(false);
                                view4.setImportantForAccessibility(2);
                                view4.setWillNotDraw(true);
                                ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(iRound7, iRound8);
                                marginLayoutParams7.leftMargin = iRound5;
                                marginLayoutParams7.topMargin = iRound6;
                                view4.setLayoutParams(marginLayoutParams7);
                                viewGroup2.addView(view4);
                                view = view4;
                            } else {
                                layoutParams2 = view.getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                    marginLayoutParams8.width = iRound7;
                                    marginLayoutParams8.height = iRound8;
                                    marginLayoutParams8.leftMargin = iRound5;
                                    marginLayoutParams8.topMargin = iRound6;
                                    view.setLayoutParams(marginLayoutParams8);
                                } else {
                                    ViewGroup.MarginLayoutParams marginLayoutParams9 = new ViewGroup.MarginLayoutParams(iRound7, iRound8);
                                    marginLayoutParams9.leftMargin = iRound5;
                                    marginLayoutParams9.topMargin = iRound6;
                                    view.setLayoutParams(marginLayoutParams9);
                                }
                            }
                            view.layout(iRound5, iRound6, iRound7 + iRound5, iRound8 + iRound6);
                        }
                        break;
                    }
                    if (view == null) {
                        rootView2 = ((View) obj4).getRootView();
                        if (rootView2 != null) {
                            rootView2 = (View) obj4;
                        } else {
                            rootView2 = (View) obj4;
                        }
                        View view5 = new View(rootView2.getContext());
                        view5.setId(ElementsRuntimeImpl.e());
                        view5.setVisibility(4);
                        view5.setClickable(false);
                        view5.setLongClickable(false);
                        view5.setFocusable(false);
                        view5.setImportantForAccessibility(2);
                        view5.setWillNotDraw(true);
                        ViewGroup.MarginLayoutParams marginLayoutParams10 = new ViewGroup.MarginLayoutParams(iRound7, iRound8);
                        marginLayoutParams10.leftMargin = iRound5;
                        marginLayoutParams10.topMargin = iRound6;
                        view5.setLayoutParams(marginLayoutParams10);
                        viewGroup2.addView(view5);
                        view = view5;
                    } else {
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams11.width = iRound7;
                            marginLayoutParams11.height = iRound8;
                            marginLayoutParams11.leftMargin = iRound5;
                            marginLayoutParams11.topMargin = iRound6;
                            view.setLayoutParams(marginLayoutParams11);
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams12 = new ViewGroup.MarginLayoutParams(iRound7, iRound8);
                            marginLayoutParams12.leftMargin = iRound5;
                            marginLayoutParams12.topMargin = iRound6;
                            view.setLayoutParams(marginLayoutParams12);
                        }
                    }
                    view.layout(iRound5, iRound6, iRound7 + iRound5, iRound8 + iRound6);
                    break;
                    break;
                case 4:
                    Object obj5 = this.a;
                    Object obj6 = this.b;
                    Object obj7 = this.c;
                    try {
                        Object obj8 = ((yre) obj6).c;
                        ahni.a(obj8);
                        ahni.a(obj5);
                        Intent intent = new Intent("com.google.android.build.data.Properties");
                        intent.setPackage((String) obj5);
                        List<ResolveInfo> listQueryIntentServices = ((PackageManager) obj8).queryIntentServices(intent, 787072);
                        if (!listQueryIntentServices.isEmpty()) {
                            if (listQueryIntentServices.size() > 1) {
                                throw new IOException("Failed to resolve target AndroidBuildData");
                            }
                            int i3 = listQueryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                            if (i3 == 0) {
                                ahnhVar = ahni.a;
                            } else {
                                try {
                                    ahnhVar = (ahnh) aihn.parseFrom(ahnh.a, ((qnk) obj7).a().openRawResource(i3), ExtensionRegistryLite.a);
                                } catch (PackageManager.NameNotFoundException unused) {
                                    ahnhVar = ahni.a;
                                }
                            }
                            break;
                        } else {
                            ahnhVar = ahni.a;
                        }
                        return Long.valueOf(ahnhVar.b);
                    } catch (IOException e) {
                        Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(obj5)), e);
                        return -1L;
                    }
                case 5:
                    ?? r1 = this.b;
                    if ((aczl.j(r1).b & 2) != 0) {
                        aijp aijpVar = aczl.j(r1).d;
                        if (aijpVar == null) {
                            aijpVar = aijp.a;
                        }
                        return Long.valueOf(aikz.a(aijpVar));
                    }
                    if (r1.m().c) {
                        ?? r2 = ((aczl) this.a).g;
                        if (((Optional) r2.io()).isPresent() && (((aplf) ((Optional) r2.io()).get()).c & SemanticState.Focused) != 0) {
                            return Long.valueOf(this.c.f().toEpochMilli() + ((long) ((aplf) ((Optional) r2.io()).get()).g));
                        }
                    }
                    return 0L;
                case 6:
                    aqmv aqmvVarA = aqmv.a(((ascs) this.b).e);
                    if (aqmvVarA == null) {
                        aqmvVarA = aqmv.TIME_SENSITIVITY_UNKNOWN;
                    }
                    return aczl.k((aqrv) this.c, aqmvVarA, (String) this.a);
                case 7:
                    return Boolean.valueOf(((aqrv) this.b).c ? ((Optional) ((aczl) this.c).g.io()).isPresent() : ((ascs) this.a).c);
                case 8:
                    return ((aapa) this.c).e((abnl) this.b, (abnp) this.a);
                case 9:
                    return ((aapa) this.c).e((abnl) this.b, (abnp) this.a);
                case 10:
                    abpd abpdVar = ((aboq) this.b).a;
                    abpw abpwVar = (abpw) this.a;
                    return abpdVar.v(abpwVar.a, abpwVar.c, null, abpwVar.d, (abnp) this.c);
                case 11:
                    abpd abpdVar2 = ((aboq) this.b).a;
                    abpw abpwVar2 = (abpw) this.a;
                    return abpdVar2.v(abpwVar2.a, abpwVar2.c, null, abpwVar2.d, (abnp) this.c);
                case 12:
                    return ((aboq) this.a).e.n((abnl) this.c, (abnp) this.b);
                case 13:
                    final adgx adgxVar = (adgx) this.b;
                    aciz acizVar = adgxVar.c;
                    avlb avlbVarC = adgxVar.a.c(this.a, (nrv) this.c);
                    return !((vxz) acizVar.b.io()).l(85, 45687576L, false) ? avlbVarC.f(new avlf() { // from class: adgv
                        @Override // defpackage.avlf
                        public final avle c(avlb avlbVar) {
                            return new adgw(adgxVar, avlbVar);
                        }
                    }) : avlbVarC;
                default:
                    return abhh.h((String[]) this.a, (Uri) this.c, (Bundle) this.b);
            }
            return view;
        } catch (Throwable unused2) {
            return this;
        }
    }

    public /* synthetic */ ovf(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ovf(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ovf(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ovf(mkn mknVar, View view, adfx adfxVar, int i) {
        this.$cid = i;
        this.b = mknVar;
        this.c = view;
        this.a = adfxVar;
    }
}
