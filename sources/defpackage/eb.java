package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eb {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    private boolean f;

    public eb(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private final void j() {
        for (ea eaVar : this.b) {
            if (eaVar.i == 2) {
                eaVar.h(dl.h(eaVar.a.requireView().getVisibility()), 1);
            }
        }
    }

    private final void k(Map map, View view) {
        int i = bac.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    k(map, childAt);
                }
            }
        }
    }

    private static void l(afv afvVar, Collection collection) {
        atqq.aI(afvVar.entrySet(), new ank(collection, 1), false);
    }

    public final ea a(cc ccVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            ea eaVar = (ea) next;
            if (awrc.c(eaVar.a, ccVar) && !eaVar.b) {
                return (ea) next;
            }
        }
        next = null;
        return (ea) next;
    }

    public final ea b(cc ccVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            ea eaVar = (ea) next;
            if (awrc.c(eaVar.a, ccVar) && !eaVar.b) {
                return (ea) next;
            }
        }
        next = null;
        return (ea) next;
    }

    public final void c(ea eaVar) {
        eaVar.getClass();
        if (eaVar.f) {
            int i = eaVar.h;
            cc ccVar = eaVar.a;
            dl.g(i, ccVar.requireView(), this.a);
            eaVar.g();
        }
    }

    public final void d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atqq.aA(arrayList, ((ea) it.next()).g);
        }
        List listAp = atqq.ap(atqq.aw(arrayList));
        int size = listAp.size();
        for (int i = 0; i < size; i++) {
            ((dy) listAp.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((ea) list.get(i2));
        }
        List listAp2 = atqq.ap(list);
        int size3 = listAp2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ea eaVar = (ea) listAp2.get(i3);
            if (eaVar.g.isEmpty()) {
                eaVar.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x040a A[Catch: all -> 0x0565, LOOP:25: B:162:0x0404->B:164:0x040a, LOOP_END, TryCatch #0 {, blocks: (B:10:0x0018, B:11:0x0026, B:13:0x002d, B:15:0x0039, B:18:0x0040, B:19:0x0043, B:20:0x0047, B:22:0x004e, B:24:0x0058, B:26:0x005e, B:27:0x0061, B:32:0x0071, B:34:0x0077, B:28:0x0065, B:30:0x006b, B:31:0x006e, B:35:0x007b, B:37:0x0081, B:39:0x008f, B:40:0x009b, B:42:0x00a1, B:44:0x00b5, B:48:0x00bb, B:49:0x00c6, B:51:0x00cc, B:53:0x00e0, B:57:0x00e6, B:59:0x00ef, B:60:0x00f5, B:61:0x010b, B:63:0x0111, B:64:0x0132, B:65:0x013a, B:67:0x0140, B:74:0x015a, B:75:0x0169, B:76:0x0172, B:78:0x0178, B:80:0x0185, B:81:0x0189, B:82:0x0192, B:84:0x0198, B:86:0x01a5, B:87:0x01a9, B:88:0x01af, B:90:0x01b5, B:93:0x01c3, B:94:0x01ec, B:165:0x0416, B:166:0x0424, B:168:0x042a, B:169:0x0438, B:170:0x0441, B:172:0x0447, B:174:0x045c, B:176:0x0460, B:177:0x0464, B:179:0x046e, B:181:0x0474, B:182:0x0478, B:184:0x047d, B:185:0x0480, B:186:0x048a, B:187:0x048e, B:189:0x0494, B:191:0x04a0, B:193:0x04a6, B:195:0x04ac, B:197:0x04b2, B:198:0x04b6, B:199:0x04bf, B:200:0x04c4, B:202:0x04ca, B:204:0x04d8, B:206:0x04de, B:207:0x04e2, B:209:0x04e8, B:215:0x04fb, B:216:0x0504, B:218:0x050a, B:219:0x0516, B:223:0x051f, B:224:0x0524, B:226:0x052a, B:231:0x053d, B:233:0x0541, B:238:0x0560, B:235:0x054a, B:237:0x0554, B:98:0x01f7, B:99:0x0224, B:101:0x022a, B:105:0x023c, B:107:0x0272, B:109:0x027f, B:110:0x0286, B:111:0x028b, B:113:0x0294, B:115:0x02af, B:117:0x02be, B:118:0x02e2, B:120:0x02ec, B:121:0x02f3, B:123:0x02f9, B:124:0x0300, B:125:0x0307, B:127:0x030d, B:128:0x0314, B:130:0x0321, B:132:0x0327, B:133:0x032a, B:134:0x032b, B:136:0x0346, B:138:0x034c, B:139:0x034f, B:140:0x0350, B:142:0x035a, B:144:0x0366, B:145:0x0369, B:146:0x036c, B:148:0x0380, B:114:0x02a2, B:154:0x03cd, B:156:0x03d3, B:157:0x03d7, B:159:0x03dd, B:161:0x03e7, B:162:0x0404, B:164:0x040a), top: B:244:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x051e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    public final void e() {
        int i;
        Object next;
        Object objPrevious;
        ViewGroup viewGroup;
        ArrayList<bb> arrayList;
        bj bjVar;
        Iterator it;
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        if (this.e) {
            return;
        }
        ViewGroup viewGroup2 = this.a;
        if (!viewGroup2.isAttachedToWindow()) {
            f();
            this.d = false;
            return;
        }
        List list = this.b;
        synchronized (list) {
            List list2 = this.c;
            ArrayList arrayList2 = new ArrayList(list2);
            list2.clear();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean z4 = true;
                c = 1;
                if (!it2.hasNext()) {
                    break;
                }
                ea eaVar = (ea) it2.next();
                if (list.isEmpty() || !eaVar.a.mTransitioning) {
                    z4 = false;
                }
                eaVar.d = z4;
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                i = 2;
                if (!it3.hasNext()) {
                    break;
                }
                ea eaVar2 = (ea) it3.next();
                if (this.f) {
                    if (dd.aa(2)) {
                        Objects.toString(eaVar2);
                    }
                    eaVar2.a();
                } else {
                    if (dd.aa(2)) {
                        Objects.toString(eaVar2);
                    }
                    eaVar2.e(viewGroup2);
                }
                this.f = false;
                if (!eaVar2.c) {
                    list2.add(eaVar2);
                }
            }
            if (!list.isEmpty()) {
                j();
                ArrayList<ea> arrayList3 = new ArrayList(list);
                if (!arrayList3.isEmpty()) {
                    list.clear();
                    list2.addAll(arrayList3);
                    boolean z5 = this.d;
                    Iterator it4 = arrayList3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        ea eaVar3 = (ea) next;
                        View view = eaVar3.a.mView;
                        view.getClass();
                        if (dl.i(view) == 2 && eaVar3.h != 2) {
                            break;
                        }
                    }
                    ea eaVar4 = (ea) next;
                    ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        ea eaVar5 = (ea) objPrevious;
                        View view2 = eaVar5.a.mView;
                        view2.getClass();
                        if (dl.i(view2) != 2 && eaVar5.h == 2) {
                            break;
                        }
                    }
                    ea eaVar6 = (ea) objPrevious;
                    if (dd.aa(2)) {
                        Objects.toString(eaVar4);
                        Objects.toString(eaVar6);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    cc ccVar = ((ea) atqq.ab(arrayList3)).a;
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        by byVar = ((ea) it5.next()).a.mAnimationInfo;
                        int i2 = i;
                        by byVar2 = ccVar.mAnimationInfo;
                        byVar.b = byVar2.b;
                        byVar.c = byVar2.c;
                        byVar.d = byVar2.d;
                        byVar.e = byVar2.e;
                        i = i2;
                    }
                    int i3 = i;
                    for (ea eaVar7 : arrayList3) {
                        arrayList4.add(new bb(eaVar7, z5));
                        if (z5) {
                            if (eaVar7 == eaVar4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if (eaVar7 == eaVar6) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList5.add(new bk(eaVar7, z5, z3));
                        eaVar7.c(new bg(this, eaVar7, c == true ? 1 : 0));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj : arrayList5) {
                        if (!((bk) obj).b()) {
                            arrayList6.add(obj);
                        }
                    }
                    ArrayList<bk> arrayList7 = new ArrayList();
                    for (Object obj2 : arrayList6) {
                        if (((bk) obj2).a() != null) {
                            arrayList7.add(obj2);
                        }
                    }
                    dv dvVar = null;
                    for (bk bkVar : arrayList7) {
                        dv dvVarA = bkVar.a();
                        if (dvVar != null && dvVarA != dvVar) {
                            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + bkVar.a.a + " returned Transition " + bkVar.b + " which uses a different Transition type than other Fragments.");
                        }
                        dvVar = dvVarA;
                    }
                    if (dvVar == null) {
                        viewGroup = viewGroup2;
                        arrayList = arrayList4;
                    } else {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        afv afvVar = new afv();
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        afv afvVar2 = new afv();
                        afv afvVar3 = new afv();
                        Object objC = null;
                        for (bk bkVar2 : arrayList7) {
                            if (!bkVar2.c() || eaVar4 == null || eaVar6 == null) {
                                arrayList7 = arrayList7;
                                z5 = z5;
                                viewGroup2 = viewGroup2;
                                arrayList4 = arrayList4;
                                eaVar4 = eaVar4;
                                eaVar6 = eaVar6;
                            } else {
                                objC = dvVar.c(dvVar.a(bkVar2.d));
                                cc ccVar2 = eaVar6.a;
                                arrayList11 = ccVar2.getSharedElementSourceNames();
                                arrayList11.getClass();
                                ViewGroup viewGroup3 = viewGroup2;
                                cc ccVar3 = eaVar4.a;
                                boolean z6 = z5;
                                ArrayList sharedElementSourceNames = ccVar3.getSharedElementSourceNames();
                                sharedElementSourceNames.getClass();
                                ArrayList arrayList12 = arrayList4;
                                ArrayList sharedElementTargetNames = ccVar3.getSharedElementTargetNames();
                                sharedElementTargetNames.getClass();
                                ArrayList arrayList13 = arrayList7;
                                int size = sharedElementTargetNames.size();
                                ea eaVar8 = eaVar4;
                                ea eaVar9 = eaVar6;
                                int i4 = 0;
                                while (i4 < size) {
                                    int iIndexOf = arrayList11.indexOf(sharedElementTargetNames.get(i4));
                                    ArrayList arrayList14 = sharedElementTargetNames;
                                    if (iIndexOf != -1) {
                                        arrayList11.set(iIndexOf, sharedElementSourceNames.get(i4));
                                    }
                                    i4++;
                                    sharedElementTargetNames = arrayList14;
                                }
                                ArrayList sharedElementTargetNames2 = ccVar2.getSharedElementTargetNames();
                                sharedElementTargetNames2.getClass();
                                awml awmlVar = !z6 ? new awml(ccVar3.getExitTransitionCallback(), ccVar2.getEnterTransitionCallback()) : new awml(ccVar3.getEnterTransitionCallback(), ccVar2.getExitTransitionCallback());
                                Object obj3 = awmlVar.b;
                                ave aveVar = (ave) awmlVar.a;
                                ave aveVar2 = (ave) obj3;
                                int size2 = arrayList11.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    Object obj4 = arrayList11.get(i5);
                                    obj4.getClass();
                                    ave aveVar3 = aveVar2;
                                    String str = (String) obj4;
                                    Object obj5 = sharedElementTargetNames2.get(i5);
                                    obj5.getClass();
                                    afvVar.put(str, (String) obj5);
                                    i5++;
                                    aveVar2 = aveVar3;
                                    aveVar = aveVar;
                                }
                                ave aveVar4 = aveVar2;
                                ave aveVar5 = aveVar;
                                if (dd.aa(i3)) {
                                    Iterator it6 = sharedElementTargetNames2.iterator();
                                    it6.getClass();
                                    while (it6.hasNext()) {
                                    }
                                    Iterator it7 = arrayList11.iterator();
                                    it7.getClass();
                                    while (it7.hasNext()) {
                                    }
                                }
                                View view3 = ccVar3.mView;
                                view3.getClass();
                                k(afvVar2, view3);
                                afvVar2.a(arrayList11);
                                if (aveVar5 != null) {
                                    if (!dd.aa(i3)) {
                                        throw null;
                                    }
                                    Objects.toString(eaVar8);
                                    throw null;
                                }
                                afvVar.a(afvVar2.keySet());
                                View view4 = ccVar2.mView;
                                view4.getClass();
                                k(afvVar3, view4);
                                afvVar3.a(sharedElementTargetNames2);
                                afvVar3.a(afvVar.values());
                                if (aveVar4 != null) {
                                    if (!dd.aa(i3)) {
                                        throw null;
                                    }
                                    Objects.toString(eaVar9);
                                    throw null;
                                }
                                dv dvVar2 = C0027do.a;
                                for (int i6 = afvVar.d - 1; i6 >= 0; i6--) {
                                    if (!afvVar3.containsKey((String) afvVar.g(i6))) {
                                        afvVar.e(i6);
                                    }
                                }
                                l(afvVar2, afvVar.keySet());
                                l(afvVar3, afvVar.values());
                                if (afvVar.isEmpty()) {
                                    Objects.toString(objC);
                                    Objects.toString(eaVar8);
                                    Objects.toString(eaVar9);
                                    arrayList8.clear();
                                    arrayList9.clear();
                                    objC = null;
                                }
                                arrayList7 = arrayList13;
                                viewGroup2 = viewGroup3;
                                arrayList4 = arrayList12;
                                eaVar4 = eaVar8;
                                eaVar6 = eaVar9;
                                arrayList10 = sharedElementTargetNames2;
                                z5 = z6;
                            }
                        }
                        viewGroup = viewGroup2;
                        boolean z7 = z5;
                        arrayList = arrayList4;
                        ArrayList arrayList15 = arrayList7;
                        ea eaVar10 = eaVar4;
                        ea eaVar11 = eaVar6;
                        if (objC != null) {
                            bjVar = new bj(arrayList15, eaVar10, eaVar11, dvVar, objC, arrayList8, arrayList9, afvVar, arrayList10, arrayList11, afvVar2, afvVar3, z7);
                            it = arrayList15.iterator();
                            while (it.hasNext()) {
                                ((bk) it.next()).a.d(bjVar);
                            }
                        } else if (!arrayList15.isEmpty()) {
                            Iterator it8 = arrayList15.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    if (((bk) it8.next()).b != null) {
                                        bjVar = new bj(arrayList15, eaVar10, eaVar11, dvVar, objC, arrayList8, arrayList9, afvVar, arrayList10, arrayList11, afvVar2, afvVar3, z7);
                                        it = arrayList15.iterator();
                                        while (it.hasNext()) {
                                            ((bk) it.next()).a.d(bjVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ArrayList<bb> arrayList16 = new ArrayList();
                    ArrayList arrayList17 = new ArrayList();
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        atqq.aA(arrayList17, ((bb) it9.next()).a.g);
                    }
                    boolean zIsEmpty = arrayList17.isEmpty();
                    boolean z8 = false;
                    for (bb bbVar : arrayList) {
                        ea eaVar12 = bbVar.a;
                        Context context = viewGroup.getContext();
                        context.getClass();
                        eol eolVarA = bbVar.a(context);
                        if (eolVarA != null) {
                            if (eolVarA.b == null) {
                                arrayList16.add(bbVar);
                            } else {
                                cc ccVar4 = eaVar12.a;
                                if (eaVar12.g.isEmpty()) {
                                    if (eaVar12.h == 3) {
                                        eaVar12.g();
                                    }
                                    eaVar12.d(new bd(bbVar));
                                    z8 = true;
                                } else if (dd.aa(i3)) {
                                    Objects.toString(ccVar4);
                                }
                            }
                        }
                    }
                    for (bb bbVar2 : arrayList16) {
                        ea eaVar13 = bbVar2.a;
                        cc ccVar5 = eaVar13.a;
                        if (zIsEmpty) {
                            if (!z8) {
                                eaVar13.d(new ba(bbVar2));
                            } else if (dd.aa(i3)) {
                                Objects.toString(ccVar5);
                            }
                        } else if (dd.aa(i3)) {
                            Objects.toString(ccVar5);
                        }
                    }
                    Iterator it10 = arrayList3.iterator();
                    loop12: while (true) {
                        z = true;
                        while (true) {
                            if (!it10.hasNext()) {
                                break loop12;
                            }
                            List list3 = ((ea) it10.next()).g;
                            if (!list3.isEmpty()) {
                                if (list3.isEmpty()) {
                                    break;
                                }
                                Iterator it11 = list3.iterator();
                                do {
                                    if (!it11.hasNext()) {
                                        break;
                                    }
                                } while (((dy) it11.next()).d());
                            }
                            z = false;
                        }
                    }
                    if (z) {
                        ArrayList arrayList18 = new ArrayList();
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            atqq.aA(arrayList18, ((ea) it12.next()).g);
                        }
                        if (arrayList18.isEmpty()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                    Iterator it13 = arrayList3.iterator();
                    boolean z9 = true;
                    while (it13.hasNext()) {
                        z9 &= ((ea) it13.next()).a.mTransitioning;
                    }
                    this.f = z9 && !z2;
                    if (!z9) {
                        h(arrayList3);
                        d(arrayList3);
                    } else if (z2) {
                        h(arrayList3);
                        int size3 = arrayList3.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            c((ea) arrayList3.get(i7));
                        }
                    }
                    this.d = false;
                }
            }
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        List list = this.b;
        synchronized (list) {
            j();
            h(list);
            ArrayList<ea> arrayList = new ArrayList(this.c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ea) it.next()).d = false;
            }
            for (ea eaVar : arrayList) {
                if (dd.aa(2)) {
                    if (!zIsAttachedToWindow) {
                        a.bV(viewGroup, "Container ", " is not attached to window. ");
                    }
                    Objects.toString(eaVar);
                }
                eaVar.e(viewGroup);
            }
            ArrayList<ea> arrayList2 = new ArrayList(list);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((ea) it2.next()).d = false;
            }
            for (ea eaVar2 : arrayList2) {
                if (dd.aa(2)) {
                    if (!zIsAttachedToWindow) {
                        a.bV(viewGroup, "Container ", " is not attached to window. ");
                    }
                    Objects.toString(eaVar2);
                }
                eaVar2.e(viewGroup);
            }
        }
    }

    public final void g() {
        Object objPrevious;
        List list = this.b;
        synchronized (list) {
            j();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                ea eaVar = (ea) objPrevious;
                View view = eaVar.a.mView;
                view.getClass();
                int i = dl.i(view);
                if (eaVar.h == 2 && i != 2) {
                    break;
                }
            }
            ea eaVar2 = (ea) objPrevious;
            cc ccVar = eaVar2 != null ? eaVar2.a : null;
            this.e = ccVar != null ? ccVar.isPostponed() : false;
        }
    }

    public final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ea) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atqq.aA(arrayList, ((ea) it.next()).g);
        }
        List listAp = atqq.ap(atqq.aw(arrayList));
        int size2 = listAp.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dy dyVar = (dy) listAp.get(i2);
            ViewGroup viewGroup = this.a;
            if (!dyVar.i) {
                dyVar.c(viewGroup);
            }
            dyVar.i = true;
        }
    }

    public final void i(int i, int i2, afjq afjqVar) {
        List list = this.b;
        synchronized (list) {
            Object obj = afjqVar.d;
            obj.getClass();
            ea eaVarA = a((cc) obj);
            if (eaVarA == null) {
                if (((cc) obj).mTransitioning || ((cc) obj).mRemoving) {
                    obj.getClass();
                    eaVarA = b((cc) obj);
                } else {
                    eaVarA = null;
                }
            }
            if (eaVarA != null) {
                eaVarA.h(i, i2);
            } else {
                dz dzVar = new dz(i, i2, afjqVar);
                list.add(dzVar);
                dzVar.c(new br(this, dzVar, 4));
                dzVar.c(new br(this, dzVar, 5));
            }
        }
    }
}
