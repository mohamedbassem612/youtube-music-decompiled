package defpackage;

import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqr {
    public final acxt a;
    private final aunn c;
    private boolean g;
    private adly d = null;
    public Optional b = Optional.empty();
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();

    public sqr(acxt acxtVar, aunn aunnVar) {
        this.c = aunnVar;
        this.a = acxtVar;
    }

    private final void f() {
        if (this.e.isPresent()) {
            ((ViewGroup) this.e.get()).setVisibility(8);
            this.a.a().setVisibility(8);
        }
    }

    public final void a(View view, adly adlyVar) {
        adly adlyVar2;
        adly adlyVar3;
        this.d = adlyVar;
        if (!this.e.isPresent() || ((ViewGroup) this.e.get()).getParent().getParent() != view) {
            f();
            Optional optionalOfNullable = Optional.ofNullable((ViewGroup) tuk.e(view, R.id.element_companion_card_stub, R.id.element_companion_card));
            this.e = optionalOfNullable;
            saa saaVar = new saa(this, 10);
            if (true == optionalOfNullable.isPresent()) {
                ((ViewGroup) optionalOfNullable.get()).addView(((sqr) saaVar.a).a.a());
            }
        }
        c();
        if (this.b.isPresent() && (adlyVar3 = this.d) != null) {
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            amco amcoVar = (amco) this.b.get();
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amddVar.q = amcoVar;
            amddVar.c |= SemanticState.ReadOnly;
            adlyVar3.d = (amdd) aihfVarCreateBuilder.build();
        }
        if (!this.f.isPresent() || (adlyVar2 = this.d) == null) {
            return;
        }
        this.a.h(adlyVar2, (acxm) this.f.get(), false, false);
    }

    public final void b() {
        this.g = true;
        c();
    }

    public final void c() {
        adly adlyVar;
        if (this.e.isPresent()) {
            ((ViewGroup) this.e.get()).setVisibility(true != this.g ? 8 : 0);
            if (this.g && this.f.isPresent() && (adlyVar = this.d) != null) {
                this.a.h(adlyVar, (acxm) this.f.get(), false, false);
            }
            this.a.a().setVisibility(true == this.g ? 0 : 8);
        }
    }

    public final boolean d(akrn akrnVar) {
        adly adlyVar;
        if (akrnVar == null) {
            return false;
        }
        if (this.b.isPresent() && (adlyVar = this.d) != null) {
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            amco amcoVar = (amco) this.b.get();
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amddVar.q = amcoVar;
            amddVar.c |= SemanticState.ReadOnly;
            adlyVar.d = (amdd) aihfVarCreateBuilder.build();
        }
        Optional optionalOf = Optional.of(((acyx) this.c.io()).c(akrnVar));
        this.f = optionalOf;
        adly adlyVar2 = this.d;
        if (adlyVar2 != null) {
            this.a.h(adlyVar2, (acxm) optionalOf.get(), false, false);
            this.d.b.d(new xgj(akrnVar.d, (amud) null));
        }
        return true;
    }

    public final void e() {
        f();
        this.b = Optional.empty();
        this.f = Optional.empty();
        this.g = false;
    }
}
