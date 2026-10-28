package defpackage;

import android.animation.Animator;
import j$.time.Duration;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abkw {
    public Animator.AnimatorListener a;
    private Duration b;
    private agke c;
    private agke d;

    public final abkx a() {
        agke agkeVar;
        agke agkeVar2;
        Duration duration = this.b;
        if (duration != null && (agkeVar = this.c) != null && (agkeVar2 = this.d) != null) {
            return new abkx(duration, agkeVar, agkeVar2, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" delayBetweenAnimationsInSequence");
        }
        if (this.c == null) {
            sb.append(" views");
        }
        if (this.d == null) {
            sb.append(" animationSteps");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.d = agke.n(list);
    }

    public final void c(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null delayBetweenAnimationsInSequence");
        }
        this.b = duration;
    }

    public final void d(List list) {
        this.c = agke.n(list);
    }
}
