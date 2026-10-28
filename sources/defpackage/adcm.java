package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.SeekBar;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adcm extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public String a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Optional b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public aunn c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Integer d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Boolean g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nuc q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Integer r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int v;

    public adcm() {
        super("Slider");
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new adco(context);
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        adco adcoVar = (adco) obj;
        Integer num = this.r;
        Integer num2 = this.d;
        Boolean bool = this.g;
        CommandOuterClass$Command commandOuterClass$Command = this.s;
        CommandOuterClass$Command commandOuterClass$Command2 = this.t;
        CommandOuterClass$Command commandOuterClass$Command3 = this.u;
        String str = this.a;
        aunn aunnVar = this.c;
        nuc nucVar = this.q;
        Optional optional = this.b;
        int i = this.v;
        boolean z = this.e;
        boolean z2 = this.f;
        int iIntValue = num.intValue();
        SeekBar seekBar = adcoVar.a;
        seekBar.setMax(iIntValue);
        seekBar.setProgress(num2.intValue());
        adcoVar.b = aunnVar;
        adcoVar.c = commandOuterClass$Command;
        adcoVar.d = commandOuterClass$Command2;
        adcoVar.e = commandOuterClass$Command3;
        seekBar.setEnabled(bool.booleanValue());
        adcoVar.f = nucVar;
        if (optional.isPresent()) {
            seekBar.setProgressTintList(ColorStateList.valueOf(((Integer) optional.get()).intValue()));
            seekBar.setThumbTintList(ColorStateList.valueOf(((Integer) optional.get()).intValue()));
        }
        if (i == 3 && seekBar.getTickMark() != null) {
            seekBar.getTickMark().setAlpha(0);
        }
        seekBar.setHapticFeedbackEnabled(z2);
        if (str != null && !str.isEmpty()) {
            seekBar.setContentDescription(str);
        }
        adcoVar.g = z;
        adcoVar.setVisibility(0);
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        adcm adcmVar = (adcm) fgyVar;
        adcm adcmVar2 = (adcm) fgyVar2;
        fif fifVar = new fif(adcmVar == null ? null : adcmVar.r, adcmVar2 == null ? null : adcmVar2.r);
        fif fifVar2 = new fif(adcmVar == null ? null : adcmVar.d, adcmVar2 == null ? null : adcmVar2.d);
        fif fifVar3 = new fif(adcmVar == null ? null : adcmVar.g, adcmVar2 != null ? adcmVar2.g : null);
        return (Objects.equals(fifVar.a, fifVar.b) && Objects.equals(fifVar2.a, fifVar2.b) && Objects.equals(fifVar3.a, fifVar3.b)) ? false : true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        int size;
        if (View.MeasureSpec.getMode(i) == 0) {
            size = (int) ((fhdVar.c().getDisplayMetrics().density * 40.0f) + 0.5f);
            fkwVar.a = size;
        } else {
            size = View.MeasureSpec.getSize(i);
            fkwVar.a = size;
        }
        fkwVar.b = (int) (((double) size) * 0.1d);
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        Boolean bool;
        nuc nucVar;
        Integer num;
        CommandOuterClass$Command commandOuterClass$Command;
        CommandOuterClass$Command commandOuterClass$Command2;
        CommandOuterClass$Command commandOuterClass$Command3;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            adcm adcmVar = (adcm) fgyVar;
            String str = this.a;
            if (str == null ? adcmVar.a == null : str.equals(adcmVar.a)) {
                Optional optional = this.b;
                if (optional == null ? adcmVar.b == null : optional.equals(adcmVar.b)) {
                    aunn aunnVar = this.c;
                    if (aunnVar == null ? adcmVar.c == null : aunnVar.equals(adcmVar.c)) {
                        Integer num2 = this.d;
                        if (num2 == null ? adcmVar.d == null : num2.equals(adcmVar.d)) {
                            if (this.e == adcmVar.e && this.f == adcmVar.f && ((bool = this.g) == null ? adcmVar.g == null : bool.equals(adcmVar.g)) && ((nucVar = this.q) == null ? adcmVar.q == null : nucVar.equals(adcmVar.q)) && ((num = this.r) == null ? adcmVar.r == null : num.equals(adcmVar.r)) && ((commandOuterClass$Command = this.s) == null ? adcmVar.s == null : commandOuterClass$Command.equals(adcmVar.s)) && ((commandOuterClass$Command2 = this.t) == null ? adcmVar.t == null : commandOuterClass$Command2.equals(adcmVar.t)) && ((commandOuterClass$Command3 = this.u) == null ? adcmVar.u == null : commandOuterClass$Command3.equals(adcmVar.u))) {
                                int i = this.v;
                                if (i != 0) {
                                    if (i == adcmVar.v) {
                                        return true;
                                    }
                                } else if (adcmVar.v == 0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }
}
