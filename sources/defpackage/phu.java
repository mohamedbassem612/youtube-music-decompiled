package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phu extends awpg {
    /* synthetic */ Object a;
    final /* synthetic */ pic b;
    int c;
    avc d;
    Bitmap e;
    aidn f;
    aidm g;
    String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phu(pic picVar, awoq awoqVar) {
        super(awoqVar);
        this.b = picVar;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, null, null, this);
    }
}
