package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mil extends qa {
    final /* synthetic */ CommandOuterClass$Command a;
    final /* synthetic */ nry b;
    final /* synthetic */ mim c;
    final /* synthetic */ nsl d;
    final /* synthetic */ AtomicReference e;
    final /* synthetic */ AtomicBoolean f;
    final /* synthetic */ CommandOuterClass$Command g;
    final /* synthetic */ CommandOuterClass$Command h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mil(CommandOuterClass$Command commandOuterClass$Command, nry nryVar, mim mimVar, nsl nslVar, AtomicReference atomicReference, AtomicBoolean atomicBoolean, CommandOuterClass$Command commandOuterClass$Command2, int i, CommandOuterClass$Command commandOuterClass$Command3) {
        super((byte[]) null);
        this.a = commandOuterClass$Command;
        this.b = nryVar;
        this.c = mimVar;
        this.d = nslVar;
        this.e = atomicReference;
        this.f = atomicBoolean;
        this.g = commandOuterClass$Command2;
        this.i = i;
        this.h = commandOuterClass$Command3;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2;
        CommandOuterClass$Command commandOuterClass$Command = this.a;
        if (commandOuterClass$Command != null) {
            nry nryVar = this.b;
            mim mimVar = this.c;
            nsl nslVar = this.d;
            recyclerView2 = recyclerView;
            mio.c(recyclerView2, nryVar, commandOuterClass$Command, mimVar, nslVar.x, nslVar.t);
        } else {
            recyclerView2 = recyclerView;
        }
        AtomicReference atomicReference = this.e;
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        ((nwj) atomicReference.get()).h(recyclerView2);
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        CommandOuterClass$Command commandOuterClass$Command;
        if (i != 0) {
            if (i == 1 && this.f.compareAndSet(false, true) && (commandOuterClass$Command = this.h) != null) {
                nry nryVar = this.b;
                mim mimVar = this.c;
                nsl nslVar = this.d;
                mio.c(recyclerView, nryVar, commandOuterClass$Command, mimVar, nslVar.x, nslVar.t);
                return;
            }
            return;
        }
        if (this.f.compareAndSet(true, false)) {
            CommandOuterClass$Command commandOuterClass$Command2 = this.g;
            if (commandOuterClass$Command2 != null) {
                nry nryVar2 = this.b;
                mim mimVar2 = this.c;
                nsl nslVar2 = this.d;
                mio.c(recyclerView, nryVar2, commandOuterClass$Command2, mimVar2, nslVar2.x, nslVar2.t);
            }
            if (this.i == 2) {
                nsl nslVar3 = this.d;
                String str = mio.a;
                asnu asnuVarD = nslVar3.d();
                adfx adfxVarI = nslVar3.i();
                if (adfxVarI == null || asnuVarD == null) {
                    return;
                }
                adfxVarI.h(asnuVarD, 3);
            }
        }
    }
}
