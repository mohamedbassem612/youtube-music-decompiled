package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afjq {
    private static afjq f;
    public final Object a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public afjq(pj pjVar, ejt ejtVar, ClassLoader classLoader, cj cjVar, Bundle bundle) {
        this.c = false;
        this.b = -1;
        this.a = pjVar;
        this.e = ejtVar;
        cc ccVarA = ((dj) bundle.getParcelable("state")).a(cjVar);
        this.d = ccVarA;
        ccVarA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        ccVarA.setArguments(bundle2);
        if (dd.aa(2)) {
            Objects.toString(ccVarA);
        }
    }

    public static synchronized afjq l(Context context) {
        afjq afjqVar;
        afjqVar = f;
        if (afjqVar == null) {
            afjqVar = new afjq(context);
            f = afjqVar;
        }
        return afjqVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void a(boolean z) {
        qpj.c();
        synchronized (this.a) {
            if (z != this.c) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.c = z;
            }
        }
    }

    public final int b() {
        int i;
        synchronized (this.d) {
            i = this.b;
        }
        return i;
    }

    public final void c() {
        CopyOnWriteArrayList<evu> copyOnWriteArrayList = (CopyOnWriteArrayList) this.a;
        for (evu evuVar : copyOnWriteArrayList) {
            if (((WeakReference) evuVar.a).get() == null) {
                copyOnWriteArrayList.remove(evuVar);
            }
        }
    }

    public final void d(int i) {
        c();
        synchronized (this.d) {
            if (this.c && this.b == i) {
                return;
            }
            this.c = true;
            this.b = i;
            Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
            while (it.hasNext()) {
                ((evu) it.next()).a();
            }
        }
    }

    public final Bundle e() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        cc ccVar = (cc) this.d;
        if (ccVar.mState == -1 && (bundle = ccVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new dj(ccVar));
        if (ccVar.mState > 0) {
            Bundle bundle3 = new Bundle();
            ccVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            ((pj) this.a).s(ccVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            ccVar.mSavedStateRegistryController.d(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleC = ccVar.mChildFragmentManager.c();
            if (!bundleC.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC);
            }
            if (ccVar.mView != null) {
                k();
            }
            SparseArray<? extends Parcelable> sparseArray = ccVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = ccVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = ccVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void f() {
        View view;
        View view2;
        Object obj = this.d;
        cc ccVar = (cc) obj;
        cc ccVarH = dd.h(ccVar.mContainer);
        cc parentFragment = ccVar.getParentFragment();
        if (ccVarH != null && !ccVarH.equals(parentFragment)) {
            int i = ccVar.mContainerId;
            int i2 = bmy.a;
            obj.getClass();
            bnk bnkVar = new bnk(ccVar, ccVarH, i);
            bmy.d(bnkVar);
            bmx bmxVarB = bmy.b(ccVar);
            if (bmxVarB.b.contains(bmw.e) && bmy.e(bmxVarB, obj.getClass(), bnkVar.getClass())) {
                bmy.c(bmxVarB, bnkVar);
            }
        }
        Object obj2 = this.e;
        ViewGroup viewGroup = ccVar.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) ((ejt) obj2).a;
            int iIndexOf = arrayList.indexOf(obj);
            for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
                cc ccVar2 = (cc) arrayList.get(i3);
                if (ccVar2.mContainer == viewGroup && (view2 = ccVar2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                cc ccVar3 = (cc) arrayList.get(iIndexOf);
                if (ccVar3.mContainer == viewGroup && (view = ccVar3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        ccVar.mContainer.addView(ccVar.mView, iIndexOfChild);
    }

    final void g() {
        String resourceName;
        Object obj = this.d;
        cc ccVar = (cc) obj;
        if (ccVar.mFromLayout) {
            return;
        }
        if (dd.aa(3)) {
            Objects.toString(obj);
        }
        Bundle bundle = ccVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = ccVar.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = ccVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = ccVar.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.bV(obj, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) ccVar.mFragmentManager.q.a(i);
                if (viewGroup == null) {
                    if (!ccVar.mRestored && !ccVar.mInDynamicContainer) {
                        try {
                            resourceName = ((cc) obj).getResources().getResourceName(((cc) obj).mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        Object obj2 = this.d;
                        sb.append(Integer.toHexString(((cc) obj2).mContainerId));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(obj2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Object obj3 = this.d;
                    int i2 = bmy.a;
                    obj3.getClass();
                    cc ccVar2 = (cc) obj3;
                    bnj bnjVar = new bnj(ccVar2, viewGroup);
                    bmy.d(bnjVar);
                    bmx bmxVarB = bmy.b(ccVar2);
                    if (bmxVarB.b.contains(bmw.i) && bmy.e(bmxVarB, obj3.getClass(), bnjVar.getClass())) {
                        bmy.c(bmxVarB, bnjVar);
                    }
                }
            }
        }
        Object obj4 = this.d;
        cc ccVar3 = (cc) obj4;
        ccVar3.mContainer = viewGroup;
        ccVar3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (ccVar3.mView != null) {
            if (dd.aa(3)) {
                Objects.toString(obj4);
            }
            ccVar3.mView.setSaveFromParentEnabled(false);
            ccVar3.mView.setTag(R.id.fragment_container_view_tag, obj4);
            if (viewGroup != null) {
                f();
            }
            if (ccVar3.mHidden) {
                ccVar3.mView.setVisibility(8);
            }
            if (ccVar3.mView.isAttachedToWindow()) {
                View view = ccVar3.mView;
                int i3 = bac.a;
                view.requestApplyInsets();
            } else {
                View view2 = ccVar3.mView;
                view2.addOnAttachStateChangeListener(new jld(view2, 1));
            }
            ccVar3.performViewCreated();
            ((pj) this.a).v(ccVar3, ccVar3.mView, bundle2, false);
            int visibility = ccVar3.mView.getVisibility();
            ccVar3.setPostOnViewCreatedAlpha(ccVar3.mView.getAlpha());
            if (ccVar3.mContainer != null && visibility == 0) {
                View viewFindFocus = ccVar3.mView.findFocus();
                if (viewFindFocus != null) {
                    ccVar3.setFocusedView(viewFindFocus);
                    if (dd.aa(2)) {
                        Objects.toString(viewFindFocus);
                        Objects.toString(obj4);
                    }
                }
                ccVar3.mView.setAlpha(0.0f);
            }
        }
        ccVar3.mState = 2;
    }

    public final void h() {
        Object obj = this.d;
        cc ccVar = (cc) obj;
        if (ccVar.mFromLayout && ccVar.mInLayout && !ccVar.mPerformedCreateView) {
            if (dd.aa(3)) {
                Objects.toString(obj);
            }
            Bundle bundle = ccVar.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ccVar.performCreateView(ccVar.performGetLayoutInflater(bundle2), null, bundle2);
            View view = ccVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ccVar.mView.setTag(R.id.fragment_container_view_tag, obj);
                if (ccVar.mHidden) {
                    ccVar.mView.setVisibility(8);
                }
                ccVar.performViewCreated();
                ((pj) this.a).v(ccVar, ccVar.mView, bundle2, false);
                ccVar.mState = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:224:0x04cb A[Catch: all -> 0x068b, TryCatch #0 {all -> 0x068b, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:78:0x012d, B:85:0x0140, B:87:0x0146, B:88:0x0149, B:90:0x0152, B:92:0x0159, B:94:0x015f, B:96:0x0166, B:97:0x016b, B:99:0x0174, B:100:0x0186, B:101:0x01b8, B:102:0x01be, B:104:0x01c4, B:105:0x01c7, B:106:0x01d8, B:108:0x01df, B:110:0x01e6, B:112:0x020b, B:113:0x020e, B:114:0x0211, B:115:0x0217, B:117:0x021d, B:118:0x0220, B:120:0x0227, B:121:0x022b, B:122:0x023c, B:123:0x0244, B:125:0x024a, B:126:0x024d, B:128:0x0254, B:129:0x0258, B:131:0x025f, B:132:0x0279, B:133:0x0285, B:135:0x028b, B:136:0x028e, B:139:0x029b, B:141:0x02a7, B:151:0x0311, B:152:0x0314, B:142:0x02ba, B:143:0x02db, B:144:0x02dc, B:146:0x02e3, B:148:0x02ed, B:149:0x030e, B:153:0x0341, B:154:0x0343, B:156:0x0348, B:158:0x034e, B:159:0x0351, B:160:0x0362, B:161:0x0368, B:163:0x036e, B:164:0x0371, B:165:0x0382, B:167:0x0388, B:168:0x038b, B:170:0x0392, B:176:0x03b4, B:178:0x03bb, B:180:0x03c2, B:182:0x03da, B:183:0x03dd, B:184:0x03e0, B:171:0x03a3, B:173:0x03aa, B:175:0x03b1, B:185:0x03e6, B:186:0x03f1, B:188:0x03f7, B:189:0x03fa, B:191:0x0401, B:193:0x0408, B:194:0x040b, B:195:0x043d, B:197:0x0444, B:199:0x045a, B:200:0x0468, B:202:0x046e, B:203:0x0471, B:205:0x0478, B:210:0x0486, B:212:0x048d, B:214:0x049b, B:216:0x04ad, B:218:0x04b4, B:220:0x04bc, B:222:0x04c0, B:223:0x04c5, B:224:0x04cb, B:226:0x04d4, B:229:0x04ea, B:232:0x04f3, B:233:0x0501, B:234:0x051e, B:236:0x0524, B:238:0x052c, B:240:0x053e, B:241:0x054b, B:243:0x0552, B:244:0x055d, B:227:0x04df, B:245:0x0563, B:247:0x0569, B:248:0x056c, B:250:0x059f, B:254:0x05b9, B:256:0x05bf, B:257:0x05c2, B:252:0x05a8, B:261:0x05ce, B:263:0x05d5, B:265:0x05de, B:267:0x05e5, B:269:0x05eb, B:270:0x05ee, B:272:0x0608, B:273:0x060b, B:274:0x0611, B:276:0x0618, B:278:0x061f, B:280:0x0626, B:282:0x063f, B:284:0x0645, B:285:0x0648, B:286:0x064c, B:288:0x0652, B:289:0x0655, B:290:0x0658, B:292:0x065f, B:294:0x0666, B:296:0x066f, B:297:0x0671, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x0061, B:28:0x006c, B:32:0x0076, B:33:0x0080, B:34:0x0084, B:36:0x008b, B:38:0x0092, B:39:0x0096, B:41:0x009d, B:42:0x00a1, B:44:0x00a8, B:46:0x00c6, B:48:0x00ca, B:50:0x00d3, B:53:0x00d9, B:58:0x00e2, B:67:0x0107, B:69:0x010e, B:71:0x0115, B:72:0x0119, B:74:0x0120, B:75:0x0124, B:77:0x012a, B:60:0x00e9, B:61:0x00ee, B:63:0x00f5, B:65:0x00fe, B:66:0x0103, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:303:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x04d4 A[Catch: all -> 0x068b, TryCatch #0 {all -> 0x068b, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:78:0x012d, B:85:0x0140, B:87:0x0146, B:88:0x0149, B:90:0x0152, B:92:0x0159, B:94:0x015f, B:96:0x0166, B:97:0x016b, B:99:0x0174, B:100:0x0186, B:101:0x01b8, B:102:0x01be, B:104:0x01c4, B:105:0x01c7, B:106:0x01d8, B:108:0x01df, B:110:0x01e6, B:112:0x020b, B:113:0x020e, B:114:0x0211, B:115:0x0217, B:117:0x021d, B:118:0x0220, B:120:0x0227, B:121:0x022b, B:122:0x023c, B:123:0x0244, B:125:0x024a, B:126:0x024d, B:128:0x0254, B:129:0x0258, B:131:0x025f, B:132:0x0279, B:133:0x0285, B:135:0x028b, B:136:0x028e, B:139:0x029b, B:141:0x02a7, B:151:0x0311, B:152:0x0314, B:142:0x02ba, B:143:0x02db, B:144:0x02dc, B:146:0x02e3, B:148:0x02ed, B:149:0x030e, B:153:0x0341, B:154:0x0343, B:156:0x0348, B:158:0x034e, B:159:0x0351, B:160:0x0362, B:161:0x0368, B:163:0x036e, B:164:0x0371, B:165:0x0382, B:167:0x0388, B:168:0x038b, B:170:0x0392, B:176:0x03b4, B:178:0x03bb, B:180:0x03c2, B:182:0x03da, B:183:0x03dd, B:184:0x03e0, B:171:0x03a3, B:173:0x03aa, B:175:0x03b1, B:185:0x03e6, B:186:0x03f1, B:188:0x03f7, B:189:0x03fa, B:191:0x0401, B:193:0x0408, B:194:0x040b, B:195:0x043d, B:197:0x0444, B:199:0x045a, B:200:0x0468, B:202:0x046e, B:203:0x0471, B:205:0x0478, B:210:0x0486, B:212:0x048d, B:214:0x049b, B:216:0x04ad, B:218:0x04b4, B:220:0x04bc, B:222:0x04c0, B:223:0x04c5, B:224:0x04cb, B:226:0x04d4, B:229:0x04ea, B:232:0x04f3, B:233:0x0501, B:234:0x051e, B:236:0x0524, B:238:0x052c, B:240:0x053e, B:241:0x054b, B:243:0x0552, B:244:0x055d, B:227:0x04df, B:245:0x0563, B:247:0x0569, B:248:0x056c, B:250:0x059f, B:254:0x05b9, B:256:0x05bf, B:257:0x05c2, B:252:0x05a8, B:261:0x05ce, B:263:0x05d5, B:265:0x05de, B:267:0x05e5, B:269:0x05eb, B:270:0x05ee, B:272:0x0608, B:273:0x060b, B:274:0x0611, B:276:0x0618, B:278:0x061f, B:280:0x0626, B:282:0x063f, B:284:0x0645, B:285:0x0648, B:286:0x064c, B:288:0x0652, B:289:0x0655, B:290:0x0658, B:292:0x065f, B:294:0x0666, B:296:0x066f, B:297:0x0671, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x0061, B:28:0x006c, B:32:0x0076, B:33:0x0080, B:34:0x0084, B:36:0x008b, B:38:0x0092, B:39:0x0096, B:41:0x009d, B:42:0x00a1, B:44:0x00a8, B:46:0x00c6, B:48:0x00ca, B:50:0x00d3, B:53:0x00d9, B:58:0x00e2, B:67:0x0107, B:69:0x010e, B:71:0x0115, B:72:0x0119, B:74:0x0120, B:75:0x0124, B:77:0x012a, B:60:0x00e9, B:61:0x00ee, B:63:0x00f5, B:65:0x00fe, B:66:0x0103, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:303:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x04df A[Catch: all -> 0x068b, TryCatch #0 {all -> 0x068b, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:78:0x012d, B:85:0x0140, B:87:0x0146, B:88:0x0149, B:90:0x0152, B:92:0x0159, B:94:0x015f, B:96:0x0166, B:97:0x016b, B:99:0x0174, B:100:0x0186, B:101:0x01b8, B:102:0x01be, B:104:0x01c4, B:105:0x01c7, B:106:0x01d8, B:108:0x01df, B:110:0x01e6, B:112:0x020b, B:113:0x020e, B:114:0x0211, B:115:0x0217, B:117:0x021d, B:118:0x0220, B:120:0x0227, B:121:0x022b, B:122:0x023c, B:123:0x0244, B:125:0x024a, B:126:0x024d, B:128:0x0254, B:129:0x0258, B:131:0x025f, B:132:0x0279, B:133:0x0285, B:135:0x028b, B:136:0x028e, B:139:0x029b, B:141:0x02a7, B:151:0x0311, B:152:0x0314, B:142:0x02ba, B:143:0x02db, B:144:0x02dc, B:146:0x02e3, B:148:0x02ed, B:149:0x030e, B:153:0x0341, B:154:0x0343, B:156:0x0348, B:158:0x034e, B:159:0x0351, B:160:0x0362, B:161:0x0368, B:163:0x036e, B:164:0x0371, B:165:0x0382, B:167:0x0388, B:168:0x038b, B:170:0x0392, B:176:0x03b4, B:178:0x03bb, B:180:0x03c2, B:182:0x03da, B:183:0x03dd, B:184:0x03e0, B:171:0x03a3, B:173:0x03aa, B:175:0x03b1, B:185:0x03e6, B:186:0x03f1, B:188:0x03f7, B:189:0x03fa, B:191:0x0401, B:193:0x0408, B:194:0x040b, B:195:0x043d, B:197:0x0444, B:199:0x045a, B:200:0x0468, B:202:0x046e, B:203:0x0471, B:205:0x0478, B:210:0x0486, B:212:0x048d, B:214:0x049b, B:216:0x04ad, B:218:0x04b4, B:220:0x04bc, B:222:0x04c0, B:223:0x04c5, B:224:0x04cb, B:226:0x04d4, B:229:0x04ea, B:232:0x04f3, B:233:0x0501, B:234:0x051e, B:236:0x0524, B:238:0x052c, B:240:0x053e, B:241:0x054b, B:243:0x0552, B:244:0x055d, B:227:0x04df, B:245:0x0563, B:247:0x0569, B:248:0x056c, B:250:0x059f, B:254:0x05b9, B:256:0x05bf, B:257:0x05c2, B:252:0x05a8, B:261:0x05ce, B:263:0x05d5, B:265:0x05de, B:267:0x05e5, B:269:0x05eb, B:270:0x05ee, B:272:0x0608, B:273:0x060b, B:274:0x0611, B:276:0x0618, B:278:0x061f, B:280:0x0626, B:282:0x063f, B:284:0x0645, B:285:0x0648, B:286:0x064c, B:288:0x0652, B:289:0x0655, B:290:0x0658, B:292:0x065f, B:294:0x0666, B:296:0x066f, B:297:0x0671, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x0061, B:28:0x006c, B:32:0x0076, B:33:0x0080, B:34:0x0084, B:36:0x008b, B:38:0x0092, B:39:0x0096, B:41:0x009d, B:42:0x00a1, B:44:0x00a8, B:46:0x00c6, B:48:0x00ca, B:50:0x00d3, B:53:0x00d9, B:58:0x00e2, B:67:0x0107, B:69:0x010e, B:71:0x0115, B:72:0x0119, B:74:0x0120, B:75:0x0124, B:77:0x012a, B:60:0x00e9, B:61:0x00ee, B:63:0x00f5, B:65:0x00fe, B:66:0x0103, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:303:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0524 A[Catch: all -> 0x068b, TryCatch #0 {all -> 0x068b, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:78:0x012d, B:85:0x0140, B:87:0x0146, B:88:0x0149, B:90:0x0152, B:92:0x0159, B:94:0x015f, B:96:0x0166, B:97:0x016b, B:99:0x0174, B:100:0x0186, B:101:0x01b8, B:102:0x01be, B:104:0x01c4, B:105:0x01c7, B:106:0x01d8, B:108:0x01df, B:110:0x01e6, B:112:0x020b, B:113:0x020e, B:114:0x0211, B:115:0x0217, B:117:0x021d, B:118:0x0220, B:120:0x0227, B:121:0x022b, B:122:0x023c, B:123:0x0244, B:125:0x024a, B:126:0x024d, B:128:0x0254, B:129:0x0258, B:131:0x025f, B:132:0x0279, B:133:0x0285, B:135:0x028b, B:136:0x028e, B:139:0x029b, B:141:0x02a7, B:151:0x0311, B:152:0x0314, B:142:0x02ba, B:143:0x02db, B:144:0x02dc, B:146:0x02e3, B:148:0x02ed, B:149:0x030e, B:153:0x0341, B:154:0x0343, B:156:0x0348, B:158:0x034e, B:159:0x0351, B:160:0x0362, B:161:0x0368, B:163:0x036e, B:164:0x0371, B:165:0x0382, B:167:0x0388, B:168:0x038b, B:170:0x0392, B:176:0x03b4, B:178:0x03bb, B:180:0x03c2, B:182:0x03da, B:183:0x03dd, B:184:0x03e0, B:171:0x03a3, B:173:0x03aa, B:175:0x03b1, B:185:0x03e6, B:186:0x03f1, B:188:0x03f7, B:189:0x03fa, B:191:0x0401, B:193:0x0408, B:194:0x040b, B:195:0x043d, B:197:0x0444, B:199:0x045a, B:200:0x0468, B:202:0x046e, B:203:0x0471, B:205:0x0478, B:210:0x0486, B:212:0x048d, B:214:0x049b, B:216:0x04ad, B:218:0x04b4, B:220:0x04bc, B:222:0x04c0, B:223:0x04c5, B:224:0x04cb, B:226:0x04d4, B:229:0x04ea, B:232:0x04f3, B:233:0x0501, B:234:0x051e, B:236:0x0524, B:238:0x052c, B:240:0x053e, B:241:0x054b, B:243:0x0552, B:244:0x055d, B:227:0x04df, B:245:0x0563, B:247:0x0569, B:248:0x056c, B:250:0x059f, B:254:0x05b9, B:256:0x05bf, B:257:0x05c2, B:252:0x05a8, B:261:0x05ce, B:263:0x05d5, B:265:0x05de, B:267:0x05e5, B:269:0x05eb, B:270:0x05ee, B:272:0x0608, B:273:0x060b, B:274:0x0611, B:276:0x0618, B:278:0x061f, B:280:0x0626, B:282:0x063f, B:284:0x0645, B:285:0x0648, B:286:0x064c, B:288:0x0652, B:289:0x0655, B:290:0x0658, B:292:0x065f, B:294:0x0666, B:296:0x066f, B:297:0x0671, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x0061, B:28:0x006c, B:32:0x0076, B:33:0x0080, B:34:0x0084, B:36:0x008b, B:38:0x0092, B:39:0x0096, B:41:0x009d, B:42:0x00a1, B:44:0x00a8, B:46:0x00c6, B:48:0x00ca, B:50:0x00d3, B:53:0x00d9, B:58:0x00e2, B:67:0x0107, B:69:0x010e, B:71:0x0115, B:72:0x0119, B:74:0x0120, B:75:0x0124, B:77:0x012a, B:60:0x00e9, B:61:0x00ee, B:63:0x00f5, B:65:0x00fe, B:66:0x0103, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:303:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x0552 A[Catch: all -> 0x068b, TryCatch #0 {all -> 0x068b, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:78:0x012d, B:85:0x0140, B:87:0x0146, B:88:0x0149, B:90:0x0152, B:92:0x0159, B:94:0x015f, B:96:0x0166, B:97:0x016b, B:99:0x0174, B:100:0x0186, B:101:0x01b8, B:102:0x01be, B:104:0x01c4, B:105:0x01c7, B:106:0x01d8, B:108:0x01df, B:110:0x01e6, B:112:0x020b, B:113:0x020e, B:114:0x0211, B:115:0x0217, B:117:0x021d, B:118:0x0220, B:120:0x0227, B:121:0x022b, B:122:0x023c, B:123:0x0244, B:125:0x024a, B:126:0x024d, B:128:0x0254, B:129:0x0258, B:131:0x025f, B:132:0x0279, B:133:0x0285, B:135:0x028b, B:136:0x028e, B:139:0x029b, B:141:0x02a7, B:151:0x0311, B:152:0x0314, B:142:0x02ba, B:143:0x02db, B:144:0x02dc, B:146:0x02e3, B:148:0x02ed, B:149:0x030e, B:153:0x0341, B:154:0x0343, B:156:0x0348, B:158:0x034e, B:159:0x0351, B:160:0x0362, B:161:0x0368, B:163:0x036e, B:164:0x0371, B:165:0x0382, B:167:0x0388, B:168:0x038b, B:170:0x0392, B:176:0x03b4, B:178:0x03bb, B:180:0x03c2, B:182:0x03da, B:183:0x03dd, B:184:0x03e0, B:171:0x03a3, B:173:0x03aa, B:175:0x03b1, B:185:0x03e6, B:186:0x03f1, B:188:0x03f7, B:189:0x03fa, B:191:0x0401, B:193:0x0408, B:194:0x040b, B:195:0x043d, B:197:0x0444, B:199:0x045a, B:200:0x0468, B:202:0x046e, B:203:0x0471, B:205:0x0478, B:210:0x0486, B:212:0x048d, B:214:0x049b, B:216:0x04ad, B:218:0x04b4, B:220:0x04bc, B:222:0x04c0, B:223:0x04c5, B:224:0x04cb, B:226:0x04d4, B:229:0x04ea, B:232:0x04f3, B:233:0x0501, B:234:0x051e, B:236:0x0524, B:238:0x052c, B:240:0x053e, B:241:0x054b, B:243:0x0552, B:244:0x055d, B:227:0x04df, B:245:0x0563, B:247:0x0569, B:248:0x056c, B:250:0x059f, B:254:0x05b9, B:256:0x05bf, B:257:0x05c2, B:252:0x05a8, B:261:0x05ce, B:263:0x05d5, B:265:0x05de, B:267:0x05e5, B:269:0x05eb, B:270:0x05ee, B:272:0x0608, B:273:0x060b, B:274:0x0611, B:276:0x0618, B:278:0x061f, B:280:0x0626, B:282:0x063f, B:284:0x0645, B:285:0x0648, B:286:0x064c, B:288:0x0652, B:289:0x0655, B:290:0x0658, B:292:0x065f, B:294:0x0666, B:296:0x066f, B:297:0x0671, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x0061, B:28:0x006c, B:32:0x0076, B:33:0x0080, B:34:0x0084, B:36:0x008b, B:38:0x0092, B:39:0x0096, B:41:0x009d, B:42:0x00a1, B:44:0x00a8, B:46:0x00c6, B:48:0x00ca, B:50:0x00d3, B:53:0x00d9, B:58:0x00e2, B:67:0x0107, B:69:0x010e, B:71:0x0115, B:72:0x0119, B:74:0x0120, B:75:0x0124, B:77:0x012a, B:60:0x00e9, B:61:0x00ee, B:63:0x00f5, B:65:0x00fe, B:66:0x0103, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:303:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x052c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x053e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x051e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0174 A[Catch: all -> 0x068b, TryCatch #0 {all -> 0x068b, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0024, B:78:0x012d, B:85:0x0140, B:87:0x0146, B:88:0x0149, B:90:0x0152, B:92:0x0159, B:94:0x015f, B:96:0x0166, B:97:0x016b, B:99:0x0174, B:100:0x0186, B:101:0x01b8, B:102:0x01be, B:104:0x01c4, B:105:0x01c7, B:106:0x01d8, B:108:0x01df, B:110:0x01e6, B:112:0x020b, B:113:0x020e, B:114:0x0211, B:115:0x0217, B:117:0x021d, B:118:0x0220, B:120:0x0227, B:121:0x022b, B:122:0x023c, B:123:0x0244, B:125:0x024a, B:126:0x024d, B:128:0x0254, B:129:0x0258, B:131:0x025f, B:132:0x0279, B:133:0x0285, B:135:0x028b, B:136:0x028e, B:139:0x029b, B:141:0x02a7, B:151:0x0311, B:152:0x0314, B:142:0x02ba, B:143:0x02db, B:144:0x02dc, B:146:0x02e3, B:148:0x02ed, B:149:0x030e, B:153:0x0341, B:154:0x0343, B:156:0x0348, B:158:0x034e, B:159:0x0351, B:160:0x0362, B:161:0x0368, B:163:0x036e, B:164:0x0371, B:165:0x0382, B:167:0x0388, B:168:0x038b, B:170:0x0392, B:176:0x03b4, B:178:0x03bb, B:180:0x03c2, B:182:0x03da, B:183:0x03dd, B:184:0x03e0, B:171:0x03a3, B:173:0x03aa, B:175:0x03b1, B:185:0x03e6, B:186:0x03f1, B:188:0x03f7, B:189:0x03fa, B:191:0x0401, B:193:0x0408, B:194:0x040b, B:195:0x043d, B:197:0x0444, B:199:0x045a, B:200:0x0468, B:202:0x046e, B:203:0x0471, B:205:0x0478, B:210:0x0486, B:212:0x048d, B:214:0x049b, B:216:0x04ad, B:218:0x04b4, B:220:0x04bc, B:222:0x04c0, B:223:0x04c5, B:224:0x04cb, B:226:0x04d4, B:229:0x04ea, B:232:0x04f3, B:233:0x0501, B:234:0x051e, B:236:0x0524, B:238:0x052c, B:240:0x053e, B:241:0x054b, B:243:0x0552, B:244:0x055d, B:227:0x04df, B:245:0x0563, B:247:0x0569, B:248:0x056c, B:250:0x059f, B:254:0x05b9, B:256:0x05bf, B:257:0x05c2, B:252:0x05a8, B:261:0x05ce, B:263:0x05d5, B:265:0x05de, B:267:0x05e5, B:269:0x05eb, B:270:0x05ee, B:272:0x0608, B:273:0x060b, B:274:0x0611, B:276:0x0618, B:278:0x061f, B:280:0x0626, B:282:0x063f, B:284:0x0645, B:285:0x0648, B:286:0x064c, B:288:0x0652, B:289:0x0655, B:290:0x0658, B:292:0x065f, B:294:0x0666, B:296:0x066f, B:297:0x0671, B:13:0x002b, B:18:0x003e, B:22:0x0051, B:24:0x0058, B:26:0x0061, B:28:0x006c, B:32:0x0076, B:33:0x0080, B:34:0x0084, B:36:0x008b, B:38:0x0092, B:39:0x0096, B:41:0x009d, B:42:0x00a1, B:44:0x00a8, B:46:0x00c6, B:48:0x00ca, B:50:0x00d3, B:53:0x00d9, B:58:0x00e2, B:67:0x0107, B:69:0x010e, B:71:0x0115, B:72:0x0119, B:74:0x0120, B:75:0x0124, B:77:0x012a, B:60:0x00e9, B:61:0x00ee, B:63:0x00f5, B:65:0x00fe, B:66:0x0103, B:19:0x0043, B:20:0x0048, B:21:0x004d), top: B:303:0x0013 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        int iMin;
        int i;
        ViewGroup viewGroup;
        ck ckVar;
        boolean z;
        Object obj;
        String str;
        Object obj2;
        cc ccVarB;
        View view;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.c) {
            if (dd.aa(2)) {
                Objects.toString(this.d);
                return;
            }
            return;
        }
        try {
            this.c = true;
            Object[] objArr = false;
            while (true) {
                Object obj3 = this.d;
                if (((cc) obj3).mFragmentManager == null) {
                    iMin = ((cc) obj3).mState;
                } else {
                    iMin = this.b;
                    int iOrdinal = ((cc) obj3).mMaxState.ordinal();
                    if (iOrdinal == 1) {
                        iMin = Math.min(iMin, 0);
                    } else if (iOrdinal == 2) {
                        iMin = Math.min(iMin, 1);
                    } else if (iOrdinal == 3) {
                        iMin = Math.min(iMin, 5);
                    } else if (iOrdinal != 4) {
                        iMin = Math.min(iMin, -1);
                    }
                    if (((cc) obj3).mFromLayout) {
                        boolean z2 = ((cc) obj3).mInLayout;
                        int i2 = this.b;
                        if (z2) {
                            iMin = Math.max(i2, 2);
                            View view2 = ((cc) obj3).mView;
                            if (view2 != null && view2.getParent() == null) {
                                iMin = 2;
                            }
                        } else {
                            iMin = i2 < 4 ? Math.min(iMin, ((cc) obj3).mState) : Math.min(iMin, 1);
                        }
                    }
                    if (((cc) obj3).mInDynamicContainer && ((cc) obj3).mContainer == null) {
                        iMin = Math.min(iMin, 4);
                    }
                    if (!((cc) obj3).mAdded) {
                        iMin = Math.min(iMin, 1);
                    }
                    ViewGroup viewGroup4 = ((cc) obj3).mContainer;
                    if (viewGroup4 != null) {
                        dl dlVarAn = ((cc) obj3).getParentFragmentManager().an();
                        dlVarAn.getClass();
                        eb ebVarC = dl.c(viewGroup4, dlVarAn);
                        obj3.getClass();
                        ea eaVarA = ebVarC.a((cc) obj3);
                        i = eaVarA != null ? eaVarA.i : 0;
                        ea eaVarB = ebVarC.b((cc) obj3);
                        int i3 = eaVarB != null ? eaVarB.i : 0;
                        if (i == 0 || i - 1 == 0) {
                            i = i3;
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 2) {
                        iMin = Math.min(iMin, 6);
                    } else if (i == 3) {
                        iMin = Math.max(iMin, 3);
                    } else if (((cc) obj3).mRemoving) {
                        iMin = ((cc) obj3).isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
                    }
                    if (((cc) obj3).mDeferStart && ((cc) obj3).mState < 5) {
                        iMin = Math.min(iMin, 4);
                    }
                    if (((cc) obj3).mTransitioning) {
                        iMin = Math.max(iMin, 3);
                    }
                    if (dd.aa(2)) {
                        Objects.toString(obj3);
                    }
                }
                int i4 = ((cc) obj3).mState;
                if (iMin == i4) {
                    if (objArr == false && i4 == -1 && ((cc) obj3).mRemoving && !((cc) obj3).isInBackStack() && !((cc) obj3).mBeingSaved) {
                        if (dd.aa(3)) {
                            Objects.toString(obj3);
                        }
                        Object obj4 = this.e;
                        ((dg) ((ejt) obj4).d).b((cc) obj3, true);
                        ((ejt) obj4).m(this);
                        if (dd.aa(3)) {
                            Objects.toString(obj3);
                        }
                        ((cc) obj3).initState();
                    }
                    if (((cc) obj3).mHiddenChanged) {
                        if (((cc) obj3).mView != null && (viewGroup = ((cc) obj3).mContainer) != null) {
                            dl dlVarAn2 = ((cc) obj3).getParentFragmentManager().an();
                            dlVarAn2.getClass();
                            eb ebVarC2 = dl.c(viewGroup, dlVarAn2);
                            if (((cc) obj3).mHidden) {
                                if (dd.aa(2)) {
                                    Objects.toString(obj3);
                                }
                                ebVarC2.i(3, 1, this);
                            } else {
                                if (dd.aa(2)) {
                                    Objects.toString(obj3);
                                }
                                ebVarC2.i(2, 1, this);
                            }
                        }
                        dd ddVar = ((cc) obj3).mFragmentManager;
                        if (ddVar != null && ((cc) obj3).mAdded && dd.aj((cc) obj3)) {
                            ddVar.x = true;
                        }
                        ((cc) obj3).mHiddenChanged = false;
                        ((cc) obj3).onHiddenChanged(((cc) obj3).mHidden);
                        ((cc) obj3).mChildFragmentManager.y();
                    }
                    this.c = false;
                    return;
                }
                afjq afjqVarK = null;
                if (iMin <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            ((cc) obj3).performDetach();
                            ((pj) this.a).n((cc) obj3, false);
                            ((cc) obj3).mState = -1;
                            ((cc) obj3).mHost = null;
                            ((cc) obj3).mContextAwareHelper.b();
                            ((cc) obj3).mParentFragment = null;
                            ((cc) obj3).mFragmentManager = null;
                            if ((((cc) obj3).mRemoving && !((cc) obj3).isInBackStack()) || ((dg) ((ejt) this.e).d).f((cc) obj3)) {
                                if (dd.aa(3)) {
                                    Objects.toString(obj3);
                                }
                                ((cc) obj3).initState();
                            }
                            break;
                        case 0:
                            if (((cc) obj3).mBeingSaved) {
                                Object obj5 = this.e;
                                if (((Bundle) ((HashMap) ((ejt) obj5).c).get(((cc) obj3).mWho)) == null) {
                                    ((ejt) obj5).a(((cc) obj3).mWho, e());
                                }
                            }
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            Object[] objArr2 = ((cc) obj3).mRemoving && !((cc) obj3).isInBackStack();
                            if (objArr2 != false && !((cc) obj3).mBeingSaved) {
                                ((ejt) this.e).a(((cc) obj3).mWho, null);
                            }
                            if (objArr2 == true) {
                                ckVar = ((cc) obj3).mHost;
                                if (ckVar instanceof bpp) {
                                    z = ((dg) ((ejt) this.e).d).f;
                                } else {
                                    z = !((Activity) ckVar.c).isChangingConfigurations();
                                }
                                if (objArr2 == true) {
                                    ((dg) ((ejt) this.e).d).b((cc) obj3, false);
                                } else {
                                    ((dg) ((ejt) this.e).d).b((cc) obj3, false);
                                }
                                ((cc) obj3).performDestroy();
                                ((pj) this.a).m((cc) obj3, false);
                                obj = this.e;
                                while (r6.hasNext()) {
                                    if (afjqVar != null) {
                                        obj2 = afjqVar.d;
                                        if (((cc) obj3).mWho.equals(((cc) obj2).mTargetWho)) {
                                            ((cc) obj2).mTarget = (cc) obj3;
                                            ((cc) obj2).mTargetWho = null;
                                        }
                                    }
                                }
                                str = ((cc) obj3).mTargetWho;
                                if (str != null) {
                                    ((cc) obj3).mTarget = ((ejt) obj).b(str);
                                }
                                ((ejt) obj).m(this);
                            } else {
                                Object obj6 = this.e;
                                if (((dg) ((ejt) obj6).d).f((cc) obj3)) {
                                    ckVar = ((cc) obj3).mHost;
                                    if (ckVar instanceof bpp) {
                                        z = ((dg) ((ejt) this.e).d).f;
                                    } else {
                                        z = !((Activity) ckVar.c).isChangingConfigurations();
                                    }
                                    if ((objArr2 == true && !((cc) obj3).mBeingSaved) || z) {
                                        ((dg) ((ejt) this.e).d).b((cc) obj3, false);
                                    }
                                    ((cc) obj3).performDestroy();
                                    ((pj) this.a).m((cc) obj3, false);
                                    obj = this.e;
                                    for (afjq afjqVar : ((ejt) obj).d()) {
                                        if (afjqVar != null) {
                                            obj2 = afjqVar.d;
                                            if (((cc) obj3).mWho.equals(((cc) obj2).mTargetWho)) {
                                                ((cc) obj2).mTarget = (cc) obj3;
                                                ((cc) obj2).mTargetWho = null;
                                            }
                                        }
                                    }
                                    str = ((cc) obj3).mTargetWho;
                                    if (str != null) {
                                        ((cc) obj3).mTarget = ((ejt) obj).b(str);
                                    }
                                    ((ejt) obj).m(this);
                                } else {
                                    String str2 = ((cc) obj3).mTargetWho;
                                    if (str2 != null && (ccVarB = ((ejt) obj6).b(str2)) != null && ccVarB.mRetainInstance) {
                                        ((cc) obj3).mTarget = ccVarB;
                                    }
                                    ((cc) obj3).mState = 0;
                                }
                            }
                            break;
                        case 1:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            ViewGroup viewGroup5 = ((cc) obj3).mContainer;
                            if (viewGroup5 != null && (view = ((cc) obj3).mView) != null) {
                                viewGroup5.removeView(view);
                            }
                            ((cc) obj3).performDestroyView();
                            ((pj) this.a).w((cc) obj3, false);
                            ((cc) obj3).mContainer = null;
                            ((cc) obj3).mView = null;
                            ((cc) obj3).mViewLifecycleOwner = null;
                            ((cc) obj3).mViewLifecycleOwnerLiveData.h(null);
                            ((cc) obj3).mInLayout = false;
                            ((cc) obj3).mState = 1;
                            break;
                        case 2:
                            ((cc) obj3).mInLayout = false;
                            ((cc) obj3).mState = 2;
                            break;
                        case 3:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            if (((cc) obj3).mBeingSaved) {
                                ((ejt) this.e).a(((cc) obj3).mWho, e());
                            } else if (((cc) obj3).mView != null && ((cc) obj3).mSavedViewState == null) {
                                k();
                            }
                            if (((cc) obj3).mView != null && (viewGroup2 = ((cc) obj3).mContainer) != null) {
                                dl dlVarAn3 = ((cc) obj3).getParentFragmentManager().an();
                                dlVarAn3.getClass();
                                eb ebVarC3 = dl.c(viewGroup2, dlVarAn3);
                                if (dd.aa(2)) {
                                    Objects.toString(obj3);
                                }
                                ebVarC3.i(1, 3, this);
                            }
                            ((cc) obj3).mState = 3;
                            break;
                        case 4:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            ((cc) obj3).performStop();
                            ((pj) this.a).u((cc) obj3, false);
                            break;
                        case 5:
                            ((cc) obj3).mState = 5;
                            break;
                        case 6:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            ((cc) obj3).performPause();
                            ((pj) this.a).o((cc) obj3, false);
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            cc ccVar = ((cc) obj3).mTarget;
                            if (ccVar != null) {
                                afjq afjqVarK2 = ((ejt) this.e).k(ccVar.mWho);
                                if (afjqVarK2 == null) {
                                    throw new IllegalStateException("Fragment " + obj3 + " declared target fragment " + ((cc) obj3).mTarget + " that does not belong to this FragmentManager!");
                                }
                                ((cc) obj3).mTargetWho = ((cc) obj3).mTarget.mWho;
                                ((cc) obj3).mTarget = null;
                                afjqVarK = afjqVarK2;
                            } else {
                                String str3 = ((cc) obj3).mTargetWho;
                                if (str3 != null && (afjqVarK = ((ejt) this.e).k(str3)) == null) {
                                    throw new IllegalStateException("Fragment " + obj3 + " declared target fragment " + ((cc) obj3).mTargetWho + " that does not belong to this FragmentManager!");
                                }
                            }
                            if (afjqVarK != null) {
                                afjqVarK.i();
                            }
                            dd ddVar2 = ((cc) obj3).mFragmentManager;
                            ((cc) obj3).mHost = ddVar2.p;
                            ((cc) obj3).mParentFragment = ddVar2.r;
                            Object obj7 = this.a;
                            ((pj) obj7).p((cc) obj3, false);
                            ((cc) obj3).performAttach();
                            ((pj) obj7).k((cc) obj3, false);
                            break;
                        case 1:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            Bundle bundle = ((cc) obj3).mSavedFragmentState;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (((cc) obj3).mIsCreated) {
                                ((cc) obj3).mState = 1;
                                ((cc) obj3).restoreChildFragmentState();
                            } else {
                                Object obj8 = this.a;
                                ((pj) obj8).q((cc) obj3, bundle2, false);
                                ((cc) obj3).performCreate(bundle2);
                                ((pj) obj8).l((cc) obj3, bundle2, false);
                            }
                            break;
                        case 2:
                            h();
                            g();
                            break;
                        case 3:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            Bundle bundle3 = ((cc) obj3).mSavedFragmentState;
                            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            ((cc) obj3).performActivityCreated(bundle4);
                            ((pj) this.a).j((cc) obj3, bundle4, false);
                            break;
                        case 4:
                            if (((cc) obj3).mView != null && (viewGroup3 = ((cc) obj3).mContainer) != null) {
                                dl dlVarAn4 = ((cc) obj3).getParentFragmentManager().an();
                                dlVarAn4.getClass();
                                eb ebVarC4 = dl.c(viewGroup3, dlVarAn4);
                                int iH = dl.h(((cc) obj3).mView.getVisibility());
                                if (dd.aa(2)) {
                                    Objects.toString(obj3);
                                }
                                ebVarC4.i(iH, 2, this);
                            }
                            ((cc) obj3).mState = 4;
                            break;
                        case 5:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            ((cc) obj3).performStart();
                            ((pj) this.a).t((cc) obj3, false);
                            break;
                        case 6:
                            ((cc) obj3).mState = 6;
                            break;
                        case 7:
                            if (dd.aa(3)) {
                                Objects.toString(obj3);
                            }
                            View focusedView = ((cc) obj3).getFocusedView();
                            if (focusedView != null) {
                                if (focusedView != ((cc) obj3).mView) {
                                    ViewParent parent = focusedView.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            if (parent != ((cc) obj3).mView) {
                                                parent = parent.getParent();
                                            } else {
                                                focusedView.requestFocus();
                                                if (dd.aa(2)) {
                                                    Objects.toString(focusedView);
                                                    Objects.toString(obj3);
                                                    Objects.toString(((cc) obj3).mView.findFocus());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    focusedView.requestFocus();
                                    if (dd.aa(2)) {
                                        Objects.toString(focusedView);
                                        Objects.toString(obj3);
                                        Objects.toString(((cc) obj3).mView.findFocus());
                                    }
                                }
                            }
                            ((cc) obj3).setFocusedView(null);
                            ((cc) obj3).performResume();
                            ((pj) this.a).r((cc) obj3, false);
                            ((ejt) this.e).a(((cc) obj3).mWho, null);
                            ((cc) obj3).mSavedFragmentState = null;
                            ((cc) obj3).mSavedViewState = null;
                            ((cc) obj3).mSavedViewRegistryState = null;
                            break;
                    }
                }
                objArr = true;
            }
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    public final void j(ClassLoader classLoader) {
        Object obj = this.d;
        cc ccVar = (cc) obj;
        Bundle bundle = ccVar.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (ccVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                ccVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                ((cc) obj).mSavedViewState = ((cc) obj).mSavedFragmentState.getSparseParcelableArray("viewState");
                cc ccVar2 = (cc) this.d;
                ccVar2.mSavedViewRegistryState = ccVar2.mSavedFragmentState.getBundle("viewRegistryState");
                dj djVar = (dj) ccVar2.mSavedFragmentState.getParcelable("state");
                if (djVar != null) {
                    ccVar2.mTargetWho = djVar.m;
                    ccVar2.mTargetRequestCode = djVar.n;
                    Boolean bool = ccVar2.mSavedUserVisibleHint;
                    if (bool != null) {
                        ccVar2.mUserVisibleHint = bool.booleanValue();
                        ccVar2.mSavedUserVisibleHint = null;
                    } else {
                        ccVar2.mUserVisibleHint = djVar.o;
                    }
                }
                if (ccVar2.mUserVisibleHint) {
                    return;
                }
                ccVar2.mDeferStart = true;
            } catch (BadParcelableException e) {
                Object obj2 = this.d;
                Objects.toString(obj2);
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(obj2)), e);
            }
        }
    }

    final void k() {
        Object obj = this.d;
        cc ccVar = (cc) obj;
        if (ccVar.mView != null) {
            if (dd.aa(2)) {
                Objects.toString(obj);
                Objects.toString(ccVar.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ccVar.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                ccVar.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            ccVar.mViewLifecycleOwner.b.d(bundle);
            if (bundle.isEmpty()) {
                return;
            }
            ccVar.mSavedViewRegistryState = bundle;
        }
    }

    public afjq(pj pjVar, ejt ejtVar, cc ccVar, Bundle bundle) {
        this.c = false;
        this.b = -1;
        this.a = pjVar;
        this.e = ejtVar;
        this.d = ccVar;
        ccVar.mSavedViewState = null;
        ccVar.mSavedViewRegistryState = null;
        ccVar.mBackStackNesting = 0;
        ccVar.mInLayout = false;
        ccVar.mAdded = false;
        cc ccVar2 = ccVar.mTarget;
        ccVar.mTargetWho = ccVar2 != null ? ccVar2.mWho : null;
        ccVar.mTarget = null;
        ccVar.mSavedFragmentState = bundle;
        ccVar.mArguments = bundle.getBundle("arguments");
    }

    public afjq(pj pjVar, ejt ejtVar, cc ccVar) {
        this.c = false;
        this.b = -1;
        this.a = pjVar;
        this.e = ejtVar;
        this.d = ccVar;
    }

    private afjq(Context context) {
        Executor executorF = azs.F();
        this.e = executorF;
        this.a = new CopyOnWriteArrayList();
        this.d = new Object();
        this.b = 0;
        executorF.execute(new br(this, context, 8));
    }

    public afjq() {
        this.a = new Object();
        this.d = new HashSet();
        this.e = new afjp(this, 0);
    }
}
