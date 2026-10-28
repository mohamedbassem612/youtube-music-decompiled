package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hlk implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hlk(Object obj, Uri uri, Uri uri2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = uri;
        this.c = uri2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aaqn, java.lang.Object] */
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
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 19;
        int i2 = 6;
        int i3 = 17;
        int i4 = 5;
        int i5 = 12;
        int i6 = 13;
        int i7 = 3;
        byte[] bArr = null;
        int i8 = 1;
        int iIntValue = 0;
        switch (this.$cid) {
            case 0:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return ahng.n(Optional.empty());
                }
                Object obj2 = this.b;
                final boolean zContains = ((annv) optional.get()).f().contains(obj2);
                final boolean z = ((annv) optional.get()).h().contains(obj2) || zContains;
                Object obj3 = this.c;
                Object obj4 = this.a;
                hpt hptVarA = hpu.a();
                hptVarA.e(true);
                hptVarA.d(true);
                final jnj jnjVar = (jnj) obj4;
                final anfv anfvVar = (anfv) obj3;
                final String str = (String) obj2;
                return ahno.ar(((hpk) jnjVar.e).e(hptVarA.a()), new agek() { // from class: hln
                    @Override // defpackage.agek
                    public final Object apply(Object obj5) {
                        anfv anfvVarF;
                        agke agkeVar = (agke) obj5;
                        if (!zContains && agkeVar.contains(str)) {
                            return Optional.empty();
                        }
                        anfv anfvVar2 = anfvVar;
                        ajwo ajwoVarB = jnj.B(anfvVar2);
                        aoia aoiaVar = null;
                        if (ajwoVarB != null) {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
                            ajwoVarB.c(aihlVarCheckIsLite);
                            if (ajwoVarB.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohd.b);
                                ajwoVarB.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVarB.j.k(aihlVarCheckIsLite2.d);
                                aohd aohdVar = (aohd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                                if ((aohdVar.c & 8) != 0) {
                                    apji apjiVar = aohdVar.g;
                                    if (apjiVar == null) {
                                        apjiVar = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aoic.a);
                                    apjiVar.c(aihlVarCheckIsLite3);
                                    Object objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                                    aoiaVar = (aoia) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                                }
                            }
                        }
                        boolean z2 = z;
                        jnj jnjVar2 = jnjVar;
                        if (z2) {
                            anfvVarF = hfn.f((Context) jnjVar2.d, anfvVar2);
                        } else {
                            if (aoiaVar == null || !aoiaVar.c) {
                                return Optional.empty();
                            }
                            Object obj6 = jnjVar2.d;
                            aihf builder = anfvVar2.toBuilder();
                            yno.dY(builder, ackj.c(((Context) obj6).getResources().getString(R.string.action_add_to_offline_songs)));
                            anfv anfvVar3 = (anfv) builder.instance;
                            aihf builder2 = (anfvVar3.b == 66441155 ? (anga) anfvVar3.c : anga.a).toBuilder();
                            aihh aihhVar = (aihh) alja.a.createBuilder();
                            aliz alizVar = aliz.OFFLINE_DOWNLOAD;
                            aihhVar.copyOnWrite();
                            alja aljaVar = (alja) aihhVar.instance;
                            aljaVar.c = alizVar.yN;
                            aljaVar.b |= 1;
                            builder2.copyOnWrite();
                            anga angaVar = (anga) builder2.instance;
                            alja aljaVar2 = (alja) aihhVar.build();
                            aljaVar2.getClass();
                            angaVar.d = aljaVar2;
                            angaVar.b |= 8;
                            anga angaVar2 = (anga) builder2.build();
                            builder.copyOnWrite();
                            anfv anfvVar4 = (anfv) builder.instance;
                            angaVar2.getClass();
                            anfvVar4.c = angaVar2;
                            anfvVar4.b = 66441155;
                            ajwo ajwoVarDT = yno.dT((anfv) builder.build());
                            if (ajwoVarDT != null) {
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aohd.b);
                                ajwoVarDT.c(aihlVarCheckIsLite4);
                                if (ajwoVarDT.j.n(aihlVarCheckIsLite4.d)) {
                                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aohd.b);
                                    ajwoVarDT.c(aihlVarCheckIsLite5);
                                    Object objK3 = ajwoVarDT.j.k(aihlVarCheckIsLite5.d);
                                    aihf builder3 = ((aohd) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).toBuilder();
                                    builder3.copyOnWrite();
                                    aohd aohdVar2 = (aohd) builder3.instance;
                                    aohdVar2.f = 1;
                                    aohdVar2.c |= 2;
                                    aohd aohdVar3 = (aohd) builder3.build();
                                    aihh aihhVar2 = (aihh) ajwoVarDT.toBuilder();
                                    aihhVar2.e(aohd.b, aohdVar3);
                                    yno.dX(builder, (ajwo) aihhVar2.build());
                                }
                            }
                            anfvVarF = (anfv) builder.build();
                        }
                        return Optional.of(anfvVarF);
                    }
                }, jnjVar.f);
            case 1:
                List list = (List) obj;
                return tzk.b(((hfp) this.a).b.b(this.c).n((Collection) j$.util.Collection.EL.stream(this.b.keySet()).filter(new gnh(list == null ? new HashSet() : (Set) j$.util.Collection.EL.stream(list).filter(new gqk(i7)).map(new bwa(i6)).collect(Collectors.toCollection(new hcd(3))), 4)).map(new bwa(14)).collect(Collectors.toCollection(new hcd(3)))));
            case 2:
                return ((ikg) this.a).d(this.c, (Optional) obj, this.b);
            case 3:
                Optional optional2 = (Optional) obj;
                if (!optional2.isPresent()) {
                    return aher.a;
                }
                Object obj5 = this.a;
                Object obj6 = this.b;
                htp htpVar = (htp) this.c;
                hpb hpbVar = htpVar.g;
                ListenableFuture listenableFutureI = hpbVar.i((String) obj6, false);
                ListenableFuture listenableFutureH = hpbVar.h((weh) optional2.get());
                return ahno.aF(listenableFutureI, listenableFutureH).m(new egz(listenableFutureI, listenableFutureH, obj5, 13, (char[]) null), htpVar.h);
            case 4:
                return ahno.ar(((iao) this.c).f.Y((abnl) this.b, (htf) this.a), new iam(iIntValue), MoreExecutors.directExecutor());
            case 5:
                ian ianVar = (ian) obj;
                if (!ianVar.b) {
                    return ahng.n(ianVar.a);
                }
                Object obj7 = this.a;
                Object obj8 = this.b;
                Object obj9 = this.c;
                wgi wgiVar = ianVar.a;
                ahgb ahgbVar = ((iao) obj9).f;
                return ahgbVar.Z((abnl) obj8, iar.a(ahgbVar.ac((htf) obj7)), agke.q(obj7), wgiVar);
            case 6:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                Object obj10 = this.c;
                annv annvVar = (annv) optional3.get();
                agjz agjzVar = new agjz(4);
                String str2 = (String) obj10;
                int iHashCode = str2.hashCode();
                if (iHashCode != -1928212878) {
                    if (iHashCode != 2462802) {
                        if (iHashCode == 2462819 && str2.equals("PPSV")) {
                            agjzVar.j(annvVar.h());
                        }
                    } else if (str2.equals("PPSE")) {
                        agjzVar.j(annvVar.f());
                    }
                } else if (str2.equals("PPSDST")) {
                    agjzVar.j(annvVar.k());
                }
                return ahno.ar(((iev) this.a).b.b(agjzVar.g()), new iam(7), this.b);
            case 7:
                Optional optional4 = (Optional) obj;
                if (optional4.isPresent()) {
                    return ahng.n(optional4);
                }
                Object obj11 = this.b;
                ?? r2 = this.c;
                ilp ilpVar = (ilp) this.a;
                return tzk.e(((wco) ilpVar.g.io()).b(r2).g((String) obj11).v((avmb) ilpVar.k.io()));
            case 8:
                Integer num = (Integer) obj;
                int iIntValue2 = num != null ? num.intValue() : 0;
                ?? r3 = this.b;
                ContentValues[] contentValuesArr = new ContentValues[r3.size()];
                while (iIntValue < r3.size()) {
                    ContentValues contentValues = new ContentValues();
                    contentValuesArr[iIntValue] = contentValues;
                    contentValues.put("audio_id", (Long) r3.get(iIntValue));
                    iIntValue2++;
                    contentValuesArr[iIntValue].put("play_order", Integer.valueOf(iIntValue2));
                    iIntValue++;
                }
                return ((iuf) this.c).o.H(ixt.o((Uri) this.a), contentValuesArr);
            case 9:
                Integer num2 = (Integer) obj;
                int iIntValue3 = num2 != null ? num2.intValue() : 0;
                agke agkeVar = (agke) this.b;
                ContentValues[] contentValuesArr2 = new ContentValues[agkeVar.size()];
                while (iIntValue < agkeVar.size()) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValuesArr2[iIntValue] = contentValues2;
                    contentValues2.put("audio_id", (Long) agkeVar.get(iIntValue));
                    iIntValue3++;
                    contentValuesArr2[iIntValue].put("play_order", Integer.valueOf(iIntValue3));
                    iIntValue++;
                }
                return ((iuf) this.c).o.H(ixt.o((Uri) this.a), contentValuesArr2);
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj12 = this.c;
                Object obj13 = this.a;
                Object obj14 = this.b;
                Uri uri = (Uri) obj13;
                if (!iuf.O(uri)) {
                    iuf iufVar = (iuf) obj14;
                    aheo aheoVarG = iufVar.o.G(ixt.o((Uri) obj12), new String[]{"audio_id"}, "is_music=1 AND title IS NOT NULL", null, "play_order").g();
                    iub iubVar = new iub(obj14, obj13, 4, bArr);
                    Executor executor = iufVar.c;
                    ListenableFuture listenableFutureAs = ahno.as(aheoVarG, iubVar, executor);
                    return ahno.av(listenableFutureAs).k(new itv(obj14, listenableFutureAs, uri, 8), executor);
                }
                long jB = iuf.b((Uri) obj12);
                iuf iufVar2 = (iuf) obj14;
                ListenableFuture listenableFutureX = ((hfn) iufVar2.g.io()).X(jB);
                ist istVar = new ist(i4);
                Executor executor2 = iufVar2.c;
                ListenableFuture listenableFutureAs2 = ahno.as(ahno.ar(listenableFutureX, istVar, executor2), new gqb(obj14, obj13, i3, bArr), executor2);
                return ahno.av(listenableFutureAs2).k(new huo(listenableFutureAs2, i5), executor2);
            case 11:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj15 = this.b;
                Object obj16 = this.a;
                Object obj17 = this.c;
                Uri uri2 = (Uri) obj16;
                if (iuf.O(uri2)) {
                    return ((hfn) ((iuf) obj17).g.io()).ad(iuf.b(uri2), (String) obj15);
                }
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("name", (String) obj15);
                iuf iufVar3 = (iuf) obj17;
                contentValues3.put("date_modified", Long.valueOf(iufVar3.a()));
                return ahno.ar(iufVar3.o.J(uri2, contentValues3, null, null), new iua(iIntValue), iufVar3.c);
            case 12:
                Integer num3 = (Integer) obj;
                iIntValue = num3 != null ? num3.intValue() : 0;
                Object obj18 = this.c;
                Object obj19 = this.a;
                Object obj20 = this.b;
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("audio_id", ((Uri) obj19).getLastPathSegment());
                contentValues4.put("play_order", Integer.valueOf(iIntValue + 1));
                return ((iuf) obj20).o.I(ixt.o((Uri) obj18), contentValues4);
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj21 = this.c;
                Object obj22 = this.a;
                Object obj23 = this.b;
                Uri uri3 = (Uri) obj22;
                if (iuf.O(uri3)) {
                    iuf iufVar4 = (iuf) obj23;
                    ListenableFuture listenableFutureK = iufVar4.k((Uri) obj21);
                    gqb gqbVar = new gqb(obj23, obj22, 18, bArr);
                    Executor executor3 = iufVar4.c;
                    ListenableFuture listenableFutureAs3 = ahno.as(listenableFutureK, gqbVar, executor3);
                    return ahno.av(listenableFutureAs3).k(new huo(listenableFutureAs3, i6), executor3);
                }
                iuf iufVar5 = (iuf) obj23;
                ListenableFuture listenableFutureK2 = iufVar5.k((Uri) obj21);
                gqb gqbVar2 = new gqb(obj23, obj22, 15, bArr);
                Executor executor4 = iufVar5.c;
                ListenableFuture listenableFutureAs4 = ahno.as(listenableFutureK2, gqbVar2, executor4);
                return ahno.av(listenableFutureAs4).k(new itv(obj23, listenableFutureAs4, uri3, iIntValue), executor4);
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj24 = this.c;
                Object obj25 = this.a;
                Object obj26 = this.b;
                Uri uri4 = (Uri) obj25;
                if (iuf.O(uri4)) {
                    return ((hfn) ((iuf) obj26).g.io()).ab(iuf.b((Uri) obj24));
                }
                iuf iufVar6 = (iuf) obj26;
                ListenableFuture listenableFutureK3 = iufVar6.o.K(ixt.o(uri4), new String[]{((Uri) obj24).getLastPathSegment()});
                return ahno.av(listenableFutureK3).k(new itv(obj26, listenableFutureK3, uri4, 4), iufVar6.c);
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj27 = this.c;
                Object obj28 = this.a;
                Object obj29 = this.b;
                Uri uri5 = (Uri) obj28;
                if (iuf.O(uri5)) {
                    return ((hfn) ((iuf) obj29).g.io()).Q(iuf.b(uri5), iuf.b((Uri) obj27));
                }
                iuf iufVar7 = (iuf) obj29;
                ListenableFuture listenableFutureAs5 = ahno.as(iufVar7.t(uri5), new hlk(obj29, (Uri) obj27, uri5, i5), iufVar7.d);
                return ahno.av(listenableFutureAs5).k(new itv(obj29, listenableFutureAs5, uri5, i7), iufVar7.c);
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj30 = this.b;
                Object obj31 = this.a;
                Object obj32 = this.c;
                Uri uri6 = (Uri) obj31;
                if (iuo.P(uri6)) {
                    return ((iuo) obj32).k.ad(iuo.j(uri6), (String) obj30);
                }
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put("name", (String) obj30);
                contentValues5.put("date_modified", Long.valueOf(iuo.b()));
                iuo iuoVar = (iuo) obj32;
                return ahno.ar(ahno.aq(new gmf(iuoVar, uri6, contentValues5, i4), iuoVar.d), new iua(i6), iuoVar.c);
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj33 = this.c;
                Object obj34 = this.a;
                Object obj35 = this.b;
                if (!iuo.P((Uri) obj34)) {
                    iuo iuoVar2 = (iuo) obj35;
                    itc itcVar = new itc(iuoVar2, obj33, i3);
                    Executor executor5 = iuoVar2.d;
                    ListenableFuture listenableFutureAp = ahno.ap(itcVar, executor5);
                    ListenableFuture listenableFutureK4 = ahno.ax(listenableFutureAp).k(new ium(obj35, listenableFutureAp, obj34, i8), executor5);
                    return ahno.av(listenableFutureK4).k(new ium(obj35, listenableFutureK4, obj34, iIntValue), iuoVar2.c);
                }
                long j = iuo.j((Uri) obj33);
                iuo iuoVar3 = (iuo) obj35;
                ListenableFuture listenableFutureX2 = iuoVar3.k.X(j);
                iua iuaVar = new iua(i5);
                Executor executor6 = iuoVar3.c;
                ListenableFuture listenableFutureAs6 = ahno.as(ahno.ar(listenableFutureX2, iuaVar, executor6), new iub(obj35, obj34, i2, bArr), executor6);
                return ahno.av(listenableFutureAs6).k(new huo(listenableFutureAs6, i), executor6);
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj36 = this.c;
                Object obj37 = this.a;
                Object obj38 = this.b;
                Uri uri7 = (Uri) obj37;
                if (iuo.P(uri7)) {
                    return ((iuo) obj38).k.Q(iuo.j(uri7), iuo.j((Uri) obj36));
                }
                iuo iuoVar4 = (iuo) obj38;
                ListenableFuture listenableFutureAq = ahno.aq(new gmf(iuoVar4, uri7, (Uri) obj36, i2), iuoVar4.d);
                return ahno.av(listenableFutureAq).k(new itv(obj38, listenableFutureAq, uri7, 16), iuoVar4.c);
            case 19:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj39 = this.c;
                Object obj40 = this.a;
                Object obj41 = this.b;
                Uri uri8 = (Uri) obj40;
                if (iuo.P(uri8)) {
                    return ((iuo) obj41).k.ab(iuo.j((Uri) obj39));
                }
                iuo iuoVar5 = (iuo) obj41;
                return ahno.ar(ahno.ap(new itv(iuoVar5, uri8, (Uri) obj39, i), iuoVar5.d), new idw(obj41, obj40, 20, bArr), iuoVar5.c);
            default:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj42 = this.c;
                Object obj43 = this.a;
                Object obj44 = this.b;
                Uri uri9 = (Uri) obj43;
                if (iuo.P(uri9)) {
                    iuo iuoVar6 = (iuo) obj44;
                    ListenableFuture listenableFutureT = iuoVar6.t((Uri) obj42);
                    iub iubVar2 = new iub(obj44, obj43, 11, bArr);
                    Executor executor7 = iuoVar6.c;
                    ListenableFuture listenableFutureAs7 = ahno.as(listenableFutureT, iubVar2, executor7);
                    return ahno.av(listenableFutureAs7).k(new iug(listenableFutureAs7, 8), executor7);
                }
                iuo iuoVar7 = (iuo) obj44;
                ListenableFuture listenableFutureT2 = iuoVar7.t((Uri) obj42);
                idw idwVar = new idw(obj44, obj43, 18, bArr);
                Executor executor8 = iuoVar7.c;
                ListenableFuture listenableFutureAr = ahno.ar(listenableFutureT2, idwVar, executor8);
                return ahno.av(listenableFutureAr).k(new itv(obj44, listenableFutureAr, uri9, 14), executor8);
        }
    }

    public /* synthetic */ hlk(Object obj, Uri uri, String str, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = uri;
        this.b = str;
    }

    public /* synthetic */ hlk(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hlk(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ hlk(jnj jnjVar, String str, anfv anfvVar, int i) {
        this.$cid = i;
        this.a = jnjVar;
        this.b = str;
        this.c = anfvVar;
    }
}
