package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yuy extends twv {
    final /* synthetic */ yuz a;

    public yuy(yuz yuzVar) {
        this.a = yuzVar;
    }

    @Override // defpackage.twv
    protected final /* bridge */ /* synthetic */ Object b() {
        zig zigVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        yuz yuzVar = this.a;
        try {
            if (yuzVar.b()) {
                atpl atplVar = (atpl) yuzVar.a.c();
                if ((atplVar.b & 2) != 0) {
                    zigVar = atplVar.e;
                    if (zigVar == null) {
                        zigVar = zig.a;
                    }
                } else {
                    zigVar = null;
                }
                if (zigVar != null) {
                    arrayDeque.addAll(zigVar.b);
                }
            }
        } catch (ClassCastException | IllegalArgumentException e) {
            zvp.b(zvn.a, zvm.f, "Invalid persisted bandwidth samples. Ignored.", e);
        }
        return arrayDeque;
    }
}
