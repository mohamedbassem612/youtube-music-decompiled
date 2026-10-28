package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vrg extends qr {
    final /* synthetic */ vrh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrg(vrh vrhVar) {
        super(true);
        this.a = vrhVar;
    }

    @Override // defpackage.qr
    public final void b() {
        vrh vrhVar = this.a;
        nry nryVar = (nry) vrhVar.c.io();
        CommandOuterClass$Command defaultInstance = vrhVar.a.l;
        if (defaultInstance == null) {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        nryVar.a(defaultInstance, vrhVar.b).D();
    }
}
