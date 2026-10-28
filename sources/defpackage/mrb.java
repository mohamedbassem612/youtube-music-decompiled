package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mrb {
    static final asnh a;
    public final Context b;
    public final DisplayMetrics c;

    static {
        aihf aihfVarCreateBuilder = asnh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asnh asnhVar = (asnh) aihfVarCreateBuilder.instance;
        asnhVar.b |= 1;
        asnhVar.c = false;
        a = (asnh) aihfVarCreateBuilder.build();
    }

    public mrb(Context context) {
        this.b = context;
        this.c = context.getResources().getDisplayMetrics();
    }

    public final asnh a(dwr dwrVar, View view) {
        int i;
        int i2;
        Optional optionalOf;
        int width;
        int width2;
        if (dwrVar == null) {
            return a;
        }
        aihf aihfVarCreateBuilder = asnh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asnh asnhVar = (asnh) aihfVarCreateBuilder.instance;
        asnhVar.b |= 1;
        asnhVar.c = true;
        dwp dwpVar = dwrVar.a;
        int i3 = 3;
        if (dwpVar == dwp.a) {
            i = 2;
        } else {
            i = dwpVar == dwp.b ? 3 : 1;
        }
        aihfVarCreateBuilder.copyOnWrite();
        asnh asnhVar2 = (asnh) aihfVarCreateBuilder.instance;
        asnhVar2.d = i - 1;
        asnhVar2.b |= 2;
        if (!dwrVar.c()) {
            i2 = 2;
        } else if (dwrVar.b() == dwo.a) {
            i2 = 3;
        } else {
            i2 = dwrVar.b() == dwo.b ? 4 : 1;
        }
        aihfVarCreateBuilder.copyOnWrite();
        asnh asnhVar3 = (asnh) aihfVarCreateBuilder.instance;
        asnhVar3.e = i2 - 1;
        asnhVar3.b |= 4;
        Rect rectA = dwrVar.a();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        Rect rect = new Rect(i4, i5, view.getWidth() + i4, view.getHeight() + i5);
        Rect rect2 = new Rect(rectA);
        if (rect2.intersect(rect)) {
            rect2.offset(-i4, -i5);
            optionalOf = Optional.of(rect2);
        } else {
            optionalOf = Optional.empty();
        }
        hqb hqbVar = new hqb(this, view, i3, null);
        if (true == optionalOf.isPresent()) {
            Object obj = optionalOf.get();
            Object obj2 = hqbVar.b;
            Object obj3 = hqbVar.a;
            mrb mrbVar = (mrb) obj2;
            if (qnl.bs(mrbVar.b.getResources())) {
                width = ((View) obj3).getWidth() - ((Rect) obj).right;
                width2 = ((View) obj3).getWidth() - ((Rect) obj).left;
            } else {
                width = ((Rect) obj).left;
                width2 = ((Rect) obj).right;
            }
            aihf aihfVarCreateBuilder2 = asmk.a.createBuilder();
            asml asmlVar = asml.a;
            aihf aihfVarCreateBuilder3 = asmlVar.createBuilder();
            DisplayMetrics displayMetrics = mrbVar.c;
            Rect rect3 = (Rect) obj;
            float fA = mrl.a(displayMetrics, rect3.top);
            aihfVarCreateBuilder3.copyOnWrite();
            asml asmlVar2 = (asml) aihfVarCreateBuilder3.instance;
            asmlVar2.b |= 1;
            asmlVar2.c = fA;
            asml asmlVar3 = (asml) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            asmk asmkVar = (asmk) aihfVarCreateBuilder2.instance;
            asmlVar3.getClass();
            asmkVar.c = asmlVar3;
            asmkVar.b |= 1;
            aihf aihfVarCreateBuilder4 = asmlVar.createBuilder();
            float fA2 = mrl.a(displayMetrics, width);
            aihfVarCreateBuilder4.copyOnWrite();
            asml asmlVar4 = (asml) aihfVarCreateBuilder4.instance;
            asmlVar4.b |= 1;
            asmlVar4.c = fA2;
            asml asmlVar5 = (asml) aihfVarCreateBuilder4.build();
            aihfVarCreateBuilder2.copyOnWrite();
            asmk asmkVar2 = (asmk) aihfVarCreateBuilder2.instance;
            asmlVar5.getClass();
            asmkVar2.g = asmlVar5;
            asmkVar2.b |= 16;
            aihf aihfVarCreateBuilder5 = asmlVar.createBuilder();
            float fA3 = mrl.a(displayMetrics, rect3.bottom);
            aihfVarCreateBuilder5.copyOnWrite();
            asml asmlVar6 = (asml) aihfVarCreateBuilder5.instance;
            asmlVar6.b |= 1;
            asmlVar6.c = fA3;
            asml asmlVar7 = (asml) aihfVarCreateBuilder5.build();
            aihfVarCreateBuilder2.copyOnWrite();
            asmk asmkVar3 = (asmk) aihfVarCreateBuilder2.instance;
            asmlVar7.getClass();
            asmkVar3.e = asmlVar7;
            asmkVar3.b |= 4;
            aihf aihfVarCreateBuilder6 = asmlVar.createBuilder();
            float fA4 = mrl.a(displayMetrics, width2);
            aihfVarCreateBuilder6.copyOnWrite();
            asml asmlVar8 = (asml) aihfVarCreateBuilder6.instance;
            asmlVar8.b |= 1;
            asmlVar8.c = fA4;
            asml asmlVar9 = (asml) aihfVarCreateBuilder6.build();
            aihfVarCreateBuilder2.copyOnWrite();
            asmk asmkVar4 = (asmk) aihfVarCreateBuilder2.instance;
            asmlVar9.getClass();
            asmkVar4.h = asmlVar9;
            asmkVar4.b |= 32;
            optionalOf = Optional.ofNullable((asmk) aihfVarCreateBuilder2.build());
        }
        if (optionalOf.isPresent()) {
            asmk asmkVar5 = (asmk) optionalOf.get();
            aihfVarCreateBuilder.copyOnWrite();
            asnh asnhVar4 = (asnh) aihfVarCreateBuilder.instance;
            asnhVar4.f = asmkVar5;
            asnhVar4.b |= 8;
        }
        return (asnh) aihfVarCreateBuilder.build();
    }
}
