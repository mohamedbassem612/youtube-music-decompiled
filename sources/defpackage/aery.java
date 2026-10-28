package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aery {
    private final Context a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private final wmy f;

    public aery(Context context, wmy wmyVar) {
        this.a = context;
        this.f = wmyVar;
    }

    static /* synthetic */ String d(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (sb.length() + stackTraceElement.toString().length() > 2000) {
                break;
            }
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }

    final void a() {
        this.d = this.e;
        try {
            this.e = qel.d(this.a);
        } catch (Throwable th) {
            th.toString();
            int i = aerx.a;
        }
        this.b = this.c;
        this.c = this.f.a;
    }

    final boolean b() {
        return this.b || this.c;
    }

    final boolean c() {
        return this.d || this.e;
    }
}
