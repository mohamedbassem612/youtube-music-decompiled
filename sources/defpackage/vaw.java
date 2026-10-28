package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vaw implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vaw(absg absgVar, alvl alvlVar, absm absmVar, aoqt aoqtVar, sxu sxuVar, String str, int i) {
        this.$cid = i;
        this.f = absgVar;
        this.c = alvlVar;
        this.b = absmVar;
        this.d = aoqtVar;
        this.a = sxuVar;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, wby] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ajfu ajfuVar = (ajfu) obj;
            Object obj2 = this.f;
            ?? r5 = this.e;
            Object obj3 = this.d;
            Object obj4 = this.c;
            xsc.H(this.a, (String) this.b, ajfuVar, (String) obj4, (String) obj3, r5, (ajwo) obj2, ajga.ASSET_ITEM_SELECTED_STATE_SELECTED);
            return;
        }
        if (i != 1) {
            if (((Boolean) obj).booleanValue()) {
                Object obj5 = this.e;
                ?? r4 = this.a;
                Object obj6 = this.d;
                Object obj7 = this.b;
                ((absg) this.f).m((alvl) this.c, (absm) obj7, (aoqt) obj6, r4, (String) obj5);
                return;
            }
            return;
        }
        Throwable th = (Throwable) obj;
        ?? r0 = this.b;
        ?? r1 = this.f;
        if (r1 != 0) {
            wer werVarE = r0.e();
            werVarE.e(r1);
            avnr.b((AtomicReference) werVarE.b().D());
        } else {
            Object obj8 = this.e;
            wer werVarE2 = r0.e();
            werVarE2.j((String) obj8);
            avnr.b((AtomicReference) werVarE2.b().D());
        }
        ((gug) this.a).e(th);
    }

    public /* synthetic */ vaw(gug gugVar, weh wehVar, wek wekVar, String str, ajwo ajwoVar, zwa zwaVar, int i) {
        this.$cid = i;
        this.a = gugVar;
        this.f = wehVar;
        this.b = wekVar;
        this.e = str;
        this.d = ajwoVar;
        this.c = zwaVar;
    }

    public /* synthetic */ vaw(wby wbyVar, String str, String str2, String str3, List list, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.a = wbyVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = ajwoVar;
    }
}
