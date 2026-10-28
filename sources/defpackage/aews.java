package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aews implements aexo {
    public aeud a;
    private final Context b;
    private final ExtendedFloatingActionButton c;
    private final ArrayList d = new ArrayList();
    private aeud e;
    private final auym f;

    public aews(ExtendedFloatingActionButton extendedFloatingActionButton, auym auymVar) {
        this.c = extendedFloatingActionButton;
        this.b = extendedFloatingActionButton.getContext();
        this.f = auymVar;
    }

    @Override // defpackage.aexo
    public AnimatorSet a() {
        return b(c());
    }

    final AnimatorSet b(aeud aeudVar) {
        ArrayList arrayList = new ArrayList();
        if (aeudVar.f("opacity")) {
            arrayList.add(aeudVar.a("opacity", this.c, View.ALPHA));
        }
        if (aeudVar.f("scale")) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
            arrayList.add(aeudVar.a("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(aeudVar.a("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (aeudVar.f("width")) {
            arrayList.add(aeudVar.a("width", this.c, ExtendedFloatingActionButton.k));
        }
        if (aeudVar.f("height")) {
            arrayList.add(aeudVar.a("height", this.c, ExtendedFloatingActionButton.l));
        }
        if (aeudVar.f("paddingStart")) {
            arrayList.add(aeudVar.a("paddingStart", this.c, ExtendedFloatingActionButton.m));
        }
        if (aeudVar.f("paddingEnd")) {
            arrayList.add(aeudVar.a("paddingEnd", this.c, ExtendedFloatingActionButton.n));
        }
        if (aeudVar.f("labelOpacity")) {
            arrayList.add(aeudVar.a("labelOpacity", this.c, new aewr(Float.class)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        aewo.h(animatorSet, arrayList);
        return animatorSet;
    }

    public final aeud c() {
        aeud aeudVarC = this.a;
        if (aeudVarC == null) {
            aeudVarC = this.e;
            if (aeudVarC == null) {
                aeudVarC = aeud.c(this.b, h());
                this.e = aeudVarC;
            }
            azs.l(aeudVarC);
        }
        return aeudVarC;
    }

    @Override // defpackage.aexo
    public final List d() {
        return this.d;
    }

    @Override // defpackage.aexo
    public void e() {
        this.f.c();
    }

    @Override // defpackage.aexo
    public void f() {
        this.f.c();
    }

    @Override // defpackage.aexo
    public void g(Animator animator) {
        auym auymVar = this.f;
        Object obj = auymVar.b;
        if (obj != null) {
            ((Animator) obj).cancel();
        }
        auymVar.b = animator;
    }
}
