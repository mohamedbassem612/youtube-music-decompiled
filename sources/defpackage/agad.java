package defpackage;

import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.Instance;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agad extends Instance {
    public final aunn a;
    public final aunn b;
    public final aunn c;
    public final avmb d;
    public final aunn e;
    public final Executor f;
    public final avmm g;
    public final aunn h;
    public final aunn i;
    public final RuntimeSignal j;
    public final RuntimeSignal k;
    public final RuntimeSignal l;
    public final RuntimeSignal m;
    public final vxz n;
    private final aunn o;

    public agad(may mayVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, avmb avmbVar, Executor executor, aunn aunnVar6, vxz vxzVar, aunn aunnVar7) {
        this.h = aunnVar;
        this.a = aunnVar2;
        this.b = aunnVar3;
        this.c = aunnVar4;
        this.d = avmbVar;
        this.e = aunnVar5;
        this.f = executor;
        this.o = aunnVar6;
        asfj asfjVar = asfj.a;
        aihn.getParserForClass(asfj.class);
        this.l = new RuntimeSignal(986551010, mayVar.a);
        asfl asflVar = asfl.a;
        aihn.getParserForClass(asfl.class);
        this.m = new RuntimeSignal(1402080051, mayVar.a);
        this.g = new avmm();
        asff asffVar = asff.a;
        aihn.getParserForClass(asff.class);
        this.j = new RuntimeSignal(1221382089, mayVar.a);
        aihn.getParserForClass(asff.class);
        this.k = new RuntimeSignal(-41193566, mayVar.a);
        this.n = vxzVar;
        this.i = aunnVar7;
    }

    public final void a(RuntimeSignal runtimeSignal) {
        aihf aihfVarCreateBuilder = asff.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asff asffVar = (asff) aihfVarCreateBuilder.instance;
        asffVar.d = 2;
        asffVar.b |= 1;
        runtimeSignal.b((asff) aihfVarCreateBuilder.build());
        ((khn) this.o.io()).g(R.string.generic_error_message);
    }
}
