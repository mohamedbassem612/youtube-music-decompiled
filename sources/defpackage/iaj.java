package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iaj implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iaj(aesp aespVar, ooi ooiVar, ahev ahevVar, Uri uri, int i) {
        this.$cid = i;
        this.c = aespVar;
        this.b = ooiVar;
        this.d = ahevVar;
        this.a = uri;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x06e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v1, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v67, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v47, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, omb] */
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
    public final ListenableFuture a(Object obj) throws oig {
        ajwo ajwoVarP;
        Object obj2;
        int i;
        ListenableFuture listenableFutureM;
        int i2;
        int i3 = 4;
        Uri uriBR = null;
        int i4 = 1;
        switch (this.$cid) {
            case 0:
                ian ianVar = (ian) obj;
                if (ianVar.b) {
                    return ((iao) this.a).f.Z((abnl) this.b, (iar) this.c, this.d, ianVar.a);
                }
                return ahng.n(ianVar.a);
            case 1:
                return ahno.ar(((iao) this.a).f.Z((abnl) this.b, (iar) this.c, this.d, null), new iam(1), MoreExecutors.directExecutor());
            case 2:
                Object obj3 = this.a;
                itu ituVar = (itu) obj3;
                ituVar.e.l(true);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj4 = this.b;
                if (zBooleanValue) {
                    ?? r3 = this.d;
                    if (r3.size() != 1) {
                        ajwoVarP = fhz.P(ituVar.b.getString(R.string.edit_playlist_done));
                    } else {
                        int i5 = ((apyx) r3.get(0)).b;
                        if (i5 == 1) {
                            ajwoVarP = ituVar.b(ituVar.b.getString(R.string.sideloaded_saved_to_playlist), (String) obj4);
                        } else if (i5 == 2) {
                            ajwoVarP = fhz.P(ituVar.b.getString(R.string.sideloaded_removed_from_playlist));
                        } else {
                            ajwoVarP = fhz.P(ituVar.b.getString(R.string.edit_playlist_done));
                        }
                    }
                } else {
                    ajwoVarP = fhz.P(ituVar.b.getString(R.string.sideloaded_playlist_edit_error));
                }
                ?? r1 = this.c;
                iup iupVar = ituVar.c;
                agke agkeVarQ = agke.q(ajwoVarP);
                ListenableFuture listenableFutureW = iupVar.w(Uri.parse((String) obj4));
                itg itgVar = new itg(obj3, 6);
                Executor executor = ituVar.d;
                ListenableFuture listenableFutureAr = ahno.ar(listenableFutureW, itgVar, executor);
                return ahno.av(listenableFutureAr).k(new itv(listenableFutureAr, agkeVarQ, (sxu) r1, 1), executor);
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj5 = this.b;
                Object obj6 = this.c;
                Object obj7 = this.a;
                Object obj8 = this.d;
                Uri uri = (Uri) obj7;
                if (iuf.O(uri)) {
                    return ((hfn) ((iuf) obj8).g.io()).aa(iuf.b(uri), iuf.b((Uri) obj6), obj5 != null ? iuf.b((Uri) obj5) : -1L);
                }
                iuf iufVar = (iuf) obj8;
                return ahno.as(iufVar.o.G(ixt.o(uri), new String[]{"_id"}, null, null, "play_order").g(), new iaj(obj8, (Uri) obj6, (Uri) obj5, uri, 4), iufVar.c);
            case 4:
                Cursor cursor = (Cursor) obj;
                Object obj9 = this.a;
                if (cursor == null) {
                    return ahng.n(Boolean.FALSE);
                }
                try {
                    int columnIndex = cursor.getColumnIndex("_id");
                    final int count = -1;
                    int i6 = -1;
                    int i7 = -1;
                    final int i8 = -1;
                    while (true) {
                        boolean zMoveToNext = cursor.moveToNext();
                        obj2 = this.c;
                        if (zMoveToNext) {
                            i6++;
                            String string = cursor.getString(columnIndex);
                            if (string.equals(((Uri) obj9).getLastPathSegment())) {
                                if (i7 != -1) {
                                    i8 = i6;
                                } else {
                                    i7 = -1;
                                    i8 = i6;
                                    if (obj2 == null) {
                                    }
                                }
                            } else if (obj2 == null && string.equals(((Uri) obj2).getLastPathSegment())) {
                                i7 = i6;
                                if (i8 != -1) {
                                }
                            }
                        }
                    }
                    if (i7 == -1) {
                        if (obj2 == null) {
                            count = cursor.getCount();
                        }
                        break;
                    } else {
                        count = i7;
                    }
                    jku.b(cursor);
                    if (i8 < 0 || count < 0) {
                        return ahng.n(Boolean.FALSE);
                    }
                    if (i8 < count) {
                        count--;
                    }
                    if (i8 == count) {
                        return ahng.n(Boolean.TRUE);
                    }
                    Object obj10 = this.b;
                    final iuf iufVar2 = (iuf) this.d;
                    final Uri uri2 = (Uri) obj10;
                    return ahno.ap(new Callable() { // from class: iue
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            iuf iufVar3 = iufVar2;
                            Uri uri3 = uri2;
                            boolean zMoveItem = MediaStore.Audio.Playlists.Members.moveItem(iufVar3.b.getContentResolver(), iuf.b(uri3), i8, count);
                            if (zMoveItem) {
                                iufVar3.M(uri3, iufVar3.a());
                            }
                            return Boolean.valueOf(zMoveItem);
                        }
                    }, iufVar2.d);
                } catch (Throwable th) {
                    jku.b(cursor);
                    throw th;
                }
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj11 = this.b;
                Object obj12 = this.c;
                Object obj13 = this.a;
                Object obj14 = this.d;
                Uri uri3 = (Uri) obj13;
                if (iuo.P(uri3)) {
                    return ((iuo) obj14).k.aa(iuo.j(uri3), iuo.j((Uri) obj12), obj11 != null ? iuo.j((Uri) obj11) : -1L);
                }
                iuo iuoVar = (iuo) obj14;
                return ahno.aq(new ojj(iuoVar, uri3, (Uri) obj11, (Uri) obj12, 1), iuoVar.d);
            case 6:
                ohp ohpVar = (ohp) ahng.v(this.b);
                agev agevVar = ((oih) this.a).e;
                agevVar.g();
                try {
                    ((xxj) agevVar.c()).f(ohpVar);
                    break;
                } catch (Exception e) {
                    onb.j(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ohpVar.c);
                }
                ((ooe) ((agfa) ((zpw) this.c).l).a).h((String) this.d);
                return ahng.n(ohpVar);
            case 7:
                ojb ojbVar = (ojb) obj;
                Object obj15 = this.c;
                if (ojbVar != null && ojbVar.e) {
                    this.b.add(qnl.bb((Context) ((omn) obj15).g, ojbVar.g));
                }
                Object obj16 = this.d;
                Object obj17 = this.a;
                omn omnVar = (omn) obj15;
                Object obj18 = omnVar.i;
                omn omnVar2 = (omn) obj18;
                return ahno.ar(ahno.as(omnVar2.d.e((oiz) obj17), new ols(obj18, obj17, i3), omnVar2.b), new hco(obj15, obj16, obj17, 5), omnVar.b);
            case 8:
                Object obj19 = this.b;
                Object obj20 = this.a;
                Object obj21 = this.c;
                xgg xggVar = (xgg) this.d;
                oip oipVar = (oip) obj21;
                oin oinVar = (oin) obj20;
                oiz oizVar = (oiz) obj19;
                return ooi.d(xggVar.n(oipVar, oinVar, oizVar)).f(new iaj(xggVar, oipVar, oinVar, oizVar, 16), MoreExecutors.directExecutor());
            case 9:
                int i9 = ((onr) obj).a;
                xgg xggVar2 = (xgg) this.d;
                Object obj22 = xggVar2.d;
                Object obj23 = this.a;
                oip oipVar2 = (oip) this.c;
                oin oinVar2 = (oin) obj23;
                xgg.D((ong) obj22, oipVar2, oinVar2, i9);
                String str = oinVar2.c;
                String str2 = oipVar2.d;
                int i10 = onb.a;
                return xggVar2.t(oipVar2, oinVar2, (oiz) this.b, oipVar2.l);
            case 10:
                oip oipVar3 = (oip) this.c;
                return ((xgg) this.d).p((oiw) this.b, (oig) this.a, oipVar3.s, oipVar3.t);
            case 11:
                oip oipVar4 = (oip) this.c;
                return ((xgg) this.d).p((oiw) this.b, (oig) this.a, oipVar4.s, oipVar4.t);
            case 12:
                Object obj24 = this.a;
                final oip oipVar5 = (oip) obj;
                if (obj24 == null && (obj24 = oipVar5.m) == null) {
                    obj24 = oir.a;
                }
                Object obj25 = obj24;
                ArrayList arrayList = new ArrayList();
                Iterator it = oipVar5.o.iterator();
                while (true) {
                    Object obj26 = this.c;
                    Object obj27 = this.b;
                    if (!it.hasNext()) {
                        xgg xggVar3 = (xgg) obj27;
                        return qnl.aJ(arrayList).O(new ojj(xggVar3, (oiw) obj26, (ahcy) this.d, arrayList, 2), xggVar3.k);
                    }
                    final oin oinVar3 = (oin) it.next();
                    if (!nsp.j(oinVar3)) {
                        int iAS = a.aS(oipVar5.j);
                        if (iAS == 0) {
                            iAS = i4;
                        }
                        final oiz oizVarA = nsj.a(oinVar3, iAS);
                        if (Build.VERSION.SDK_INT >= 30) {
                            final xgg xggVar4 = (xgg) obj27;
                            ListenableFuture listenableFutureN = xggVar4.n(oipVar5, oinVar3, oizVarA);
                            ooi ooiVarD = ooi.d(listenableFutureN);
                            ojk ojkVar = new ojk(obj27, oinVar3, oipVar5, 11, (char[]) null);
                            ?? r4 = xggVar4.k;
                            ooi ooiVarC = ooiVarD.f(ojkVar, r4).f(new okm(xggVar4, oinVar3, oipVar5, listenableFutureN, oizVarA, 2), r4).c(onr.class, new ojk(obj27, oinVar3, oipVar5, 12, (char[]) null), r4);
                            final oiw oiwVar = (oiw) obj26;
                            final oir oirVar = (oir) obj25;
                            listenableFutureM = xggVar4.s(ooiVarC, new ahcy() { // from class: okk
                                @Override // defpackage.ahcy
                                public final ListenableFuture a(Object obj28) {
                                    xgg xggVar5 = xggVar4;
                                    oip oipVar6 = oipVar5;
                                    oin oinVar4 = oinVar3;
                                    oiz oizVar2 = oizVarA;
                                    oiw oiwVar2 = oiwVar;
                                    oir oirVar2 = oirVar;
                                    try {
                                        Object obj29 = xggVar5.c;
                                        int i11 = oipVar6.f;
                                        long j = oipVar6.s;
                                        String str3 = oipVar6.t;
                                        int i12 = oipVar6.p;
                                        aiie aiieVar = oipVar6.q;
                                        aifv aifvVar = oipVar6.i;
                                        if (aifvVar == null) {
                                            aifvVar = aifv.a;
                                        }
                                        return xggVar5.s(((omn) obj29).g(oiwVar2, i11, j, str3, oinVar4, oizVar2, oirVar2, i12, aiieVar, aifvVar), new iaj(xggVar5, oipVar6, oinVar4, oizVar2, 8));
                                    } catch (RuntimeException e2) {
                                        acb acbVarA = oig.a();
                                        acbVarA.b = oif.UNKNOWN_ERROR;
                                        acbVarA.d = e2;
                                        return ahng.m(acbVarA.a());
                                    }
                                }
                            });
                            i = i4;
                        } else {
                            try {
                                Object obj28 = ((xgg) obj27).c;
                                int i11 = oipVar5.f;
                                long j = oipVar5.s;
                                String str3 = oipVar5.t;
                                int i12 = oipVar5.p;
                                aiie aiieVar = oipVar5.q;
                                i = i4;
                                try {
                                    aifv aifvVar = oipVar5.i;
                                    if (aifvVar == null) {
                                        aifvVar = aifv.a;
                                    }
                                    listenableFutureM = ((omn) obj28).g((oiw) obj26, i11, j, str3, oinVar3, oizVarA, (oir) obj25, i12, aiieVar, aifvVar);
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    acb acbVarA = oig.a();
                                    acbVarA.b = oif.UNKNOWN_ERROR;
                                    acbVarA.d = e;
                                    listenableFutureM = ahng.m(acbVarA.a());
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                i = i4;
                            }
                        }
                        arrayList.add(listenableFutureM);
                        i4 = i;
                    }
                }
                break;
            case 13:
                ohx ohxVar = (ohx) obj;
                if (ohxVar == ohx.a) {
                    return aher.a;
                }
                Object obj29 = this.c;
                Object obj30 = this.a;
                Object obj31 = this.d;
                Object obj32 = this.b;
                ((elr) obj31).f(1008, (oip) obj30);
                ListenableFuture listenableFutureN2 = ahng.n(Boolean.TRUE);
                if (ohxVar != ohx.c) {
                    listenableFutureN2 = ((xgg) obj32).m.i((oiw) obj29);
                }
                return ((xgg) obj32).s(listenableFutureN2, new okn(obj32, (aihn) obj29, 9));
            case 14:
                onb.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", this.b);
                xgg.D((ong) ((xgg) this.d).d, (oip) this.c, (oin) this.a, 26);
                return ahng.m((oma) obj);
            case 15:
                okz okzVar = (okz) obj;
                Object obj33 = this.c;
                if (okzVar != okz.b) {
                    xgg.y(this.d, (oiw) obj33);
                }
                Object obj34 = this.a;
                Object obj35 = this.b;
                aihf aihfVarCreateBuilder = ahai.a.createBuilder();
                oiw oiwVar2 = (oiw) obj33;
                String str4 = oiwVar2.c;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
                str4.getClass();
                ahaiVar.b |= 1;
                ahaiVar.c = str4;
                String str5 = oiwVar2.d;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
                str5.getClass();
                ahaiVar2.b |= 4;
                ahaiVar2.e = str5;
                oip oipVar6 = (oip) obj34;
                int i13 = oipVar6.f;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar3.b |= 2;
                ahaiVar3.d = i13;
                long j2 = oipVar6.s;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar4.b |= 64;
                ahaiVar4.i = j2;
                String str6 = oipVar6.t;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
                str6.getClass();
                ahaiVar5.b |= SemanticState.Focused;
                ahaiVar5.j = str6;
                ((ong) ((xgg) obj35).d).q(3, (ahai) aihfVarCreateBuilder.build(), 2);
                return ahng.n(obj34);
            case 16:
                ojb ojbVar2 = (ojb) obj;
                oiv oivVarA = oiv.a(ojbVar2.d);
                if (oivVarA == null) {
                    oivVarA = oiv.NONE;
                }
                if (oivVarA != oiv.DOWNLOAD_COMPLETE) {
                    return aher.a;
                }
                Object obj36 = this.b;
                Object obj37 = this.a;
                Object obj38 = this.c;
                xgg xggVar5 = (xgg) this.d;
                oip oipVar7 = (oip) obj38;
                oin oinVar4 = (oin) obj37;
                ooi ooiVarD2 = ooi.d(xggVar5.h(ojbVar2, oinVar4, oipVar7));
                oiz oizVar2 = (oiz) obj36;
                okm okmVar = new okm(xggVar5, oinVar4, oipVar7, ojbVar2, oizVar2, 3);
                ?? r5 = xggVar5.k;
                return ooiVarD2.f(okmVar, r5).c(onr.class, new iaj(xggVar5, oipVar7, oinVar4, oizVar2, 9), r5);
            case 17:
                omi omiVar = (omi) obj;
                oip oipVar8 = omiVar.a;
                if (oipVar8 == null) {
                    oipVar8 = omiVar.b;
                }
                oip oipVar9 = oipVar8;
                ?? r2 = this.d;
                Object obj39 = this.a;
                if (oipVar9 == null) {
                    xgg.y(r2, (oiw) obj39);
                    return ahng.m(new AssertionError("impossible error"));
                }
                ?? r6 = this.b;
                xgg xggVar6 = (xgg) this.c;
                oiw oiwVar3 = (oiw) obj39;
                return xggVar6.s(xggVar6.E(oiwVar3, oipVar9, r6, new elr(xggVar6.d, (byte[]) null)), new iaj(xggVar6, (Object) r2, oipVar9, oiwVar3, 15));
            case 18:
                return ((olp) this.c).m.g((oiw) this.a, (oir) ((agev) this.b).f(), this.d);
            case 19:
                ojb ojbVar3 = (ojb) obj;
                Object obj40 = this.c;
                Object obj41 = this.a;
                Object obj42 = this.d;
                if (ojbVar3 != null) {
                    oiv oivVarA2 = oiv.a(ojbVar3.d);
                    if (oivVarA2 == null) {
                        oivVarA2 = oiv.NONE;
                    }
                    if (oivVarA2 == oiv.DOWNLOAD_COMPLETE) {
                        oms omsVar = (oms) obj42;
                        uriBR = qnl.bR(omsVar.a, omsVar.l, ojbVar3.c, ((oiz) this.b).e, omsVar.o, omsVar.j, false);
                    }
                }
                if (uriBR == null) {
                    acb acbVarA2 = oig.a();
                    acbVarA2.b = oif.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return ahng.m(acbVarA2.a());
                }
                try {
                    ayq ayqVar = ((oms) obj42).n;
                    if (ayqVar.ac((Uri) obj41)) {
                        ayqVar.aa((Uri) obj41);
                    }
                    ((oms) obj42).d.a();
                    ayqVar.aa((Uri) obj40);
                    aihf aihfVarCreateBuilder2 = ahai.a.createBuilder();
                    oms omsVar2 = (oms) obj42;
                    oiw oiwVar4 = omsVar2.f;
                    String str7 = oiwVar4.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahai ahaiVar6 = (ahai) aihfVarCreateBuilder2.instance;
                    str7.getClass();
                    ahaiVar6.b |= 1;
                    ahaiVar6.c = str7;
                    int i14 = omsVar2.g;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahai ahaiVar7 = (ahai) aihfVarCreateBuilder2.instance;
                    ahaiVar7.b |= 2;
                    ahaiVar7.d = i14;
                    String str8 = oiwVar4.d;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahai ahaiVar8 = (ahai) aihfVarCreateBuilder2.instance;
                    str8.getClass();
                    ahaiVar8.b |= 4;
                    ahaiVar8.e = str8;
                    long j3 = omsVar2.h;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahai ahaiVar9 = (ahai) aihfVarCreateBuilder2.instance;
                    ahaiVar9.b |= 64;
                    ahaiVar9.i = j3;
                    String str9 = omsVar2.i;
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahai ahaiVar10 = (ahai) aihfVarCreateBuilder2.instance;
                    str9.getClass();
                    ahaiVar10.b |= SemanticState.Focused;
                    ahaiVar10.j = str9;
                    ahai ahaiVar11 = (ahai) aihfVarCreateBuilder2.build();
                    ong ongVar = omsVar2.m;
                    oin oinVar5 = omsVar2.c;
                    oiq oiqVar = omsVar2.e;
                    long j4 = oinVar5.e;
                    long j5 = oiqVar.d;
                    String str10 = oinVar5.c;
                    int i15 = 0;
                    while (i15 < oinVar5.l.size()) {
                        int i16 = i15 + 1;
                        if (ahno.ag(((oiq) oinVar5.l.get(i15)).e, oiqVar.e)) {
                            i2 = i16;
                            ongVar.m(ahaiVar11, 4, j4, j5, str10, i2);
                            return aher.a;
                        }
                        i15 = i16;
                    }
                    i2 = 0;
                    ongVar.m(ahaiVar11, 4, j4, j5, str10, i2);
                    return aher.a;
                } catch (IOException e4) {
                    oms omsVar3 = (oms) obj42;
                    onb.g(e4, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", omsVar3.e.c, omsVar3.c.g);
                    acb acbVarA3 = oig.a();
                    acbVarA3.b = oif.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    acbVarA3.d = e4;
                    return ahng.m(acbVarA3.a());
                }
            default:
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                if (listenableFuture != this.b) {
                    return listenableFuture;
                }
                Object obj43 = this.a;
                Object obj44 = this.d;
                Object obj45 = this.c;
                ((ahev) obj44).run();
                listenableFuture.addListener(new msh(obj45, obj43, 12, null), ((aesp) obj45).d);
                return listenableFuture;
        }
    }

    public /* synthetic */ iaj(iao iaoVar, abnl abnlVar, iar iarVar, List list, int i) {
        this.$cid = i;
        this.a = iaoVar;
        this.b = abnlVar;
        this.c = iarVar;
        this.d = list;
    }

    public /* synthetic */ iaj(itu ituVar, String str, List list, sxu sxuVar, int i) {
        this.$cid = i;
        this.a = ituVar;
        this.b = str;
        this.d = list;
        this.c = sxuVar;
    }

    public /* synthetic */ iaj(Object obj, aihn aihnVar, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.d = obj;
        this.b = aihnVar;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ iaj(Object obj, Uri uri, Uri uri2, Uri uri3, int i) {
        this.$cid = i;
        this.d = obj;
        this.a = uri;
        this.c = uri2;
        this.b = uri3;
    }

    public /* synthetic */ iaj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    public /* synthetic */ iaj(Object obj, oiw oiwVar, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = oiwVar;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ iaj(xgg xggVar, Object obj, oip oipVar, oiw oiwVar, int i) {
        this.$cid = i;
        this.b = xggVar;
        this.d = obj;
        this.a = oipVar;
        this.c = oiwVar;
    }

    public /* synthetic */ iaj(xgg xggVar, oip oipVar, oin oinVar, oiz oizVar, int i) {
        this.$cid = i;
        this.d = xggVar;
        this.c = oipVar;
        this.a = oinVar;
        this.b = oizVar;
    }

    public /* synthetic */ iaj(xgg xggVar, oir oirVar, oiw oiwVar, ahcy ahcyVar, int i) {
        this.$cid = i;
        this.b = xggVar;
        this.a = oirVar;
        this.c = oiwVar;
        this.d = ahcyVar;
    }

    public /* synthetic */ iaj(xgg xggVar, oiz oizVar, oip oipVar, oin oinVar, int i) {
        this.$cid = i;
        this.d = xggVar;
        this.b = oizVar;
        this.c = oipVar;
        this.a = oinVar;
    }
}
