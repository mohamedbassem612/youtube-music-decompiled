package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class isi {
    public final Object a;
    public final Object b;
    public final Object c;

    public isi(tbt tbtVar, avlh avlhVar, adws adwsVar, abtw abtwVar, avlh avlhVar2, avlh avlhVar3, abmt abmtVar, tqj tqjVar) {
        this.a = tbtVar;
        this.c = abmtVar;
        this.b = tqjVar;
        avmm avmmVar = new avmm();
        int i = 15;
        avmmVar.c(avlhVar.p().al(new avni() { // from class: abmr
            @Override // defpackage.avni
            public final void a(Object obj) {
                aazr aazrVar = (aazr) obj;
                avmm avmmVar2 = new avmm();
                isi isiVar = this.a;
                Object obj2 = isiVar.c;
                abmt abmtVar2 = (abmt) obj2;
                int i2 = 0;
                int i3 = 15;
                if (!abmtVar2.g.l(491, 45835344L, false)) {
                    avmmVar2.c(aazrVar.a.an().al(new abll(isiVar, 19), new abeq(i3)));
                }
                acip acipVar = aazrVar.a;
                avmmVar2.c(acipVar.E().al(new abms(isiVar, 9), new abeq(i3)));
                avmmVar2.c(acipVar.am().al(new abms(isiVar, 14), new abeq(i3)));
                avmmVar2.c(acipVar.D().al(new abms(isiVar, i3), new abeq(i3)));
                int i4 = 13;
                avmmVar2.c(acipVar.B().al(new abmm(isiVar, 13), new abeq(i3)));
                if (abmtVar2.t()) {
                    avmmVar2.c(acipVar.J().al(new abll(isiVar, 20), new abeq(i3)));
                    avmmVar2.c(acipVar.L().al(new abms(isiVar, 1), new abeq(i3)));
                }
                avmmVar2.c(acipVar.P().al(new abms(isiVar, i2), new abeq(i3)));
                avmmVar2.c(acipVar.M().al(new abms(isiVar, 2), new abeq(i3)));
                avmmVar2.c(acipVar.U().al(new abms(isiVar, 3), new abeq(i3)));
                avmmVar2.c(acipVar.O().al(new abms(isiVar, 4), new abeq(i3)));
                avmmVar2.c(acipVar.aa().al(new abms(isiVar, 5), new abeq(i3)));
                avmmVar2.c(acipVar.ae().al(new abms(isiVar, 6), new abeq(i3)));
                avmmVar2.c(acipVar.ai().al(new abms(isiVar, 7), new abeq(i3)));
                if (abmtVar2.t()) {
                    avmmVar2.c(acipVar.al().al(new abms(isiVar, 8), new abeq(i3)));
                }
                avmmVar2.c(acipVar.aq().al(new abms(isiVar, 10), new abeq(i3)));
                avmmVar2.c(acipVar.T().al(new abmm(isiVar, 4), new abeq(i3)));
                avmmVar2.c(acipVar.aj().al(new abms(isiVar, 11), new abeq(i3)));
                avmmVar2.c(acipVar.ak().al(new abms(isiVar, 12), new abeq(i3)));
                tqj tqjVar2 = abmtVar2.b;
                oqe oqeVar = new oqe(obj2, 17);
                int i5 = tqr.a;
                if (tqjVar2.k(1073814200) ? tqjVar2.k(1073814202) : ((vxz) oqeVar.io()).m(87, 45460239L)) {
                    avmmVar2.c(acipVar.ab().al(new abms(isiVar, i4), new abeq(i3)));
                }
            }
        }, new abeq(i)));
        avmmVar.c(avlhVar2.al(new abmm(this, 4), new abeq(i)));
        avmmVar.c(avlhVar3.al(new abmm(this, 6), new abeq(i)));
        avmmVar.c(((avlh) adwsVar.i).p().al(new abmm(this, 7), new abeq(i)));
        avmmVar.c(adwsVar.b().p().al(new abmm(this, 8), new abeq(i)));
        abmtVar.getClass();
        if (abmtVar.t()) {
            avmmVar.c(((avlh) adwsVar.h).p().al(new abmm(this, 9), new abeq(i)));
        }
        abmtVar.getClass();
        if (abmtVar.t()) {
            avmmVar.c(((avlh) ((gil) abtwVar).cT.io()).p().al(new abmm(this, 10), new abeq(i)));
        }
        gil gilVar = (gil) abtwVar;
        avmmVar.c(((avlh) gilVar.cU.io()).p().al(new abmm(this, 11), new abeq(i)));
        avmmVar.c(((avlh) gilVar.cX.io()).p().al(new abmm(this, 12), new abeq(i)));
        avmmVar.c(((avlh) gilVar.cY.io()).p().al(new abmm(this, 13), new abeq(i)));
        avmmVar.c(abtwVar.N().p().al(new abmm(this, 14), new abeq(i)));
        avmmVar.c(abtwVar.O().p().al(new abmm(this, i), new abeq(i)));
        avmmVar.c(((avlh) gilVar.aY.io()).p().al(new abmm(this, 16), new abeq(i)));
        avmmVar.c(abtwVar.P().p().al(new abmm(this, 2), new abeq(i)));
        avmmVar.c(abtwVar.R().p().al(new abmm(this, 3), new abeq(i)));
        avmmVar.c(((avlh) gilVar.cV.io()).p().al(new abmm(this, 5), new abeq(i)));
    }

    public static Uri G(abtd abtdVar, String str, int i, String str2, long j, long j2, long j3) {
        if (abtdVar == null) {
            return null;
        }
        abtb abtbVarA = abtdVar.a("/pudl", str, i, str2, j, j2);
        abtbVarA.d("e", j3);
        return abtbVarA.a();
    }

    public static wjf H(wjf wjfVar, wjb wjbVar) {
        wji wjiVar = (wji) wjfVar;
        aihh aihhVar = (aihh) wjiVar.a.toBuilder();
        aihhVar.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar.instance;
        alvtVar.d = null;
        alvtVar.b &= -2;
        aihhVar.copyOnWrite();
        alvt alvtVar2 = (alvt) aihhVar.instance;
        alvtVar2.k = null;
        alvtVar2.b &= -65;
        return new wji((alvt) aihhVar.build(), wjiVar.b, wjbVar);
    }

    public static wjf I(wjf wjfVar, wjb wjbVar, wgs wgsVar, wgs wgsVar2, long j, long j2, boolean z, aauk aaukVar) {
        aihf aihfVarCreateBuilder;
        boolean z2;
        aihh aihhVar = (aihh) wjfVar.u().toBuilder();
        boolean zF = aaukVar.f();
        alvt alvtVar = (alvt) aihhVar.instance;
        if ((alvtVar.b & 16) != 0) {
            StreamingDataOuterClass$StreamingData defaultInstance = alvtVar.h;
            if (defaultInstance == null) {
                defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
            }
            aihfVarCreateBuilder = defaultInstance.toBuilder();
        } else {
            aihfVarCreateBuilder = (!zF || (wgsVar == null && wgsVar2 == null)) ? null : StreamingDataOuterClass$StreamingData.b.createBuilder();
        }
        if (aihfVarCreateBuilder != null) {
            long jMax = Math.max(0L, j2);
            aihfVarCreateBuilder.copyOnWrite();
            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance;
            aihw aihwVar = StreamingDataOuterClass$StreamingData.a;
            boolean z3 = true;
            streamingDataOuterClass$StreamingData.c |= 1;
            streamingDataOuterClass$StreamingData.d = jMax;
            if (!z) {
                aihfVarCreateBuilder.copyOnWrite();
                StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData2 = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance;
                streamingDataOuterClass$StreamingData2.c &= -3;
                streamingDataOuterClass$StreamingData2.h = StreamingDataOuterClass$StreamingData.getDefaultInstance().h;
                aihfVarCreateBuilder.copyOnWrite();
                StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData3 = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance;
                streamingDataOuterClass$StreamingData3.c &= -5;
                streamingDataOuterClass$StreamingData3.i = StreamingDataOuterClass$StreamingData.getDefaultInstance().i;
            }
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            if (wgsVar != null) {
                if (wgsVar.G()) {
                    sparseArray.put(wgsVar.e(), wgsVar.b);
                } else {
                    sparseArray2.put(wgsVar.e(), wgsVar.b);
                }
                z2 = true;
            } else {
                if (z) {
                    int size = ((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).f.size();
                    for (int i = 0; i < size; i++) {
                        alaw alawVarCo = aihfVarCreateBuilder.co(i);
                        if (alawVarCo.g.startsWith("video")) {
                            sparseArray.put(alawVarCo.e, alawVarCo);
                        }
                    }
                    int size2 = ((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        alaw alawVar = (alaw) ((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).e.get(i2);
                        sparseArray2.put(alawVar.e, alawVar);
                    }
                }
                z2 = false;
            }
            if (wgsVar2 != null) {
                sparseArray.put(wgsVar2.e(), wgsVar2.b);
            } else {
                if (z) {
                    int size3 = ((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).f.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        alaw alawVarCo2 = aihfVarCreateBuilder.co(i3);
                        if (alawVarCo2.g.startsWith("audio")) {
                            sparseArray.put(alawVarCo2.e, alawVarCo2);
                        }
                    }
                }
                z3 = z2;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).f = StreamingDataOuterClass$StreamingData.emptyProtobufList();
            List listS = S(sparseArray);
            aihfVarCreateBuilder.copyOnWrite();
            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData4 = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance;
            streamingDataOuterClass$StreamingData4.a();
            aifs.addAll(listS, streamingDataOuterClass$StreamingData4.f);
            aihfVarCreateBuilder.copyOnWrite();
            ((StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance).e = StreamingDataOuterClass$StreamingData.emptyProtobufList();
            List listS2 = S(sparseArray2);
            aihfVarCreateBuilder.copyOnWrite();
            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData5 = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.instance;
            streamingDataOuterClass$StreamingData5.b();
            aifs.addAll(listS2, streamingDataOuterClass$StreamingData5.e);
            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData6 = (StreamingDataOuterClass$StreamingData) aihfVarCreateBuilder.build();
            aihhVar.copyOnWrite();
            alvt alvtVar2 = (alvt) aihhVar.instance;
            streamingDataOuterClass$StreamingData6.getClass();
            alvtVar2.h = streamingDataOuterClass$StreamingData6;
            alvtVar2.b |= 16;
            if (z3) {
                wjbVar = wjb.b;
            }
        }
        return new wji((alvt) aihhVar.build(), j, wji.ai(wjbVar, (alvt) aihhVar.build(), j));
    }

    public static wjf J(wjf wjfVar, wjb wjbVar) {
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData;
        wji wjiVar = (wji) wjfVar;
        aihh aihhVar = (aihh) wjiVar.a.toBuilder();
        alvt alvtVar = (alvt) aihhVar.instance;
        if ((alvtVar.b & 16) != 0) {
            StreamingDataOuterClass$StreamingData defaultInstance = alvtVar.h;
            if (defaultInstance == null) {
                defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
            }
            aihf builder = defaultInstance.toBuilder();
            builder.copyOnWrite();
            ((StreamingDataOuterClass$StreamingData) builder.instance).f = StreamingDataOuterClass$StreamingData.emptyProtobufList();
            builder.copyOnWrite();
            ((StreamingDataOuterClass$StreamingData) builder.instance).e = StreamingDataOuterClass$StreamingData.emptyProtobufList();
            streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) builder.build();
        } else {
            streamingDataOuterClass$StreamingData = null;
        }
        if (streamingDataOuterClass$StreamingData != null) {
            aihhVar.copyOnWrite();
            alvt alvtVar2 = (alvt) aihhVar.instance;
            alvtVar2.h = streamingDataOuterClass$StreamingData;
            alvtVar2.b |= 16;
        } else {
            aihhVar.copyOnWrite();
            alvt alvtVar3 = (alvt) aihhVar.instance;
            alvtVar3.h = null;
            alvtVar3.b &= -17;
        }
        aihhVar.copyOnWrite();
        ((alvt) aihhVar.instance).m = alvt.emptyProtobufList();
        return new wji((alvt) aihhVar.build(), wjiVar.b, wjbVar);
    }

    private static List S(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((alaw) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    public static boolean a(Context context) {
        return avg.c(context, jkx.b()) == 0;
    }

    public static aimm d(boolean z) {
        aihf aihfVarCreateBuilder = aimm.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aimm aimmVar = (aimm) aihfVarCreateBuilder.instance;
        aimmVar.b |= 1;
        aimmVar.c = z;
        return (aimm) aihfVarCreateBuilder.build();
    }

    public static /* synthetic */ boolean r(String str, apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anzo.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return str.equals(hna.k(objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final abrk A(String str, long j) {
        ahbw ahbwVar = (ahbw) this.b.io();
        ahbwVar.getClass();
        wjb wjbVar = (wjb) this.c.io();
        wjbVar.getClass();
        Set set = (Set) this.a.io();
        set.getClass();
        return new abrk(ahbwVar, wjbVar, set, str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Set] */
    public final void B(abnl abnlVar, abng abngVar) {
        wjf wjfVar = abngVar.a;
        alop alopVar = ((wji) wjfVar).a.d;
        if (alopVar == null) {
            alopVar = alop.a;
        }
        long epochMilli = abngVar.b.plusSeconds(alopVar.e).toEpochMilli();
        if (Instant.now().isAfter(Instant.ofEpochMilli(epochMilli))) {
            return;
        }
        abmw abmwVar = abmw.MEDIASESSION;
        wjfVar.G();
        ((abpk) this.a).put(((abrg) this.b).c(abnlVar, -1, null, this.c, null, null).Y(), new Pair(wjfVar, Long.valueOf(epochMilli)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    public final void C(Object obj) {
        int i = tqr.a;
        this.b.k(1073814324);
        ((tbt) this.a).c(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    public final void D(Object obj) {
        int i = tqr.a;
        this.b.k(1073814324);
        ((tbt) this.a).e(obj);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final Optional E(long j) {
        ?? r4 = this.b;
        Optional optionalEmpty = Optional.empty();
        for (abev abevVar : r4) {
            if (abevVar.b() <= j && abevVar.a() > j) {
                aliz alizVarC = abevVar.c();
                if (alizVarC == null) {
                    throw new NullPointerException("Null icon");
                }
                CharSequence charSequenceD = abevVar.d();
                if (charSequenceD != null) {
                    return Optional.of(new abeu(charSequenceD, alizVarC));
                }
                throw new NullPointerException("Null label");
            }
        }
        return optionalEmpty;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final fg F(abfz abfzVar, abhf abhfVar) {
        ((abvk) this.a.io()).getClass();
        acdo acdoVar = (acdo) this.c.io();
        acdoVar.getClass();
        tce tceVar = (tce) this.b.io();
        tceVar.getClass();
        abfzVar.getClass();
        abhfVar.getClass();
        return new fg(acdoVar, tceVar, abfzVar);
    }

    public final atr K() {
        atr atrVar = new atr((Context) this.c, null);
        atrVar.E = "OfflineNotifications";
        return atrVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final Set L() {
        ?? r1 = this.b;
        synchronized (r1) {
        }
        return r1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void M() {
        ?? r0 = this.b;
        synchronized (r0) {
            for (Pair pair : L()) {
                ((NotificationManager) this.a).cancel((String) pair.first, ((Integer) pair.second).intValue());
            }
            r0.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void N(String str, int i, Notification notification) {
        ?? r0 = this.b;
        synchronized (r0) {
            r0.add(new Pair(typ.c(str), Integer.valueOf(i)));
        }
        ((NotificationManager) this.a).notify(str, i, notification);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, wco] */
    public final void O(aihf aihfVar) {
        if (((vxz) this.c).l(69, 45416680L, false)) {
            ardd arddVar = (ardd) this.b.b(this.a.e()).g(wfs.g(461, ((aogy) aihfVar.instance).d)).g(ardd.class).E();
            aofb offlineModeType = arddVar == null ? aofb.OFFLINE_TYPE_UNKNOWN : arddVar.getOfflineModeType();
            aihfVar.copyOnWrite();
            aogy aogyVar = (aogy) aihfVar.instance;
            aogyVar.r = offlineModeType.i;
            aogyVar.b |= 65536;
        }
    }

    public final boolean P() {
        return ((vxz) this.b).l(15, 45365980L, false);
    }

    public final boolean Q() {
        return ((vxz) this.b).l(30, 45375478L, false);
    }

    public final boolean R() {
        aoej aoejVar = ((vxu) this.c).c().l;
        if (aoejVar == null) {
            aoejVar = aoej.a;
        }
        return aoejVar.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void b(almd almdVar) {
        ?? r0 = this.c;
        if (!r0.isEmpty()) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                ((abxv) this.a).L((String) it.next());
            }
            r0.clear();
            ((aefv) this.b).i();
        }
        alma almaVar = almdVar.h;
        if (almaVar == null) {
            almaVar = alma.a;
        }
        if (almaVar.b == 152873793) {
            alma almaVar2 = almdVar.h;
            if (almaVar2 == null) {
                almaVar2 = alma.a;
            }
            aqof aqofVar = almaVar2.b == 152873793 ? (aqof) almaVar2.c : aqof.a;
            String strO = kro.O(aqofVar);
            if (ahno.aa(strO)) {
                return;
            }
            r0.add(strO);
            Object obj = this.a;
            hsb hsbVar = new hsb(this, 3);
            boolean z = false;
            if (!strO.equals("music-library-playlists-shelf") && !strO.equals("music-identity-on-listen-again-shelf")) {
                z = true;
            }
            ((abxv) obj).K(aqofVar, hsbVar, z);
        }
    }

    public final void c(abnk abnkVar) {
        aigj aigjVar = (aigj) awrc.f(((jij) this.c).j());
        if (aigjVar != null) {
            abnkVar.d(aigjVar);
        }
    }

    public final avlh e() {
        return ((avlh) this.c).p().P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tbj] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f() {
        ((abjp) this.b.io()).b.hK(this.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final void g(abkh abkhVar) {
        agrx agrxVar = agso.a;
        i(true);
        abjl abjlVarG = ((abjp) this.b.io()).g();
        if (abjlVarG instanceof xxx) {
            xxx xxxVar = (xxx) abjlVarG;
            if (xxxVar.H()) {
                ((agrc) ((agrc) xxx.a.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "onEditFailed", 742, "MdxPlaybackQueue.java")).w("onEditFailed | editType: %s", abkhVar);
                if (abkhVar == abkh.b || abkhVar == abkh.c) {
                    xxxVar.D();
                }
            }
        }
    }

    public final void h() {
        agrx agrxVar = agso.a;
        i(true);
    }

    @tcc
    public void handlePermissionChangedEvent(gsi gsiVar) {
        if (gsiVar.a.equals(jkx.b())) {
            int iOrdinal = gsiVar.b.ordinal();
            if (iOrdinal == 1) {
                ((hlp) this.c).h(true);
            } else if (iOrdinal == 2) {
                ((hlp) this.c).h(false);
            }
        }
    }

    public final void i(boolean z) {
        ((awku) this.c).kk(Boolean.valueOf(z));
    }

    public final boolean j() {
        Boolean bool = (Boolean) ((awku) this.c).aD();
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final void k() {
        agrx agrxVar = agso.a;
        abjl abjlVarG = ((abjp) this.b.io()).g();
        if (abjlVarG instanceof xxx) {
            xxx xxxVar = (xxx) abjlVarG;
            if (xxxVar.H() && xxxVar.d) {
                ((agrc) ((agrc) xxx.a.c().i(agso.a, "MDX.PlaybackQueue")).k("com/google/android/libraries/youtube/mdx/player/queue/MdxPlaybackQueue", "onEditSucceeded", 756, "MdxPlaybackQueue.java")).t("onEditSucceeded | Edit succeeded during sync, scheduling pending resync.");
                xxxVar.f = true;
            }
        }
    }

    public final void l() {
        ((LoadingFrameLayout) this.c).h(1);
    }

    public final void m() {
        ((LoadingFrameLayout) this.c).h(3);
    }

    public final void n(ajwo ajwoVar, Throwable th) {
        boolean z = false;
        if (ajwoVar != null && kro.ak(ajwoVar) && kro.al(ajwoVar)) {
            z = true;
        }
        o(z, th);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, ttm] */
    public final void o(boolean z, Throwable th) {
        boolean zC = ixt.c(th);
        Object obj = this.c;
        if (zC) {
            ((LoadingFrameLayout) obj).f(this.b.b(th), true, z, false);
            return;
        }
        Context context = (Context) this.a;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) obj;
        loadingFrameLayout.g(context.getString(R.string.update_app), context.getString(R.string.auth_error_title), R.drawable.quantum_ic_error_outline_vd_theme_24, false, true, false, Boolean.TRUE);
        ivp ivpVar = new ivp(this, 7);
        ixx ixxVar = loadingFrameLayout.c;
        ixxVar.e = ivpVar;
        View view = ixxVar.b;
        if (view != null) {
            view.setOnClickListener(ivpVar);
        }
    }

    public final void p() {
        ((LoadingFrameLayout) this.c).h(2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final iwx q(adxd adxdVar, anlm anlmVar) {
        tbt tbtVar = (tbt) this.c.io();
        tbtVar.getClass();
        ((advb) this.b.io()).getClass();
        ((jnj) this.a.io()).getClass();
        anlmVar.getClass();
        return new iwx(adxdVar, tbtVar, anlmVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final isi s(LoadingFrameLayout loadingFrameLayout) {
        vxe vxeVar = (vxe) this.a.io();
        vxeVar.getClass();
        Context context = (Context) this.c.io();
        context.getClass();
        ttm ttmVar = (ttm) this.b.io();
        ttmVar.getClass();
        loadingFrameLayout.getClass();
        return new isi(vxeVar, context, ttmVar, loadingFrameLayout);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pds] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, pun] */
    public final Object t(plx plxVar, long j, List list, aidy aidyVar, aieu aieuVar, awoq awoqVar) throws Throwable {
        pej pejVar;
        ahub ahubVar;
        aieu aieuVar2;
        plx plxVar2;
        ahub ahubVar2;
        List list2;
        ahub ahubVar3;
        aidy aidyVar2;
        long j2;
        ahub ahubVar4;
        long j3;
        aieu aieuVar3;
        ahub ahubVar5;
        aidy aidyVar3;
        List list3;
        aiaw aiawVar;
        aiie aiieVar;
        if (awoqVar instanceof pej) {
            pejVar = (pej) awoqVar;
            int i = pejVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                pejVar.g = i - Integer.MIN_VALUE;
            } else {
                pejVar = new pej(this, awoqVar);
            }
        } else {
            pejVar = new pej(this, awoqVar);
        }
        Object objC = pejVar.f;
        awox awoxVar = awox.a;
        int i2 = pejVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = pejVar.e;
                ahubVar2 = pejVar.k;
                ahubVar = pejVar.j;
                ahub ahubVar6 = pejVar.i;
                aieu aieuVar4 = (aieu) pejVar.d;
                aidyVar2 = (aidy) pejVar.c;
                list2 = (List) pejVar.b;
                plxVar2 = (plx) pejVar.a;
                atqp.j(objC);
                ahubVar3 = ahubVar6;
                aieuVar2 = aieuVar4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = pejVar.e;
                ahubVar4 = pejVar.j;
                ahubVar = pejVar.i;
                ahubVar5 = (ahub) pejVar.d;
                aieuVar3 = (aieu) pejVar.c;
                aidyVar3 = (aidy) pejVar.b;
                list3 = (List) pejVar.a;
                atqp.j(objC);
            }
            aibw aibwVar = (aibw) objC;
            aibwVar.getClass();
            aihf aihfVar = (aihf) ahubVar4.a;
            aihfVar.copyOnWrite();
            aiaw aiawVar2 = (aiaw) aihfVar.instance;
            aiaw aiawVar3 = aiaw.a;
            aiawVar2.g = aibwVar;
            aiawVar2.b |= 32;
            aidyVar3.getClass();
            aihf aihfVar2 = (aihf) ahubVar.a;
            aihfVar2.copyOnWrite();
            aiaw aiawVar4 = (aiaw) aihfVar2.instance;
            aiawVar4.h = aidyVar3.q;
            aiawVar4.b |= 64;
            aihfVar2.copyOnWrite();
            aiaw aiawVar5 = (aiaw) aihfVar2.instance;
            aiawVar5.f = 1;
            aiawVar5.b |= 16;
            aihfVar2.copyOnWrite();
            aiaw aiawVar6 = (aiaw) aihfVar2.instance;
            aiawVar6.b |= 4;
            aiawVar6.e = j3;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(aiawVar6.i);
            listUnmodifiableList.getClass();
            new aikl(listUnmodifiableList);
            list3.getClass();
            aihfVar2.copyOnWrite();
            aiawVar = (aiaw) aihfVar2.instance;
            aiieVar = aiawVar.i;
            if (!aiieVar.c()) {
                aiawVar.i = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list3, aiawVar.i);
            aieuVar3.getClass();
            aihfVar2.copyOnWrite();
            aiaw aiawVar7 = (aiaw) aihfVar2.instance;
            aiawVar7.j = aieuVar3;
            aiawVar7.b |= SemanticState.Focused;
            aihn aihnVarBuild = ((aihf) ahubVar5.a).build();
            aihnVarBuild.getClass();
            return (aiaw) aihnVarBuild;
        }
        atqp.j(objC);
        aihf aihfVarCreateBuilder = aiaw.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        ahubVar = new ahub(aihfVarCreateBuilder);
        String str = ((pls) this.c).a;
        str.getClass();
        aihf aihfVar3 = (aihf) ahubVar.a;
        aihfVar3.copyOnWrite();
        aiaw aiawVar8 = (aiaw) aihfVar3.instance;
        aiawVar8.b |= 1;
        aiawVar8.c = str;
        ?? r2 = this.b;
        pejVar.a = plxVar;
        pejVar.b = list;
        pejVar.c = aidyVar;
        aieuVar2 = aieuVar;
        pejVar.d = aieuVar2;
        pejVar.i = ahubVar;
        pejVar.j = ahubVar;
        pejVar.k = ahubVar;
        pejVar.e = j;
        pejVar.g = 1;
        objC = r2.c(plxVar, pejVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        plxVar2 = plxVar;
        ahubVar2 = ahubVar;
        list2 = list;
        ahubVar3 = ahubVar2;
        aidyVar2 = aidyVar;
        j2 = j;
        aibz aibzVar = (aibz) objC;
        aibzVar.getClass();
        aihf aihfVar4 = (aihf) ahubVar2.a;
        aihfVar4.copyOnWrite();
        aiaw aiawVar9 = (aiaw) aihfVar4.instance;
        aiaw aiawVar10 = aiaw.a;
        aiawVar9.d = aibzVar;
        aiawVar9.b |= 2;
        ?? r0 = this.a;
        pejVar.a = list2;
        pejVar.b = aidyVar2;
        pejVar.c = aieuVar2;
        pejVar.d = ahubVar3;
        pejVar.i = ahubVar;
        pejVar.j = ahubVar;
        pejVar.k = null;
        pejVar.e = j2;
        pejVar.g = 2;
        objC = r0.a(plxVar2.b, pejVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        ahubVar4 = ahubVar;
        j3 = j2;
        aieuVar3 = aieuVar2;
        ahubVar5 = ahubVar3;
        aidyVar3 = aidyVar2;
        list3 = list2;
        aibw aibwVar2 = (aibw) objC;
        aibwVar2.getClass();
        aihf aihfVar5 = (aihf) ahubVar4.a;
        aihfVar5.copyOnWrite();
        aiaw aiawVar11 = (aiaw) aihfVar5.instance;
        aiaw aiawVar12 = aiaw.a;
        aiawVar11.g = aibwVar2;
        aiawVar11.b |= 32;
        aidyVar3.getClass();
        aihf aihfVar6 = (aihf) ahubVar.a;
        aihfVar6.copyOnWrite();
        aiaw aiawVar13 = (aiaw) aihfVar6.instance;
        aiawVar13.h = aidyVar3.q;
        aiawVar13.b |= 64;
        aihfVar6.copyOnWrite();
        aiaw aiawVar14 = (aiaw) aihfVar6.instance;
        aiawVar14.f = 1;
        aiawVar14.b |= 16;
        aihfVar6.copyOnWrite();
        aiaw aiawVar15 = (aiaw) aihfVar6.instance;
        aiawVar15.b |= 4;
        aiawVar15.e = j3;
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(aiawVar15.i);
        listUnmodifiableList2.getClass();
        new aikl(listUnmodifiableList2);
        list3.getClass();
        aihfVar6.copyOnWrite();
        aiawVar = (aiaw) aihfVar6.instance;
        aiieVar = aiawVar.i;
        if (!aiieVar.c()) {
            aiawVar.i = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list3, aiawVar.i);
        aieuVar3.getClass();
        aihfVar6.copyOnWrite();
        aiaw aiawVar16 = (aiaw) aihfVar6.instance;
        aiawVar16.j = aieuVar3;
        aiawVar16.b |= SemanticState.Focused;
        aihn aihnVarBuild2 = ((aihf) ahubVar5.a).build();
        aihnVarBuild2.getClass();
        return (aiaw) aihnVarBuild2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:28:0x0100  */
    /* JADX WARN: Code duplicated, block: B:31:0x010c  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, pun] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, pds] */
    public final Object u(plx plxVar, long j, aidy aidyVar, aieu aieuVar, awoq awoqVar) throws Throwable {
        pei peiVar;
        ahub ahubVarQ;
        aieu aieuVar2;
        ahub ahubVar;
        Object obj;
        List list;
        ahub ahubVar2;
        aibz aibzVar;
        ahub ahubVar3;
        ahub ahubVar4;
        ahub ahubVar5;
        long j2;
        plx plxVar2;
        aidy aidyVar2;
        List list2;
        long j3;
        ahub ahubVar6;
        ahub ahubVar7;
        ahub ahubVar8;
        List list3;
        aieu aieuVar3;
        if (awoqVar instanceof pei) {
            peiVar = (pei) awoqVar;
            int i = peiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                peiVar.f = i - Integer.MIN_VALUE;
            } else {
                peiVar = new pei(this, awoqVar);
            }
        } else {
            peiVar = new pei(this, awoqVar);
        }
        Object objA = peiVar.e;
        awox awoxVar = awox.a;
        int i2 = peiVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = peiVar.d;
                ahubVar5 = peiVar.j;
                ahubVar4 = peiVar.i;
                ahubVar3 = peiVar.h;
                list2 = (List) peiVar.k;
                aieuVar2 = (aieu) peiVar.c;
                aidyVar2 = (aidy) peiVar.b;
                plxVar2 = (plx) peiVar.a;
                atqp.j(objA);
                aibzVar = (aibz) objA;
                ahubVar5.C(aibzVar);
                ahubVar4.y(aidyVar2);
                ?? r9 = this.a;
                peiVar.a = aieuVar2;
                peiVar.b = list2;
                peiVar.c = ahubVar3;
                peiVar.k = ahubVar4;
                peiVar.h = ahubVar4;
                peiVar.i = null;
                peiVar.j = null;
                peiVar.d = j2;
                peiVar.f = 3;
                objA = r9.a(plxVar2.b, peiVar);
                if (objA != awoxVar) {
                    return awoxVar;
                }
                j3 = j2;
                ahubVar6 = ahubVar4;
                ahubVar7 = ahubVar6;
                ahubVar8 = ahubVar3;
                list3 = list2;
                aieuVar3 = aieuVar2;
            } else if (i2 == 2) {
                j = peiVar.d;
                ahub ahubVar9 = peiVar.j;
                ahub ahubVar10 = peiVar.i;
                ahub ahubVar11 = peiVar.h;
                List list4 = (List) peiVar.k;
                aieuVar2 = (aieu) peiVar.c;
                aidy aidyVar3 = (aidy) peiVar.b;
                plx plxVar3 = (plx) peiVar.a;
                atqp.j(objA);
                ahubVarQ = ahubVar9;
                plxVar = plxVar3;
                list = list4;
                ahubVar2 = ahubVar11;
                ahubVar = ahubVar10;
                aidyVar = aidyVar3;
                obj = objA;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = peiVar.d;
                ahubVar6 = peiVar.h;
                ahubVar7 = peiVar.k;
                ahubVar8 = (ahub) peiVar.c;
                list3 = (List) peiVar.b;
                aieuVar3 = (aieu) peiVar.a;
                atqp.j(objA);
            }
            ahubVar6.A((aibw) objA);
            ahubVar7.B(aieuVar3);
            if (list3 != null) {
                ahubVar7.E();
                ahubVar7.D(list3);
            }
            if (j3 > 0) {
                ahubVar7.z(j3);
            }
            return ahubVar8.w();
        }
        atqp.j(objA);
        ahubVarQ = aewp.Q(aiau.b.createBuilder());
        String str = ((pls) this.c).a;
        str.getClass();
        ahubVarQ.x(str);
        ?? r2 = this.b;
        peiVar.a = plxVar;
        peiVar.b = aidyVar;
        peiVar.c = aieuVar;
        peiVar.k = null;
        peiVar.h = ahubVarQ;
        peiVar.i = ahubVarQ;
        peiVar.j = ahubVarQ;
        peiVar.d = j;
        peiVar.f = 2;
        Object objC = r2.c(plxVar, peiVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        aieuVar2 = aieuVar;
        ahubVar = ahubVarQ;
        obj = objC;
        list = null;
        ahubVar2 = ahubVar;
        List list5 = list;
        plxVar2 = plxVar;
        j2 = j;
        ahubVar5 = ahubVarQ;
        aibzVar = (aibz) obj;
        aidyVar2 = aidyVar;
        ahubVar4 = ahubVar;
        ahubVar3 = ahubVar2;
        list2 = list5;
        ahubVar5.C(aibzVar);
        ahubVar4.y(aidyVar2);
        ?? r10 = this.a;
        peiVar.a = aieuVar2;
        peiVar.b = list2;
        peiVar.c = ahubVar3;
        peiVar.k = ahubVar4;
        peiVar.h = ahubVar4;
        peiVar.i = null;
        peiVar.j = null;
        peiVar.d = j2;
        peiVar.f = 3;
        objA = r10.a(plxVar2.b, peiVar);
        if (objA != awoxVar) {
            return awoxVar;
        }
        j3 = j2;
        ahubVar6 = ahubVar4;
        ahubVar7 = ahubVar6;
        ahubVar8 = ahubVar3;
        list3 = list2;
        aieuVar3 = aieuVar2;
        ahubVar6.A((aibw) objA);
        ahubVar7.B(aieuVar3);
        if (list3 != null) {
            ahubVar7.E();
            ahubVar7.D(list3);
        }
        if (j3 > 0) {
            ahubVar7.z(j3);
        }
        return ahubVar8.w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nsc] */
    public final avlb v(avlb avlbVar, CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, assc asscVar, aigw aigwVar) {
        int iA = aigwVar == null ? 0 : aigwVar.a();
        ?? r0 = this.b;
        nse nseVarA = r0.b() ? r0.a(iA) : null;
        return avlbVar.l(new mqh(this, commandOuterClass$Command, senderStateOuterClass$SenderState, asscVar, nseVarA, 0)).k(new gto(this, asscVar, nseVarA, 10)).j(new mgd((Object) this, (Object) asscVar, (Object) nseVarA, 8, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    public final void w(CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, assc asscVar, nse nseVar) {
        if (nseVar != null) {
            nseVar.b();
        }
        nsu nsuVar = (nsu) this.c.io();
        if (asscVar == null || nsuVar == null || !nsuVar.a()) {
            return;
        }
        aihf aihfVarCreateBuilder = assa.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        assa assaVar = (assa) aihfVarCreateBuilder.instance;
        commandOuterClass$Command.getClass();
        assaVar.d = commandOuterClass$Command;
        assaVar.b |= 2;
        if (senderStateOuterClass$SenderState == null) {
            senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.getDefaultInstance();
        }
        aihfVarCreateBuilder.copyOnWrite();
        assa assaVar2 = (assa) aihfVarCreateBuilder.instance;
        senderStateOuterClass$SenderState.getClass();
        assaVar2.e = senderStateOuterClass$SenderState;
        assaVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        assa assaVar3 = (assa) aihfVarCreateBuilder.instance;
        assaVar3.c = asscVar;
        assaVar3.b |= 1;
        assa assaVar4 = (assa) aihfVarCreateBuilder.build();
        DebuggerClient debuggerClient = (DebuggerClient) this.a.io();
        aihf aihfVarCreateBuilder2 = assh.a.createBuilder();
        aijp aijpVarB = npi.b();
        aihfVarCreateBuilder2.copyOnWrite();
        assh asshVar = (assh) aihfVarCreateBuilder2.instance;
        aijpVarB.getClass();
        asshVar.e = aijpVarB;
        asshVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        assh asshVar2 = (assh) aihfVarCreateBuilder2.instance;
        assaVar4.getClass();
        asshVar2.d = assaVar4;
        asshVar2.c = 4;
        debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder2.build()).toByteArray());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public final void x(assc asscVar, nse nseVar, Throwable th) {
        if (nseVar != null) {
            nseVar.a(th != null);
        }
        nsu nsuVar = (nsu) this.c.io();
        if (asscVar == null || nsuVar == null || !nsuVar.a()) {
            return;
        }
        aihf aihfVarCreateBuilder = asrz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asrz asrzVar = (asrz) aihfVarCreateBuilder.instance;
        asrzVar.c = asscVar;
        asrzVar.b |= 1;
        asrz asrzVar2 = (asrz) aihfVarCreateBuilder.build();
        DebuggerClient debuggerClient = (DebuggerClient) this.a.io();
        aihf aihfVarCreateBuilder2 = assh.a.createBuilder();
        aijp aijpVarB = npi.b();
        aihfVarCreateBuilder2.copyOnWrite();
        assh asshVar = (assh) aihfVarCreateBuilder2.instance;
        aijpVarB.getClass();
        asshVar.e = aijpVarB;
        asshVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        assh asshVar2 = (assh) aihfVarCreateBuilder2.instance;
        asrzVar2.getClass();
        asshVar2.d = asrzVar2;
        asshVar2.c = 5;
        debuggerClient.sendTimelineEvent(((assh) aihfVarCreateBuilder2.build()).toByteArray());
    }

    public final hee y(awmd awmdVar, agev agevVar) {
        if (((Boolean) ((agfa) agevVar).a).booleanValue()) {
            return new hee(awmdVar, null);
        }
        return (hee) ((nwn) this.c).a(new mnn(awmdVar, 0));
    }

    public final void z(alvl alvlVar, sxu sxuVar, String str) {
        aoqt aoqtVar;
        int iAU;
        abnr abnrVarE = ((abnc) this.b).e();
        Object obj = this.c;
        if (alvlVar == null) {
            absh.a(sxuVar, ((absg) obj).i(str));
            return;
        }
        alvk alvkVar = alvlVar.h;
        if (alvkVar == null) {
            alvkVar = alvk.a;
        }
        if (alvkVar.b == 1024) {
            alvk alvkVar2 = alvlVar.h;
            if (alvkVar2 == null) {
                alvkVar2 = alvk.a;
            }
            aoqtVar = alvkVar2.b == 1024 ? (aoqt) alvkVar2.c : aoqt.a;
        } else {
            aoqtVar = null;
        }
        if (aoqtVar != null && ((iAU = a.aU(aoqtVar.e)) == 0 || iAU != 2)) {
            ((absg) obj).m(alvlVar, new absm(alvlVar), aoqtVar, sxuVar, str);
            return;
        }
        if (!aaje.q(alvlVar) && !aaje.p(alvlVar)) {
            if (!aaje.s(alvlVar)) {
                absh.a(sxuVar, absg.h(alvlVar, str));
                return;
            }
            absg absgVar = (absg) obj;
            absi absiVarJ = absgVar.j();
            if (absiVarJ != null) {
                absiVarJ.b();
            }
            absgVar.d(alvlVar, sxuVar, str);
            return;
        }
        if (!aaje.o(alvlVar) && abnrVarE == abnr.BACKGROUND) {
            absh.a(sxuVar, new aboe(13, false, 3, ((absg) obj).b.getString(R.string.audio_unavailable), null, null, null, null));
            return;
        }
        if (((abmt) this.a).g.l(261, 45720185L, false)) {
            alvi alviVar = alvlVar.k;
            if (alviVar == null) {
                alviVar = alvi.a;
            }
            int iAS = a.aS((alviVar.b == 151635310 ? (aong) alviVar.c : aong.a).b);
            if ((iAS == 0 || iAS == 1) && abnrVarE == abnr.PICTURE_IN_PICTURE) {
                absh.a(sxuVar, new aboe(14, true, 1, ((absg) obj).b.getString(R.string.audio_unavailable), null, str, null, null));
                return;
            }
        }
        sxuVar.b(null, absh.a);
        ((absg) obj).n();
    }

    public isi(ci ciVar, zjr zjrVar, ahey aheyVar) {
        this.b = ciVar;
        this.a = zjrVar;
        this.c = aheyVar;
    }

    public isi(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public isi(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public isi(ong ongVar, oii oiiVar, onc oncVar) {
        this.a = ongVar;
        this.c = oiiVar;
        this.b = oncVar;
    }

    public isi(vxu vxuVar, vyo vyoVar, vxz vxzVar) {
        this.c = vxuVar;
        this.a = vyoVar;
        this.b = vxzVar;
    }

    public isi(abwy abwyVar, abwy abwyVar2, abwy abwyVar3, abwy abwyVar4) {
        abwyVar.getClass();
        abwyVar2.getClass();
        abwyVar3.getClass();
        abwyVar4.getClass();
        this.b = abwyVar;
        this.a = abwyVar2;
        this.c = abwyVar3;
    }

    public isi(Context context) {
        this.c = context;
        this.a = (NotificationManager) context.getSystemService("notification");
        this.b = new HashSet();
        try {
            tym.aC(context, "OfflineNotifications", context.getString(R.string.offline_notification_channel), 2, false, true);
        } catch (Resources.NotFoundException unused) {
        }
    }

    public isi(awmd awmdVar) {
        this.c = new awku(Boolean.FALSE);
        this.b = awmdVar;
        this.a = new iey(this, 0);
    }

    public isi(pls plsVar, pds pdsVar, pun punVar, byte[] bArr) {
        plsVar.getClass();
        pdsVar.getClass();
        punVar.getClass();
        this.c = plsVar;
        this.a = pdsVar;
        this.b = punVar;
    }

    public isi(zrz zrzVar) {
        gzp gzpVar = zrzVar.c;
        gzpVar.getClass();
        this.a = gzpVar;
        zrv zrvVar = zrzVar.a;
        zrvVar.getClass();
        this.b = zrvVar;
        this.c = zrzVar.b;
    }

    public isi(abwk abwkVar, ytv ytvVar, vyo vyoVar) {
        abwkVar.getClass();
        ytvVar.getClass();
        vyoVar.getClass();
        this.a = abwkVar;
        this.b = ytvVar;
        this.c = vyoVar;
    }

    public isi(pls plsVar, pds pdsVar, pun punVar) {
        plsVar.getClass();
        pdsVar.getClass();
        punVar.getClass();
        this.c = plsVar;
        this.a = pdsVar;
        this.b = punVar;
    }

    public isi(jij jijVar, icx icxVar, hxd hxdVar) {
        jijVar.getClass();
        icxVar.getClass();
        hxdVar.getClass();
        this.c = jijVar;
        this.b = icxVar;
        this.a = hxdVar;
    }

    public isi(pls plsVar, pqg pqgVar, pun punVar) {
        plsVar.getClass();
        pqgVar.getClass();
        punVar.getClass();
        this.c = plsVar;
        this.a = pqgVar;
        this.b = punVar;
    }

    public isi(abxv abxvVar, aefv aefvVar) {
        this.a = abxvVar;
        this.b = aefvVar;
        this.c = new HashSet();
    }

    public isi(oml omlVar, awou awouVar) {
        awouVar.getClass();
        this.c = omlVar;
        this.a = awouVar;
        this.b = new axfi(false);
    }

    public isi(Context context, SharedPreferences sharedPreferences, hlp hlpVar, tbt tbtVar) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = hlpVar;
        tbtVar.f(this);
    }

    public isi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr, byte[] bArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public isi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public isi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public isi(hed hedVar, abnc abncVar) {
        this.a = hedVar;
        this.b = abncVar;
        this.c = new aavm(this);
    }

    public isi(byte[] bArr) {
        this.b = new ArrayList();
        this.a = new awkx();
        this.c = new awkx();
    }

    public isi(vxe vxeVar, Context context, ttm ttmVar, LoadingFrameLayout loadingFrameLayout) {
        this.c = loadingFrameLayout;
        this.a = context;
        this.b = ttmVar;
        loadingFrameLayout.d(new jck(vxeVar, 1));
    }

    public isi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.b = awmdVar3;
    }

    public isi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.b = awmdVar3;
    }

    public isi() {
        this.b = new nwn();
        this.c = new nwn();
        this.a = new nwn();
    }

    public isi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }
}
