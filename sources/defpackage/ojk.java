package defpackage;

import android.content.Context;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ojk implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ojk(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, ola] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws okc {
        aifv aifvVar;
        int i = 14;
        int i2 = 20;
        int i3 = 4;
        Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                omh omhVar = (omh) this.b;
                oiw oiwVar = omhVar.a;
                agjz agjzVar = (agjz) obj;
                boolean z = oiwVar.f;
                oip oipVar = omhVar.b;
                agev agevVarH = zpw.h(oipVar);
                String str = (oiwVar.b & 4) != 0 ? oiwVar.e : null;
                Object obj2 = this.a;
                Object obj3 = this.c;
                int i4 = true != z ? 3 : 2;
                boolean z2 = ((oik) obj3).c;
                zpw zpwVar = (zpw) obj2;
                Object obj4 = zpwVar.b;
                ?? r6 = zpwVar.o;
                return ahno.ar(ahno.ar(zpw.k(oipVar, agevVarH, str, i4, z2, (olp) zpwVar.j, r6, (ayq) obj4), new iun(obj2, 12), r6), new iun(agjzVar, i), r6);
            case 1:
                return ((obq) ((oao) this.a).b.b.get()).d((Context) this.c, (String) this.b);
            case 2:
                oiw oiwVar2 = (oiw) this.c;
                String str2 = oiwVar2.c;
                String str3 = oiwVar2.d;
                int i5 = onb.a;
                zpw zpwVar2 = (zpw) this.a;
                Object obj5 = zpwVar2.j;
                olp olpVar = (olp) obj5;
                return ahno.as(olpVar.e(), new iaj(obj5, oiwVar2, this.b, zpwVar2.i, 18), olpVar.g);
            case 3:
                agkj agkjVar = (agkj) obj;
                ?? r0 = this.b;
                Object obj6 = this.c;
                for (oin oinVar : r0) {
                    if (!agkjVar.containsKey(oinVar)) {
                        acb acbVarA = oig.a();
                        acbVarA.b = oif.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                        acbVarA.c = "getDataFileUris() resolved to null";
                        return ahng.m(acbVarA.a());
                    }
                    Uri uri = (Uri) agkjVar.get(oinVar);
                    try {
                        boolean zF = nsp.f(oinVar);
                        Object obj7 = this.a;
                        if (zF && ((ayq) obj6).ad(uri)) {
                            String path = uri.getPath();
                            if (path != null) {
                                List listJ = zpw.j((ayq) obj6, uri, path);
                                ((aihf) obj7).copyOnWrite();
                                ohp ohpVar = (ohp) ((aihf) obj7).instance;
                                ohp ohpVar2 = ohp.a;
                                ohpVar.a();
                                aifs.addAll(listJ, ohpVar.h);
                            }
                        } else {
                            String str4 = oinVar.c;
                            long j = oinVar.e;
                            long j2 = oinVar.j;
                            String string = uri.toString();
                            if ((oinVar.b & SemanticState.Multiline) != 0) {
                                aifv aifvVar2 = oinVar.q;
                                if (aifvVar2 == null) {
                                    aifvVar2 = aifv.a;
                                }
                                aifvVar = aifvVar2;
                            } else {
                                aifvVar = null;
                            }
                            ((aihf) obj7).S(zpw.c(str4, j, j2, string, aifvVar, true, oinVar.g));
                        }
                    } catch (IOException e) {
                        onb.f(e, "Failed to list files under directory:".concat(String.valueOf(String.valueOf(uri))));
                    }
                }
                return aher.a;
            case 4:
                return ((xgg) this.b).m.l((oiw) this.a, (oip) this.c);
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    return this.b;
                }
                Object obj8 = this.c;
                ((ong) ((xgg) this.a).d).j(1036);
                return ahng.m(new IOException("Failed to write updated group: ".concat(String.valueOf(((oiw) obj8).c))));
            case 6:
                if (!((Boolean) obj).booleanValue()) {
                    Object obj9 = this.a;
                    Object obj10 = this.c;
                    Object obj11 = this.b;
                    oin oinVar2 = (oin) obj10;
                    oip oipVar2 = (oip) obj9;
                    onb.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", oinVar2.c, oipVar2.d);
                    xgg.D((ong) ((xgg) obj11).d, oipVar2, oinVar2, 14);
                }
                return aher.a;
            case 7:
                agev agevVar = (agev) ((xgg) this.b).a;
                if (agevVar.g()) {
                    oip oipVar3 = (oip) this.c;
                    int iA = nsw.a(oipVar3.r);
                    if (iA != 0 && iA != 1) {
                        Object obj12 = this.a;
                        ook ookVar = (ook) ((agfr) agevVar.c()).io();
                        int i6 = oipVar3.r;
                        String str5 = ((oiw) obj12).c;
                        return ookVar.a();
                    }
                }
                return ahng.n(Boolean.TRUE);
            case 8:
                Object obj13 = this.c;
                xgg xggVar = (xgg) this.a;
                xgg.C(1062, (ong) xggVar.d, (oip) obj13);
                xggVar.l.q();
                return xggVar.s(xggVar.m.i(((omh) this.b).a), new gpr(i2));
            case 9:
                Exception exc = (Exception) obj;
                oip oipVar4 = (oip) ((AtomicReference) this.b).get();
                if (oipVar4 == null) {
                    oipVar4 = oip.a;
                }
                oip oipVar5 = oipVar4;
                Object obj14 = this.c;
                Object obj15 = this.a;
                boolean z3 = exc instanceof oig;
                ListenableFuture listenableFutureS = aher.a;
                if (z3) {
                    oig oigVar = (oig) exc;
                    oif oifVar = oigVar.a;
                    int i7 = onb.a;
                    listenableFutureS = ((xgg) obj15).s(listenableFutureS, new iaj(obj15, (aihn) obj14, (Object) oigVar, (Object) oipVar5, 10));
                } else if (exc instanceof ohs) {
                    int i8 = onb.a;
                    agke agkeVar = ((ohs) exc).a;
                    int i9 = ((agpi) agkeVar).d;
                    for (int i10 = 0; i10 < i9; i10++) {
                        Throwable th = (Throwable) agkeVar.get(i10);
                        if (th instanceof oig) {
                            listenableFutureS = ((xgg) obj15).s(listenableFutureS, new iaj(obj15, (aihn) obj14, th, (Object) oipVar5, 11));
                        } else {
                            onb.c("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        }
                    }
                }
                return ((xgg) obj15).s(listenableFutureS, new ods(exc, 9));
            case 10:
                agkj agkjVar2 = (agkj) obj;
                ?? r2 = this.b;
                Object obj16 = this.a;
                Object obj17 = this.c;
                for (oin oinVar3 : r2) {
                    try {
                        Uri uri2 = (Uri) ((agkj) obj16).get(oinVar3);
                        uri2.getClass();
                        Uri uri3 = (Uri) agkjVar2.get(oinVar3);
                        uri3.getClass();
                        Uri uri4 = Uri.parse(uri2.toString().substring(0, uri2.toString().lastIndexOf("/")));
                        Object obj18 = ((xgg) obj17).j;
                        if (!((ayq) obj18).ac(uri4)) {
                            ((ayq) obj18).Y(uri4);
                        }
                        nsv.b((Context) ((xgg) obj17).f, uri2, uri3);
                    } catch (IOException | NullPointerException e2) {
                        acb acbVarA2 = oig.a();
                        acbVarA2.b = oif.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                        acbVarA2.c = "Unable to create symlink";
                        acbVarA2.d = e2;
                        return ahng.m(acbVarA2.a());
                    }
                }
                return aher.a;
            case 11:
                return ((xgg) this.b).h((ojb) obj, (oin) this.c, (oip) this.a);
            case 12:
                oin oinVar4 = (oin) this.c;
                String str6 = oinVar4.c;
                oip oipVar6 = (oip) this.a;
                String str7 = oipVar6.d;
                int i11 = onb.a;
                xgg.D((ong) ((xgg) this.b).d, oipVar6, oinVar4, ((onr) obj).a);
                return aher.a;
            case 13:
                return ((xgg) this.b).m.l((oiw) this.a, (oip) this.c);
            case 14:
                oip oipVar7 = (oip) obj;
                Object obj19 = this.b;
                if (oipVar7 != null) {
                    int i12 = oipVar7.f;
                    aihf aihfVar = (aihf) obj19;
                    aihfVar.copyOnWrite();
                    ahai ahaiVar = (ahai) aihfVar.instance;
                    ahai ahaiVar2 = ahai.a;
                    ahaiVar.b |= 2;
                    ahaiVar.d = i12;
                }
                Object obj20 = this.c;
                Object obj21 = this.a;
                oig oigVar2 = (oig) obj20;
                int iE = aext.e(oigVar2.a.aL);
                ahai ahaiVar3 = (ahai) ((aihf) obj19).build();
                int i13 = oigVar2.c - 1;
                int i14 = oigVar2.b;
                ((ong) ((xgg) obj21).d).q(iE, ahaiVar3, ahng.Z(i13));
                return aher.a;
            case 15:
                Object obj22 = this.b;
                xgg xggVar2 = (xgg) obj22;
                ?? r3 = xggVar2.m;
                Object obj23 = this.a;
                oiw oiwVar3 = (oiw) obj23;
                ooi ooiVarD = ooi.d(r3.g(oiwVar3));
                kke kkeVar = new kke(17);
                ?? r8 = xggVar2.k;
                ooi ooiVarE = ooiVarD.e(kkeVar, r8);
                return ooiVarE.f(new ojk(xggVar2, oiwVar3, (oip) this.c, i3), r8).f(new ojk(obj22, obj23, ooiVarE, 5), r8);
            case 16:
                oip oipVar8 = (oip) obj;
                Object obj24 = this.c;
                if (oipVar8 != null) {
                    return ahng.n(xgg.c((oip) obj24, oipVar8));
                }
                Object obj25 = this.a;
                Object obj26 = this.b;
                aihf builder = ((aihn) obj25).toBuilder();
                builder.copyOnWrite();
                oiw oiwVar4 = (oiw) builder.instance;
                oiwVar4.b |= 8;
                oiwVar4.f = true;
                xgg xggVar3 = (xgg) obj26;
                return xggVar3.s(xggVar3.m.g((oiw) builder.build()), new ods(obj24, 6));
            case 17:
                oix oixVar = (oix) obj;
                if (oixVar == null) {
                    oixVar = oix.a;
                }
                if (oixVar.b) {
                    return ahng.n(null);
                }
                Object obj27 = this.c;
                Object obj28 = this.a;
                Object obj29 = this.b;
                oiw oiwVar5 = (oiw) obj28;
                String str8 = oiwVar5.c;
                String str9 = oiwVar5.d;
                int i15 = onb.a;
                xgg.C(1055, (ong) ((xgg) obj29).d, (oip) obj27);
                throw new okc();
            case 18:
                Object obj30 = this.a;
                aihf builder2 = ((aihn) obj30).toBuilder();
                builder2.copyOnWrite();
                oiw oiwVar6 = (oiw) builder2.instance;
                oiwVar6.b |= 8;
                oiwVar6.f = false;
                oiw oiwVar7 = (oiw) builder2.build();
                Object obj31 = this.b;
                xgg xggVar4 = (xgg) obj31;
                return xggVar4.s(xggVar4.m.g(oiwVar7), new ojk(obj31, this.c, obj30, 16, (char[]) null));
            case 19:
                agev agevVar2 = (agev) obj;
                boolean zG = agevVar2.g();
                Object obj32 = this.a;
                if (!zG) {
                    String str10 = ((oiw) obj32).c;
                    int i16 = onb.a;
                    return ahng.n(Boolean.FALSE);
                }
                Object obj33 = this.c;
                oip oipVar9 = (oip) obj33;
                if (nsp.i(oipVar9)) {
                    int i17 = agxm.b;
                    agxk agxkVarF = agxl.a.f();
                    agxkVarF.j(oipVar9.t);
                    agxkVarF.j("|");
                    agxkVarF.j(((oiw) obj32).e);
                    agxkVarF.j("|");
                    long j3 = oipVar9.s;
                    agwy agwyVar = (agwy) agxkVarF;
                    ByteBuffer byteBufferA = agwyVar.a();
                    byteBufferA.putLong(j3);
                    agwyVar.d(byteBufferA, 8);
                    String str11 = String.format("%s_%s", oipVar9.d, agxkVarF.o().toString());
                    aihf builder3 = ((aihn) obj33).toBuilder();
                    builder3.copyOnWrite();
                    oip oipVar10 = (oip) builder3.instance;
                    str11.getClass();
                    oipVar10.b |= 524288;
                    oipVar10.w = str11;
                    obj33 = (oip) builder3.build();
                }
                Object obj34 = this.b;
                aihf builder4 = ((aihn) obj32).toBuilder();
                builder4.copyOnWrite();
                oiw oiwVar8 = (oiw) builder4.instance;
                oiwVar8.b |= 8;
                oiwVar8.f = false;
                xgg xggVar5 = (xgg) obj34;
                return xggVar5.s(xggVar5.s(xggVar5.m.g((oiw) builder4.build()), new iub(obj34, obj33, i2, objArr == true ? 1 : 0)), new ojk(obj34, obj32, agevVar2, i2));
            default:
                oip oipVar11 = (oip) obj;
                Object obj35 = this.c;
                String str12 = ((oiw) obj35).c;
                int i18 = onb.a;
                aihf aihfVarCreateBuilder = ahai.a.createBuilder();
                String str13 = oipVar11.d;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
                str13.getClass();
                ahaiVar4.b |= 1;
                ahaiVar4.c = str13;
                String str14 = oipVar11.e;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.instance;
                str14.getClass();
                ahaiVar5.b |= 4;
                ahaiVar5.e = str14;
                int i19 = oipVar11.f;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar6 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar6.b |= 2;
                ahaiVar6.d = i19;
                long j4 = oipVar11.s;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar7 = (ahai) aihfVarCreateBuilder.instance;
                ahaiVar7.b |= 64;
                ahaiVar7.i = j4;
                String str15 = oipVar11.t;
                aihfVarCreateBuilder.copyOnWrite();
                ahai ahaiVar8 = (ahai) aihfVarCreateBuilder.instance;
                str15.getClass();
                ahaiVar8.b |= SemanticState.Focused;
                ahaiVar8.j = str15;
                ahai ahaiVar9 = (ahai) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = ahay.a.createBuilder();
                ahba ahbaVar = (ahba) ((agev) this.b).c();
                aihfVarCreateBuilder2.copyOnWrite();
                ahay ahayVar = (ahay) aihfVarCreateBuilder2.instance;
                ahayVar.c = ahbaVar.getNumber();
                ahayVar.b |= 1;
                ahay ahayVar2 = (ahay) aihfVarCreateBuilder2.build();
                Object obj36 = this.a;
                xgg xggVar6 = (xgg) obj36;
                ((ong) xggVar6.d).i(ahaiVar9, ahayVar2);
                return xggVar6.s(xggVar6.q(oipVar11, 0, oipVar11.o.size()), new okx(obj36, obj35, (Object) oipVar11, 1, (byte[]) null));
        }
    }

    public /* synthetic */ ojk(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ojk(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ojk(xgg xggVar, List list, agkj agkjVar, int i) {
        this.$cid = i;
        this.c = xggVar;
        this.b = list;
        this.a = agkjVar;
    }

    public /* synthetic */ ojk(xgg xggVar, oiw oiwVar, oip oipVar, int i) {
        this.$cid = i;
        this.b = xggVar;
        this.a = oiwVar;
        this.c = oipVar;
    }
}
