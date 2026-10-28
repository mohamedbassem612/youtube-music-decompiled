package defpackage;

import android.content.Context;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wdu implements qsx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wdu(web webVar, Object obj, int i) {
        this.$cid = i;
        this.a = webVar;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zwa] */
    @Override // defpackage.qsx
    public final Object a(omr omrVar) {
        int i = this.$cid;
        if (i == 0) {
            return (agkz) web.m(omrVar, (omr) this.b, new wdx((web) this.a, 1)).collect(aghu.b);
        }
        ?? r2 = this.a;
        if (i != 1) {
            web webVar = (web) this.b;
            return (agkz) web.m(omrVar, webVar.k(r2, wea.e).p(), new wdx(webVar, 0)).collect(aghu.b);
        }
        web webVar2 = (web) r2;
        ?? r4 = webVar2.d;
        ahno.O(r4.h());
        ((wjr) webVar2.e).c((Context) this.b, r4);
        return Boolean.TRUE;
    }

    public /* synthetic */ wdu(web webVar, Collection collection, int i) {
        this.$cid = i;
        this.b = webVar;
        this.a = collection;
    }
}
