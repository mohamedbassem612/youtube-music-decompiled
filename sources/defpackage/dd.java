package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dd {
    public static boolean a = true;
    public boolean A;
    public dg B;
    private boolean E;
    private ArrayList F;
    private boolean M;
    private ArrayList N;
    private ArrayList O;
    private ArrayList P;
    public qv e;
    public ck p;
    public ch q;
    public cc r;
    cc s;
    public rc t;
    public rc u;
    public rc v;
    public boolean x;
    public boolean y;
    public boolean z;
    public final ArrayList b = new ArrayList();
    public final ejt C = new ejt();
    ArrayList c = new ArrayList();
    public final cm d = new cm(this);
    av f = null;
    boolean g = false;
    public final qr h = new co(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = DesugarCollections.synchronizedMap(new HashMap());
    public final Map k = DesugarCollections.synchronizedMap(new HashMap());
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    final ArrayList m = new ArrayList();
    public final pj D = new pj(this);
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    private final axo G = new cd(this, 2);
    private final axo H = new cd(this, 3);
    private final axo I = new cd(this, 4);
    private final axo J = new cd(this, 5);
    private final ayr K = new cp(this);
    int o = -1;
    private final cj L = new cq(this);
    private final dl R = new dl();
    ArrayDeque w = new ArrayDeque();
    private final Runnable Q = new bq(this, 12, null);

    private final void aA(cc ccVar) {
        ViewGroup viewGroupAr = ar(ccVar);
        if (viewGroupAr == null || ccVar.getEnterAnim() + ccVar.getExitAnim() + ccVar.getPopEnterAnim() + ccVar.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupAr.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAr.setTag(R.id.visible_removing_fragment_view_tag, ccVar);
        }
        ((cc) viewGroupAr.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(ccVar.getPopDirection());
    }

    private final void aB() {
        Iterator it = this.C.d().iterator();
        while (it.hasNext()) {
            aq((afjq) it.next());
        }
    }

    public static boolean aa(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set ai(av avVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = avVar.e;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            cc ccVar = ((dm) arrayList.get(i)).b;
            if (ccVar != null && avVar.k) {
                hashSet.add(ccVar);
            }
            i++;
        }
    }

    public static final boolean aj(cc ccVar) {
        if (!ccVar.mHasMenu || !ccVar.mMenuVisible) {
            boolean zAj = false;
            for (cc ccVar2 : ccVar.mChildFragmentManager.C.e()) {
                if (ccVar2 != null) {
                    zAj = aj(ccVar2);
                }
                if (zAj) {
                }
            }
            return false;
        }
        return true;
    }

    static final void al(cc ccVar) {
        if (aa(2)) {
            Objects.toString(ccVar);
        }
        if (ccVar.mHidden) {
            ccVar.mHidden = false;
            ccVar.mHiddenChanged = !ccVar.mHiddenChanged;
        }
    }

    private final ViewGroup ar(cc ccVar) {
        ViewGroup viewGroup = ccVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (ccVar.mContainerId > 0 && this.q.b()) {
            View viewA = this.q.a(ccVar.mContainerId);
            if (viewA instanceof ViewGroup) {
                return (ViewGroup) viewA;
            }
        }
        return null;
    }

    private final Set as() {
        HashSet hashSet = new HashSet();
        Iterator it = this.C.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((cc) ((afjq) it.next()).d).mContainer;
            if (viewGroup != null) {
                hashSet.add(dl.c(viewGroup, an()));
            }
        }
        return hashSet;
    }

    private final void at() {
        if (ad()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void au() {
        this.E = false;
        this.O.clear();
        this.N.clear();
    }

    private final void av() {
        if (this.M) {
            this.M = false;
            aB();
        }
    }

    private final void aw(boolean z) {
        if (this.E) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.p == null) {
            if (!this.A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.p.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            at();
        }
        if (this.N == null) {
            this.N = new ArrayList();
            this.O = new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x021b A[PHI: r14
      0x021b: PHI (r14v16 int) = (r14v15 int), (r14v17 int) binds: [B:98:0x0209, B:103:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    private final void ax(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        byte[] bArr;
        int i8 = i;
        boolean z3 = ((av) arrayList.get(i8)).t;
        ArrayList arrayList3 = this.P;
        if (arrayList3 == null) {
            this.P = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.P;
        ejt ejtVar = this.C;
        arrayList4.addAll(ejtVar.f());
        cc ccVar = this.s;
        int i9 = i8;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i2) {
                boolean z5 = z3;
                boolean z6 = z4;
                int i11 = -1;
                this.P.clear();
                if (!z5 && this.o > 0) {
                    for (int i12 = i8; i12 < i2; i12++) {
                        ArrayList arrayList5 = ((av) arrayList.get(i12)).e;
                        int size = arrayList5.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            cc ccVar2 = ((dm) arrayList5.get(i13)).b;
                            if (ccVar2 != null && ccVar2.mFragmentManager != null) {
                                ejtVar.l(ap(ccVar2));
                            }
                        }
                    }
                }
                int i14 = i8;
                while (i14 < i2) {
                    av avVar = (av) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        int i15 = i11;
                        avVar.c(i15);
                        ArrayList arrayList6 = avVar.e;
                        for (int size2 = arrayList6.size() + i15; size2 >= 0; size2--) {
                            dm dmVar = (dm) arrayList6.get(size2);
                            cc ccVar3 = dmVar.b;
                            if (ccVar3 != null) {
                                ccVar3.mBeingSaved = avVar.d;
                                ccVar3.setPopDirection(true);
                                int i16 = avVar.j;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 4100;
                                        i18 = 8197;
                                        if (i16 != 8197) {
                                            if (i16 == 4099) {
                                                i17 = 4099;
                                            } else if (i16 != 4100) {
                                                i17 = 0;
                                            } else {
                                                i17 = i18;
                                            }
                                        }
                                    } else {
                                        i17 = i18;
                                    }
                                }
                                ccVar3.setNextTransition(i17);
                                ccVar3.setSharedElementNames(avVar.s, avVar.r);
                            }
                            switch (dmVar.a) {
                                case 1:
                                    ccVar3.setAnimations(dmVar.d, dmVar.e, dmVar.f, dmVar.g);
                                    dd ddVar = avVar.a;
                                    ddVar.R(ccVar3, true);
                                    ddVar.O(ccVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + dmVar.a);
                                case 3:
                                    ccVar3.setAnimations(dmVar.d, dmVar.e, dmVar.f, dmVar.g);
                                    avVar.a.ao(ccVar3);
                                    break;
                                case 4:
                                    ccVar3.setAnimations(dmVar.d, dmVar.e, dmVar.f, dmVar.g);
                                    dd ddVar2 = avVar.a;
                                    al(ccVar3);
                                    break;
                                case 5:
                                    ccVar3.setAnimations(dmVar.d, dmVar.e, dmVar.f, dmVar.g);
                                    dd ddVar3 = avVar.a;
                                    ddVar3.R(ccVar3, true);
                                    ddVar3.L(ccVar3);
                                    break;
                                case 6:
                                    ccVar3.setAnimations(dmVar.d, dmVar.e, dmVar.f, dmVar.g);
                                    avVar.a.p(ccVar3);
                                    break;
                                case 7:
                                    ccVar3.setAnimations(dmVar.d, dmVar.e, dmVar.f, dmVar.g);
                                    dd ddVar4 = avVar.a;
                                    ddVar4.R(ccVar3, true);
                                    ddVar4.r(ccVar3);
                                    break;
                                case 8:
                                    avVar.a.T(null);
                                    break;
                                case 9:
                                    avVar.a.T(ccVar3);
                                    break;
                                case 10:
                                    dmVar.i = ccVar3.mMaxState;
                                    avVar.a.S(ccVar3, dmVar.h);
                                    break;
                            }
                        }
                    } else {
                        avVar.c(1);
                        ArrayList arrayList7 = avVar.e;
                        int size3 = arrayList7.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            dm dmVar2 = (dm) arrayList7.get(i19);
                            cc ccVar4 = dmVar2.b;
                            if (ccVar4 != null) {
                                ccVar4.mBeingSaved = avVar.d;
                                ccVar4.setPopDirection(false);
                                ccVar4.setNextTransition(avVar.j);
                                ccVar4.setSharedElementNames(avVar.r, avVar.s);
                            }
                            switch (dmVar2.a) {
                                case 1:
                                    ccVar4.setAnimations(dmVar2.d, dmVar2.e, dmVar2.f, dmVar2.g);
                                    dd ddVar5 = avVar.a;
                                    ddVar5.R(ccVar4, false);
                                    ddVar5.ao(ccVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + dmVar2.a);
                                case 3:
                                    ccVar4.setAnimations(dmVar2.d, dmVar2.e, dmVar2.f, dmVar2.g);
                                    avVar.a.O(ccVar4);
                                    break;
                                case 4:
                                    ccVar4.setAnimations(dmVar2.d, dmVar2.e, dmVar2.f, dmVar2.g);
                                    avVar.a.L(ccVar4);
                                    break;
                                case 5:
                                    ccVar4.setAnimations(dmVar2.d, dmVar2.e, dmVar2.f, dmVar2.g);
                                    avVar.a.R(ccVar4, false);
                                    al(ccVar4);
                                    break;
                                case 6:
                                    ccVar4.setAnimations(dmVar2.d, dmVar2.e, dmVar2.f, dmVar2.g);
                                    avVar.a.r(ccVar4);
                                    break;
                                case 7:
                                    ccVar4.setAnimations(dmVar2.d, dmVar2.e, dmVar2.f, dmVar2.g);
                                    dd ddVar6 = avVar.a;
                                    ddVar6.R(ccVar4, false);
                                    ddVar6.p(ccVar4);
                                    break;
                                case 8:
                                    avVar.a.T(ccVar4);
                                    break;
                                case 9:
                                    avVar.a.T(null);
                                    break;
                                case 10:
                                    dmVar2.h = ccVar4.mMaxState;
                                    avVar.a.S(ccVar4, dmVar2.i);
                                    break;
                            }
                        }
                    }
                    i14++;
                    i11 = -1;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z6 && !this.m.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        linkedHashSet.addAll(ai((av) arrayList.get(i20)));
                    }
                    if (this.f == null) {
                        ArrayList arrayList8 = this.m;
                        int size5 = arrayList8.size();
                        int i21 = 0;
                        while (i21 < size5) {
                            cx cxVar = (cx) arrayList8.get(i21);
                            Iterator it = linkedHashSet.iterator();
                            while (true) {
                                i4 = i21 + 1;
                                if (it.hasNext()) {
                                    cxVar.b((cc) it.next(), zBooleanValue);
                                }
                            }
                            i21 = i4;
                        }
                        ArrayList arrayList9 = this.m;
                        int size6 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size6) {
                            cx cxVar2 = (cx) arrayList9.get(i22);
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                i3 = i22 + 1;
                                if (it2.hasNext()) {
                                    cxVar2.hz();
                                }
                            }
                            i22 = i3;
                        }
                    }
                }
                for (int i23 = i8; i23 < i2; i23++) {
                    av avVar2 = (av) arrayList.get(i23);
                    if (zBooleanValue) {
                        ArrayList arrayList10 = avVar2.e;
                        for (int size7 = arrayList10.size() - 1; size7 >= 0; size7--) {
                            cc ccVar5 = ((dm) arrayList10.get(size7)).b;
                            if (ccVar5 != null) {
                                ap(ccVar5).i();
                            }
                        }
                    } else {
                        ArrayList arrayList11 = avVar2.e;
                        int size8 = arrayList11.size();
                        for (int i24 = 0; i24 < size8; i24++) {
                            cc ccVar6 = ((dm) arrayList11.get(i24)).b;
                            if (ccVar6 != null) {
                                ap(ccVar6).i();
                            }
                        }
                    }
                }
                M(this.o, true);
                for (eb ebVar : l(arrayList, i8, i2)) {
                    ebVar.d = zBooleanValue;
                    ebVar.g();
                    ebVar.e();
                }
                while (i8 < i2) {
                    av avVar3 = (av) arrayList.get(i8);
                    if (((Boolean) arrayList2.get(i8)).booleanValue() && avVar3.c >= 0) {
                        avVar3.c = -1;
                    }
                    if (avVar3.u != null) {
                        for (int i25 = 0; i25 < avVar3.u.size(); i25++) {
                            ((Runnable) avVar3.u.get(i25)).run();
                        }
                        avVar3.u = null;
                    }
                    i8++;
                }
                if (z6) {
                    for (int i26 = 0; i26 < this.m.size(); i26++) {
                        ((cx) this.m.get(i26)).c();
                    }
                    return;
                }
                return;
            }
            av avVar4 = (av) arrayList.get(i9);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i9)).booleanValue();
            ArrayList arrayList12 = this.P;
            if (zBooleanValue2) {
                z = z3;
                i5 = i9;
                z2 = z4;
                int i27 = 1;
                ArrayList arrayList13 = avVar4.e;
                int size9 = arrayList13.size() - 1;
                while (size9 >= 0) {
                    dm dmVar3 = (dm) arrayList13.get(size9);
                    int i28 = dmVar3.a;
                    if (i28 == i27) {
                        arrayList12.remove(dmVar3.b);
                    } else if (i28 != 3) {
                        switch (i28) {
                            case 6:
                                arrayList12.add(dmVar3.b);
                                break;
                            case 7:
                                arrayList12.remove(dmVar3.b);
                                break;
                            case 8:
                                ccVar = null;
                                break;
                            case 9:
                                ccVar = dmVar3.b;
                                break;
                            case 10:
                                dmVar3.i = dmVar3.h;
                                break;
                        }
                    } else {
                        arrayList12.add(dmVar3.b);
                    }
                    size9--;
                    i27 = 1;
                }
            } else {
                int i29 = 0;
                while (true) {
                    ArrayList arrayList14 = avVar4.e;
                    if (i29 < arrayList14.size()) {
                        dm dmVar4 = (dm) arrayList14.get(i29);
                        boolean z7 = z3;
                        int i30 = dmVar4.a;
                        if (i30 != i10) {
                            i6 = i9;
                            if (i30 != 2) {
                                if (i30 == 3 || i30 == 6) {
                                    arrayList12.remove(dmVar4.b);
                                    cc ccVar7 = dmVar4.b;
                                    if (ccVar7 == ccVar) {
                                        arrayList14.add(i29, new dm(9, ccVar7));
                                        i29++;
                                        ccVar = null;
                                    }
                                } else if (i30 == 7) {
                                    i7 = 1;
                                } else if (i30 == 8) {
                                    arrayList14.add(i29, new dm(9, ccVar, null));
                                    dmVar4.c = true;
                                    ccVar = dmVar4.b;
                                    i29++;
                                }
                                i7 = 1;
                            } else {
                                cc ccVar8 = dmVar4.b;
                                int i31 = ccVar8.mContainerId;
                                int size10 = arrayList12.size() - 1;
                                boolean z8 = false;
                                while (size10 >= 0) {
                                    int i32 = size10;
                                    cc ccVar9 = (cc) arrayList12.get(size10);
                                    boolean z9 = z4;
                                    if (ccVar9.mContainerId != i31) {
                                        i31 = i31;
                                    } else if (ccVar9 == ccVar8) {
                                        i31 = i31;
                                        z8 = true;
                                    } else {
                                        if (ccVar9 == ccVar) {
                                            bArr = null;
                                            arrayList14.add(i29, new dm(9, ccVar9, null));
                                            i29++;
                                            ccVar = null;
                                        } else {
                                            bArr = null;
                                        }
                                        dm dmVar5 = new dm(3, ccVar9, bArr);
                                        dmVar5.d = dmVar4.d;
                                        dmVar5.f = dmVar4.f;
                                        dmVar5.e = dmVar4.e;
                                        dmVar5.g = dmVar4.g;
                                        arrayList14.add(i29, dmVar5);
                                        arrayList12.remove(ccVar9);
                                        i29++;
                                        ccVar = ccVar;
                                    }
                                    size10 = i32 - 1;
                                    i31 = i31;
                                    z4 = z9;
                                }
                                z4 = z4;
                                i7 = 1;
                                if (z8) {
                                    arrayList14.remove(i29);
                                    i29--;
                                } else {
                                    dmVar4.a = 1;
                                    dmVar4.c = true;
                                    arrayList12.add(ccVar8);
                                }
                            }
                            i29 += i7;
                            i10 = i7;
                            z3 = z7;
                            i9 = i6;
                            z4 = z4;
                        } else {
                            i6 = i9;
                            i7 = i10;
                        }
                        z4 = z4;
                        arrayList12.add(dmVar4.b);
                        i29 += i7;
                        i10 = i7;
                        z3 = z7;
                        i9 = i6;
                        z4 = z4;
                    } else {
                        z = z3;
                        i5 = i9;
                        z2 = z4;
                    }
                }
            }
            z4 = z2 || avVar4.k;
            i9 = i5 + 1;
            z3 = z;
        }
    }

    private final void ay() {
        for (eb ebVar : as()) {
            if (ebVar.e) {
                ebVar.e = false;
                ebVar.e();
            }
        }
    }

    private final void az(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((av) arrayList.get(i)).t) {
                if (i2 != i) {
                    ax(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((av) arrayList.get(i2)).t) {
                        i2++;
                    }
                }
                ax(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ax(arrayList, arrayList2, i2, size);
        }
    }

    public static cc h(View view) {
        while (view != null) {
            cc ccVarI = i(view);
            if (ccVarI != null) {
                return ccVarI;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static cc i(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof cc) {
            return (cc) tag;
        }
        return null;
    }

    public final void A(cc ccVar) {
        if (ccVar == null || !ccVar.equals(e(ccVar.mWho))) {
            return;
        }
        ccVar.performPrimaryNavigationFragmentChanged();
    }

    final void B() {
        if (this.f != null) {
            q();
        }
        F(5);
    }

    final void C(boolean z, boolean z2) {
        if (z2 && (this.p instanceof ava)) {
            U(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (cc ccVar : this.C.f()) {
            if (ccVar != null) {
                ccVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    ccVar.mChildFragmentManager.C(z, true);
                }
            }
        }
    }

    final void D() {
        this.y = false;
        this.z = false;
        this.B.g = false;
        F(7);
    }

    final void E() {
        this.y = false;
        this.z = false;
        this.B.g = false;
        F(5);
    }

    public final void F(int i) {
        try {
            this.E = true;
            for (afjq afjqVar : ((HashMap) this.C.b).values()) {
                if (afjqVar != null) {
                    afjqVar.b = i;
                }
            }
            M(i, false);
            Iterator it = as().iterator();
            while (it.hasNext()) {
                ((eb) it.next()).f();
            }
            this.E = false;
            am(true);
        } catch (Throwable th) {
            this.E = false;
            throw th;
        }
    }

    final void G() {
        this.z = true;
        this.B.g = true;
        F(4);
    }

    public final void H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        ejt ejtVar = this.C;
        HashMap map = (HashMap) ejtVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (afjq afjqVar : map.values()) {
                printWriter.print(str);
                if (afjqVar != null) {
                    String strValueOf = String.valueOf(str);
                    Object obj = afjqVar.d;
                    printWriter.println(obj);
                    ((cc) obj).dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) ejtVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                cc ccVar = (cc) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(ccVar.toString());
            }
        }
        ArrayList arrayList2 = this.F;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                cc ccVar2 = (cc) this.F.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(ccVar2.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                av avVar = (av) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(avVar.toString());
                avVar.h(strValueOf2.concat("    "), printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        ArrayList arrayList3 = this.b;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    cy cyVar = (cy) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(cyVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.y);
        printWriter.print(" mStopped=");
        printWriter.print(this.z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A);
        if (this.x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.x);
        }
    }

    public final void I() {
        Iterator it = as().iterator();
        while (it.hasNext()) {
            ((eb) it.next()).f();
        }
    }

    public final void J(cy cyVar, boolean z) {
        if (!z) {
            if (this.p == null) {
                if (!this.A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            at();
        }
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (this.p == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(cyVar);
            synchronized (arrayList) {
                try {
                    if (arrayList.size() == 1) {
                        this.p.d.removeCallbacks(this.Q);
                        this.p.d.post(this.Q);
                        V();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    final void K(cy cyVar, boolean z) {
        if (z && (this.p == null || this.A)) {
            return;
        }
        aw(z);
        av avVar = this.f;
        if (avVar != null) {
            avVar.b = false;
            avVar.d();
            if (aa(3)) {
                Objects.toString(this.f);
                Objects.toString(cyVar);
            }
            this.f.a(false, false);
            this.f.i(this.N, this.O);
            ArrayList arrayList = this.f.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cc ccVar = ((dm) arrayList.get(i)).b;
                if (ccVar != null) {
                    ccVar.mTransitioning = false;
                }
            }
            this.f = null;
        }
        cyVar.i(this.N, this.O);
        this.E = true;
        try {
            az(this.N, this.O);
            au();
            V();
            av();
            this.C.h();
        } catch (Throwable th) {
            au();
            throw th;
        }
    }

    final void L(cc ccVar) {
        if (aa(2)) {
            Objects.toString(ccVar);
        }
        if (ccVar.mHidden) {
            return;
        }
        ccVar.mHidden = true;
        ccVar.mHiddenChanged = !ccVar.mHiddenChanged;
        aA(ccVar);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final void M(int i, boolean z) {
        ck ckVar;
        if (this.p == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.o) {
            this.o = i;
            ejt ejtVar = this.C;
            ?? r7 = ejtVar.a;
            int size = r7.size();
            for (int i2 = 0; i2 < size; i2++) {
                afjq afjqVar = (afjq) ((HashMap) ejtVar.b).get(((cc) r7.get(i2)).mWho);
                if (afjqVar != null) {
                    afjqVar.i();
                }
            }
            for (afjq afjqVar2 : ((HashMap) ejtVar.b).values()) {
                if (afjqVar2 != null) {
                    afjqVar2.i();
                    cc ccVar = (cc) afjqVar2.d;
                    if (ccVar.mRemoving && !ccVar.isInBackStack()) {
                        if (ccVar.mBeingSaved) {
                            if (!((HashMap) ejtVar.c).containsKey(ccVar.mWho)) {
                                ejtVar.a(ccVar.mWho, afjqVar2.e());
                            }
                        }
                        ejtVar.m(afjqVar2);
                    }
                }
            }
            aB();
            if (this.x && (ckVar = this.p) != null && this.o == 7) {
                ckVar.e();
                this.x = false;
            }
        }
    }

    public final void N(String str, int i) {
        J(new cz(this, str, -1, i), false);
    }

    final void O(cc ccVar) {
        if (aa(2)) {
            Objects.toString(ccVar);
            int i = ccVar.mBackStackNesting;
        }
        boolean zIsInBackStack = ccVar.isInBackStack();
        if (ccVar.mDetached && zIsInBackStack) {
            return;
        }
        this.C.i(ccVar);
        if (aj(ccVar)) {
            this.x = true;
        }
        ccVar.mRemoving = true;
        aA(ccVar);
    }

    public final void P(cx cxVar) {
        this.m.remove(cxVar);
    }

    final void Q(Parcelable parcelable) {
        afjq afjqVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.p.c.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.p.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        ejt ejtVar = this.C;
        HashMap map2 = (HashMap) ejtVar.c;
        map2.clear();
        map2.putAll(map);
        de deVar = (de) bundle3.getParcelable("state");
        if (deVar != null) {
            ((HashMap) ejtVar.b).clear();
            ArrayList arrayList = deVar.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Bundle bundleA = ejtVar.a((String) arrayList.get(i), null);
                if (bundleA != null) {
                    cc ccVar = (cc) this.B.b.get(((dj) bundleA.getParcelable("state")).b);
                    if (ccVar != null) {
                        if (aa(2)) {
                            Objects.toString(ccVar);
                        }
                        afjqVar = new afjq(this.D, ejtVar, ccVar, bundleA);
                    } else {
                        afjqVar = new afjq(this.D, ejtVar, this.p.c.getClassLoader(), j(), bundleA);
                    }
                    Object obj = afjqVar.d;
                    cc ccVar2 = (cc) obj;
                    ccVar2.mSavedFragmentState = bundleA;
                    ccVar2.mFragmentManager = this;
                    if (aa(2)) {
                        String str3 = ccVar2.mWho;
                        Objects.toString(obj);
                    }
                    afjqVar.j(this.p.c.getClassLoader());
                    ejtVar.l(afjqVar);
                    afjqVar.b = this.o;
                }
            }
            for (cc ccVar3 : new ArrayList(this.B.b.values())) {
                if (!ejtVar.j(ccVar3.mWho)) {
                    if (aa(2)) {
                        Objects.toString(ccVar3);
                        Objects.toString(deVar.a);
                    }
                    this.B.e(ccVar3);
                    ccVar3.mFragmentManager = this;
                    afjq afjqVar2 = new afjq(this.D, ejtVar, ccVar3);
                    afjqVar2.b = 1;
                    afjqVar2.i();
                    ccVar3.mRemoving = true;
                    afjqVar2.i();
                }
            }
            ArrayList<String> arrayList2 = deVar.b;
            ((ArrayList) ejtVar.a).clear();
            if (arrayList2 != null) {
                for (String str4 : arrayList2) {
                    cc ccVarB = ejtVar.b(str4);
                    if (ccVarB == null) {
                        throw new IllegalStateException(a.bU((byte) 41, str4, "No instantiated fragment for ("));
                    }
                    if (aa(2)) {
                        Objects.toString(ccVarB);
                    }
                    ejtVar.g(ccVarB);
                }
            }
            aw[] awVarArr = deVar.c;
            if (awVarArr != null) {
                this.c = new ArrayList(awVarArr.length);
                int i2 = 0;
                while (true) {
                    aw[] awVarArr2 = deVar.c;
                    if (i2 >= awVarArr2.length) {
                        break;
                    }
                    aw awVar = awVarArr2[i2];
                    av avVar = new av(this);
                    awVar.a(avVar);
                    avVar.c = awVar.g;
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList3 = awVar.b;
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        String str5 = (String) arrayList3.get(i3);
                        if (str5 != null) {
                            ((dm) avVar.e.get(i3)).b = e(str5);
                        }
                        i3++;
                    }
                    avVar.c(1);
                    if (aa(2)) {
                        int i4 = avVar.c;
                        avVar.toString();
                        PrintWriter printWriter = new PrintWriter(new dx());
                        avVar.h("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.c.add(avVar);
                    i2++;
                }
            } else {
                this.c = new ArrayList();
            }
            this.i.set(deVar.d);
            String str6 = deVar.e;
            if (str6 != null) {
                cc ccVarE = e(str6);
                this.s = ccVarE;
                A(ccVarE);
            }
            ArrayList arrayList4 = deVar.f;
            if (arrayList4 != null) {
                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                    this.j.put((String) arrayList4.get(i5), (ay) deVar.g.get(i5));
                }
            }
            this.w = new ArrayDeque(deVar.h);
        }
    }

    final void R(cc ccVar, boolean z) {
        ViewGroup viewGroupAr = ar(ccVar);
        if (viewGroupAr == null || !(viewGroupAr instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupAr).a = !z;
    }

    final void S(cc ccVar, bob bobVar) {
        if (!ccVar.equals(e(ccVar.mWho)) || (ccVar.mHost != null && ccVar.mFragmentManager != this)) {
            throw new IllegalArgumentException(a.bZ(this, ccVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        ccVar.mMaxState = bobVar;
    }

    final void T(cc ccVar) {
        if (ccVar != null && (!ccVar.equals(e(ccVar.mWho)) || (ccVar.mHost != null && ccVar.mFragmentManager != this))) {
            throw new IllegalArgumentException(a.bZ(this, ccVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        cc ccVar2 = this.s;
        this.s = ccVar;
        A(ccVar2);
        A(this.s);
    }

    public final void U(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new dx());
        ck ckVar = this.p;
        if (ckVar != null) {
            try {
                ckVar.h(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            H("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void V() {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.h.g(true);
                if (aa(3)) {
                    toString();
                }
            } else {
                boolean z = b() > 0 && ac(this.r);
                if (aa(3)) {
                    toString();
                }
                this.h.g(z);
            }
        }
    }

    final boolean W(MenuItem menuItem) {
        if (this.o <= 0) {
            return false;
        }
        for (cc ccVar : this.C.f()) {
            if (ccVar != null && ccVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean X(Menu menu, MenuInflater menuInflater) {
        if (this.o <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (cc ccVar : this.C.f()) {
            if (ccVar != null && ccVar.isMenuVisible() && ccVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ccVar);
                z = true;
            }
        }
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                cc ccVar2 = (cc) this.F.get(i);
                if (arrayList == null || !arrayList.contains(ccVar2)) {
                    ccVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.F = arrayList;
        return z;
    }

    final boolean Y(MenuItem menuItem) {
        if (this.o <= 0) {
            return false;
        }
        for (cc ccVar : this.C.f()) {
            if (ccVar != null && ccVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean Z(Menu menu) {
        boolean z = false;
        if (this.o > 0) {
            for (cc ccVar : this.C.f()) {
                if (ccVar != null && ccVar.isMenuVisible() && ccVar.performPrepareOptionsMenu(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int a(String str, int i, boolean z) {
        if (this.c.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return (-1) + this.c.size();
        }
        int size = this.c.size() - 1;
        while (size >= 0) {
            av avVar = (av) this.c.get(size);
            if ((str != null && str.equals(avVar.m)) || (i >= 0 && i == avVar.c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size != this.c.size() - 1) {
                return size + 1;
            }
            return -1;
        }
        while (true) {
            int i2 = size;
            if (i2 <= 0) {
                return i2;
            }
            size = i2 - 1;
            av avVar2 = (av) this.c.get(size);
            if (str == null || !str.equals(avVar2.m)) {
                if (i < 0 || i != avVar2.c) {
                    return i2;
                }
            }
        }
    }

    public final boolean ab() {
        cc ccVar = this.r;
        if (ccVar != null) {
            return ccVar.isAdded() && ccVar.getParentFragmentManager().ab();
        }
        return true;
    }

    final boolean ac(cc ccVar) {
        if (ccVar == null) {
            return true;
        }
        dd ddVar = ccVar.mFragmentManager;
        return ccVar.equals(ddVar.s) && ac(ddVar.r);
    }

    public final boolean ad() {
        return this.y || this.z;
    }

    public final boolean ae(String str, int i, int i2) {
        am(false);
        aw(true);
        cc ccVar = this.s;
        if (ccVar != null && i < 0 && str == null && ccVar.getChildFragmentManager().ae(null, -1, 0)) {
            return true;
        }
        boolean zAf = af(this.N, this.O, str, i, i2);
        if (zAf) {
            this.E = true;
            try {
                az(this.N, this.O);
                au();
            } catch (Throwable th) {
                au();
                throw th;
            }
        }
        V();
        av();
        this.C.h();
        return zAf;
    }

    final boolean af(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iA = a(str, i, 1 == i2);
        if (iA < 0) {
            return false;
        }
        int size = this.c.size();
        while (true) {
            size--;
            if (size < iA) {
                return true;
            }
            arrayList.add((av) this.c.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
    }

    public final av ag(int i) {
        if (i != this.c.size()) {
            return (av) this.c.get(i);
        }
        av avVar = this.f;
        if (avVar == null) {
            throw new IndexOutOfBoundsException();
        }
        return avVar;
    }

    public final void ah() {
        am(true);
        ay();
    }

    public final void ak(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bR(i, "Bad id: "));
        }
        J(new cz(this, null, i, 1), z);
    }

    final void am(boolean z) {
        av avVar;
        aw(z);
        if (!this.g && (avVar = this.f) != null) {
            avVar.b = false;
            avVar.d();
            if (aa(3)) {
                Objects.toString(this.f);
                Objects.toString(this.b);
            }
            this.f.a(false, false);
            this.b.add(0, this.f);
            ArrayList arrayList = this.f.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cc ccVar = ((dm) arrayList.get(i)).b;
                if (ccVar != null) {
                    ccVar.mTransitioning = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.N;
            ArrayList arrayList3 = this.O;
            ArrayList arrayList4 = this.b;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zI = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zI |= ((cy) arrayList4.get(i2)).i(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.p.d.removeCallbacks(this.Q);
                    if (!zI) {
                        break;
                    }
                    this.E = true;
                    try {
                        az(this.N, this.O);
                        au();
                    } catch (Throwable th) {
                        au();
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.b.clear();
                    this.p.d.removeCallbacks(this.Q);
                    throw th2;
                }
            }
        }
        V();
        av();
        this.C.h();
    }

    public final dl an() {
        cc ccVar = this.r;
        return ccVar != null ? ccVar.mFragmentManager.an() : this.R;
    }

    final afjq ao(cc ccVar) {
        String str = ccVar.mPreviousWho;
        if (str != null) {
            bmy.a(ccVar, str);
        }
        if (aa(2)) {
            Objects.toString(ccVar);
        }
        afjq afjqVarAp = ap(ccVar);
        ccVar.mFragmentManager = this;
        ejt ejtVar = this.C;
        ejtVar.l(afjqVarAp);
        if (!ccVar.mDetached) {
            ejtVar.g(ccVar);
            ccVar.mRemoving = false;
            if (ccVar.mView == null) {
                ccVar.mHiddenChanged = false;
            }
            if (aj(ccVar)) {
                this.x = true;
            }
        }
        return afjqVarAp;
    }

    final afjq ap(cc ccVar) {
        ejt ejtVar = this.C;
        afjq afjqVarK = ejtVar.k(ccVar.mWho);
        if (afjqVarK != null) {
            return afjqVarK;
        }
        afjq afjqVar = new afjq(this.D, ejtVar, ccVar);
        afjqVar.j(this.p.c.getClassLoader());
        afjqVar.b = this.o;
        return afjqVar;
    }

    final void aq(afjq afjqVar) {
        cc ccVar = (cc) afjqVar.d;
        if (ccVar.mDeferStart) {
            if (this.E) {
                this.M = true;
            } else {
                ccVar.mDeferStart = false;
                afjqVar.i();
            }
        }
    }

    public final int b() {
        return this.c.size() + (this.f != null ? 1 : 0);
    }

    public final Bundle c() {
        aw[] awVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        ay();
        I();
        am(true);
        this.y = true;
        this.B.g = true;
        ejt ejtVar = this.C;
        HashMap map = (HashMap) ejtVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (afjq afjqVar : map.values()) {
            if (afjqVar != null) {
                Object obj = afjqVar.d;
                cc ccVar = (cc) obj;
                ejtVar.a(ccVar.mWho, afjqVar.e());
                arrayList2.add(ccVar.mWho);
                if (aa(2)) {
                    Objects.toString(obj);
                    Objects.toString(ccVar.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = (HashMap) ejtVar.c;
        if (!map2.isEmpty()) {
            Object obj2 = ejtVar.a;
            synchronized (obj2) {
                awVarArr = null;
                if (((ArrayList) obj2).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) obj2).size());
                    for (cc ccVar2 : (ArrayList) obj2) {
                        arrayList.add(ccVar2.mWho);
                        if (aa(2)) {
                            String str = ccVar2.mWho;
                            Objects.toString(ccVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                awVarArr = new aw[size];
                for (int i = 0; i < size; i++) {
                    awVarArr[i] = new aw((av) this.c.get(i));
                    if (aa(2)) {
                        Objects.toString(this.c.get(i));
                    }
                }
            }
            de deVar = new de();
            deVar.a = arrayList2;
            deVar.b = arrayList;
            deVar.c = awVarArr;
            deVar.d = this.i.get();
            cc ccVar3 = this.s;
            if (ccVar3 != null) {
                deVar.e = ccVar3.mWho;
            }
            ArrayList arrayList3 = deVar.f;
            Map map3 = this.j;
            arrayList3.addAll(map3.keySet());
            deVar.g.addAll(map3.values());
            deVar.h = new ArrayList(this.w);
            bundle.putParcelable("state", deVar);
            Map map4 = this.k;
            for (String str2 : map4.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str2)), (Bundle) map4.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str3)), (Bundle) map2.get(str3));
            }
        }
        return bundle;
    }

    public final cb d(cc ccVar) {
        afjq afjqVarK = this.C.k(ccVar.mWho);
        if (afjqVarK == null || !((cc) afjqVarK.d).equals(ccVar)) {
            U(new IllegalStateException(a.bV(ccVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        if (((cc) afjqVarK.d).mState >= 0) {
            return new cb(afjqVarK.e());
        }
        return null;
    }

    final cc e(String str) {
        return this.C.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cc] */
    public final cc f(int i) {
        ?? r2;
        ejt ejtVar = this.C;
        ArrayList arrayList = (ArrayList) ejtVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (afjq afjqVar : ((HashMap) ejtVar.b).values()) {
                    if (afjqVar != null) {
                        r2 = afjqVar.d;
                        if (((cc) r2).mFragmentId == i) {
                            break;
                        }
                    }
                }
                r2 = 0;
                break;
            }
            r2 = (cc) arrayList.get(size);
            if (r2 != 0 && r2.mFragmentId == i) {
                break;
            }
        }
        return (cc) r2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:31:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cc] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final cc g(String str) {
        ?? r2;
        Object obj;
        ejt ejtVar = this.C;
        if (str != null) {
            ArrayList arrayList = (ArrayList) ejtVar.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r2 = (cc) arrayList.get(size);
                if (r2 == 0 || !str.equals(r2.mTag)) {
                }
            }
            r2 = 0;
            r2 = 0;
            if (str != null) {
                for (afjq afjqVar : ((HashMap) ejtVar.b).values()) {
                    if (afjqVar != null) {
                        obj = afjqVar.d;
                        if (str.equals(((cc) obj).mTag)) {
                            r2 = obj;
                            break;
                        }
                    }
                }
            }
        } else {
            r2 = 0;
            r2 = 0;
            if (str != null) {
                while (r4.hasNext()) {
                    if (afjqVar != null) {
                        obj = afjqVar.d;
                        if (str.equals(((cc) obj).mTag)) {
                            r2 = obj;
                            break;
                        }
                    }
                }
            }
        }
        return (cc) r2;
    }

    public final cj j() {
        cc ccVar = this.r;
        return ccVar != null ? ccVar.mFragmentManager.j() : this.L;
    }

    public final List k() {
        return this.C.f();
    }

    final Set l(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((av) arrayList.get(i)).e;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                cc ccVar = ((dm) arrayList2.get(i3)).b;
                if (ccVar != null && (viewGroup = ccVar.mContainer) != null) {
                    dl dlVarAn = an();
                    dlVarAn.getClass();
                    hashSet.add(dl.c(viewGroup, dlVarAn));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void m(dh dhVar) {
        this.n.add(dhVar);
    }

    public final void n(cx cxVar) {
        this.m.add(cxVar);
    }

    public void noteStateNotSaved() {
        if (this.p != null) {
            this.y = false;
            this.z = false;
            this.B.g = false;
            for (cc ccVar : this.C.f()) {
                if (ccVar != null) {
                    ccVar.noteStateNotSaved();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void o(ck ckVar, ch chVar, cc ccVar) {
        dg dgVar;
        bog bogVar;
        if (this.p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.p = ckVar;
        this.q = chVar;
        this.r = ccVar;
        if (ccVar != null) {
            m(new cs(ccVar));
        } else if (ckVar instanceof dh) {
            m((dh) ckVar);
        }
        if (this.r != null) {
            V();
        }
        if (ckVar instanceof qw) {
            qw qwVar = (qw) ckVar;
            qv onBackPressedDispatcher = qwVar.getOnBackPressedDispatcher();
            this.e = onBackPressedDispatcher;
            if (ccVar != null) {
                bogVar = qwVar;
                bogVar = ccVar;
            }
            bogVar = qwVar;
            onBackPressedDispatcher.c(bogVar, this.h);
        }
        int i = 0;
        if (ccVar != null) {
            dg dgVar2 = ccVar.mFragmentManager.B;
            HashMap map = dgVar2.c;
            dgVar = (dg) map.get(ccVar.mWho);
            if (dgVar == null) {
                dgVar = new dg(dgVar2.e);
                map.put(ccVar.mWho, dgVar);
            }
            this.B = dgVar;
        } else {
            if (ckVar instanceof bpp) {
                dgVar = (dg) new bpn(((bpp) ckVar).getViewModelStore(), dg.a).a(dg.class);
                this.B = dgVar;
            } else {
                dgVar = new dg(false);
                this.B = dgVar;
            }
            ccVar = null;
        }
        dgVar.g = ad();
        this.C.d = dgVar;
        Object obj = this.p;
        if ((obj instanceof dow) && ccVar == null) {
            dou savedStateRegistry = ((dow) obj).getSavedStateRegistry();
            savedStateRegistry.b("android:support:fragments", new cn(this, i));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                Q(bundleA);
            }
        }
        Object obj2 = this.p;
        if (obj2 instanceof rh) {
            rg activityResultRegistry = ((rh) obj2).getActivityResultRegistry();
            String strConcat = ccVar != null ? String.valueOf(ccVar.mWho).concat(":") : "";
            rr rrVar = new rr();
            ct ctVar = new ct(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.t = activityResultRegistry.a(strConcat2.concat("StartActivityForResult"), rrVar, ctVar);
            this.u = activityResultRegistry.a(strConcat2.concat("StartIntentSenderForResult"), new cu(), new ct(this, 2));
            this.v = activityResultRegistry.a(strConcat2.concat("RequestPermissions"), new rq(), new ct(this, 1));
        }
        Object obj3 = this.p;
        if (obj3 instanceof avi) {
            ((avi) obj3).addOnConfigurationChangedListener(this.G);
        }
        Object obj4 = this.p;
        if (obj4 instanceof avj) {
            ((avj) obj4).addOnTrimMemoryListener(this.H);
        }
        Object obj5 = this.p;
        if (obj5 instanceof auz) {
            ((auz) obj5).addOnMultiWindowModeChangedListener(this.I);
        }
        Object obj6 = this.p;
        if (obj6 instanceof ava) {
            ((ava) obj6).addOnPictureInPictureModeChangedListener(this.J);
        }
        Object obj7 = this.p;
        if ((obj7 instanceof ayn) && ccVar == null) {
            ((ayn) obj7).addMenuProvider(this.K);
        }
    }

    final void p(cc ccVar) {
        if (aa(2)) {
            Objects.toString(ccVar);
        }
        if (ccVar.mDetached) {
            ccVar.mDetached = false;
            if (ccVar.mAdded) {
                return;
            }
            this.C.g(ccVar);
            if (aa(2)) {
                Objects.toString(ccVar);
            }
            if (aj(ccVar)) {
                this.x = true;
            }
        }
    }

    final void q() {
        if (aa(3)) {
            Objects.toString(this.f);
        }
        av avVar = this.f;
        if (avVar != null) {
            avVar.b = false;
            avVar.d();
            av avVar2 = this.f;
            bh bhVar = new bh(this, 16);
            if (avVar2.u == null) {
                avVar2.u = new ArrayList();
            }
            avVar2.u.add(bhVar);
            this.f.a(false, true);
            this.g = true;
            ah();
            this.g = false;
            this.f = null;
        }
    }

    final void r(cc ccVar) {
        if (aa(2)) {
            Objects.toString(ccVar);
        }
        if (ccVar.mDetached) {
            return;
        }
        ccVar.mDetached = true;
        if (ccVar.mAdded) {
            if (aa(2)) {
                Objects.toString(ccVar);
            }
            this.C.i(ccVar);
            if (aj(ccVar)) {
                this.x = true;
            }
            aA(ccVar);
        }
    }

    final void s() {
        this.y = false;
        this.z = false;
        this.B.g = false;
        F(4);
    }

    final void t(Configuration configuration, boolean z) {
        if (z && (this.p instanceof avi)) {
            U(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (cc ccVar : this.C.f()) {
            if (ccVar != null) {
                ccVar.performConfigurationChanged(configuration);
                if (z) {
                    ccVar.mChildFragmentManager.t(configuration, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        cc ccVar = this.r;
        if (ccVar != null) {
            sb.append(ccVar.getClass().getSimpleName());
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(this.r)));
            sb.append('}');
        } else {
            ck ckVar = this.p;
            if (ckVar != null) {
                sb.append(ckVar.getClass().getSimpleName());
                sb.append('{');
                sb.append(Integer.toHexString(System.identityHashCode(this.p)));
                sb.append('}');
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u() {
        this.y = false;
        this.z = false;
        this.B.g = false;
        F(1);
    }

    final void v() {
        this.A = true;
        am(true);
        I();
        ck ckVar = this.p;
        if (ckVar instanceof bpp ? ((dg) this.C.d).f : true ^ ((Activity) ckVar.c).isChangingConfigurations()) {
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ay) it.next()).a.iterator();
                while (it2.hasNext()) {
                    ((dg) this.C.d).c((String) it2.next(), false);
                }
            }
        }
        F(-1);
        Object obj = this.p;
        if (obj instanceof avj) {
            ((avj) obj).removeOnTrimMemoryListener(this.H);
        }
        Object obj2 = this.p;
        if (obj2 instanceof avi) {
            ((avi) obj2).removeOnConfigurationChangedListener(this.G);
        }
        Object obj3 = this.p;
        if (obj3 instanceof auz) {
            ((auz) obj3).removeOnMultiWindowModeChangedListener(this.I);
        }
        Object obj4 = this.p;
        if (obj4 instanceof ava) {
            ((ava) obj4).removeOnPictureInPictureModeChangedListener(this.J);
        }
        Object obj5 = this.p;
        if ((obj5 instanceof ayn) && this.r == null) {
            ((ayn) obj5).removeMenuProvider(this.K);
        }
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.e != null) {
            this.h.f();
            this.e = null;
        }
        rc rcVar = this.t;
        if (rcVar != null) {
            rcVar.a();
            this.u.a();
            this.v.a();
        }
    }

    final void w(boolean z) {
        if (z && (this.p instanceof avj)) {
            U(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (cc ccVar : this.C.f()) {
            if (ccVar != null) {
                ccVar.performLowMemory();
                if (z) {
                    ccVar.mChildFragmentManager.w(true);
                }
            }
        }
    }

    final void x(boolean z, boolean z2) {
        if (z2 && (this.p instanceof auz)) {
            U(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (cc ccVar : this.C.f()) {
            if (ccVar != null) {
                ccVar.performMultiWindowModeChanged(z);
                if (z2) {
                    ccVar.mChildFragmentManager.x(z, true);
                }
            }
        }
    }

    public final void y() {
        for (cc ccVar : this.C.e()) {
            if (ccVar != null) {
                ccVar.onHiddenChanged(ccVar.isHidden());
                ccVar.mChildFragmentManager.y();
            }
        }
    }

    final void z(Menu menu) {
        if (this.o > 0) {
            for (cc ccVar : this.C.f()) {
                if (ccVar != null) {
                    ccVar.performOptionsMenuClosed(menu);
                }
            }
        }
    }
}
