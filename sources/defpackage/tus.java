package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import j$.util.Optional;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tus {
    public tuq a;
    public tur b;
    private final ViewTreeObserver.OnPreDrawListener d;
    private final View e;
    private WeakReference f;
    private boolean h;
    private tup g = new tup();
    public tup c = new tup();

    public tus(View view) {
        view.getClass();
        this.e = view;
        this.d = new fsd(this, 2);
        this.h = false;
    }

    private final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void a() {
        View viewC = c();
        if (viewC != null) {
            tup tupVar = this.g;
            this.g = this.c;
            tup.a(tupVar, viewC, this.e);
            this.c = tupVar;
            if (this.b != null) {
                tup tupVar2 = this.g;
                boolean zC = tupVar.c();
                boolean zC2 = tupVar2.c();
                if ((zC || zC2) && !tupVar.equals(tupVar2)) {
                    this.b.a(this.c);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public final void b(View view) {
        if (view == c()) {
            a();
            return;
        }
        this.f = new WeakReference(view);
        tuq tuqVar = this.a;
        if (tuqVar != null && view == null) {
            aefv aefvVar = (aefv) tuqVar;
            aefl aeflVar = aefvVar.f;
            if (aeflVar != null) {
                if (!((Boolean) aeflVar.r.orElse(Boolean.FALSE)).booleanValue()) {
                    aefvVar.g();
                }
            } else {
                aefvVar.g();
            }
        }
        ViewTreeObserver viewTreeObserver = this.e.getViewTreeObserver();
        if (view != null && !this.h) {
            viewTreeObserver.addOnPreDrawListener(this.d);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
            this.h = false;
        }
        if (view != null) {
            a();
            return;
        }
        if (this.c.c()) {
            this.c.b();
            Optional optionalOfNullable = Optional.ofNullable(this.b);
            saa saaVar = new saa(this, 11);
            if (true == optionalOfNullable.isPresent()) {
                ((tur) optionalOfNullable.get()).a(((tus) saaVar.a).c);
            }
        }
    }
}
