package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kih extends kic implements kis {
    public final MessageLite n;
    public mea o;

    public kih(kii kiiVar, MessageLite messageLite) {
        super(kiiVar);
        this.n = messageLite;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.kic
    public final /* bridge */ /* synthetic */ kic c() {
        super.c();
        Iterator it = kjc.a().a.iterator();
        while (true) {
            byte[] bArr = null;
            if (!it.hasNext()) {
                break;
            }
            omj omjVar = (omj) it.next();
            if (!this.a.d()) {
                axfd.T(this, new jxq(omjVar, this, 6, bArr), new idv(omjVar, this, 4, bArr));
                int i = 7;
                axfd.T(this, new jxq(omjVar, this, i, bArr), new olh(omjVar.a, i));
            }
        }
        Iterator it2 = kii.m.iterator();
        while (it2.hasNext()) {
            this = ((kig) it2.next()).a(this);
            if (this == null) {
                return null;
            }
        }
        return this;
    }

    @Override // defpackage.kic
    public final kiw d() {
        auli auliVarB;
        aigj byteString = this.n.toByteString();
        aihh aihhVar = this.m;
        aihhVar.copyOnWrite();
        aulj auljVar = (aulj) aihhVar.instance;
        aulj auljVar2 = aulj.a;
        byteString.getClass();
        auljVar.b |= SemanticState.Modal;
        auljVar.f = byteString;
        kii kiiVar = (kii) this.a;
        kid kidVar = kiiVar.n;
        if (kidVar != null && (auliVarB = kidVar.b()) != null) {
            aihhVar.copyOnWrite();
            aulj auljVar3 = (aulj) aihhVar.instance;
            auljVar3.k = auliVarB;
            auljVar3.b |= 134217728;
        }
        aulj auljVar4 = (aulj) aihhVar.build();
        kjw kjwVar = new kjw(kiiVar.h, kib.a(kiiVar.e), this.h, this.g, i(), kiiVar.i);
        byte[] byteArray = auljVar4.toByteArray();
        int[] iArrE = kib.e(null);
        ArrayList arrayList = this.c;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(kib.b) : null;
        int[] iArrE2 = kib.e(this.d);
        ArrayList arrayList2 = this.e;
        lle[] lleVarArr = arrayList2 != null ? (lle[]) arrayList2.toArray(kib.a) : null;
        Set set = this.f;
        return new kiw(kjwVar, auljVar4, byteArray, iArrE, strArr, iArrE2, lleVarArr, set != null ? (String[]) set.toArray(kib.b) : null, auljVar4.e, null);
    }

    @Override // defpackage.kic
    public final lpa e() {
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.b = true;
        return ((kii) this.a).f.a(this);
    }

    @Override // defpackage.kic
    public final ListenableFuture f(kid kidVar) {
        return kidVar.a(new kiy(Instant.ofEpochMilli(b())));
    }

    @Override // defpackage.kic
    public final /* bridge */ /* synthetic */ void h(double d) {
        aihh aihhVar = this.m;
        aihhVar.copyOnWrite();
        aulj auljVar = (aulj) aihhVar.instance;
        aulj auljVar2 = aulj.a;
        auljVar.b |= 67108864;
        auljVar.i = d;
    }
}
