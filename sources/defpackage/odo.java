package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.cardboard.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odo extends odl {
    private final DisplayMetrics a;
    private final View b;

    public odo(fxg fxgVar, ocu ocuVar, DisplayMetrics displayMetrics, View view, omj omjVar) {
        super("Rw63/FLQT3OSI1GlrzmEKu37lW2JG7GKqNmVk7qYCJQp0II17NouJVvKKl1eVNG5", "Nd77uDwkYtE8aAuPFS45O2ZaLWm4qtHrfizobYbKkPM=", fxgVar, ocuVar, omjVar.h(R.styleable.AppCompatTheme_windowMinWidthMajor));
        this.a = displayMetrics;
        this.b = view;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.b;
        if (view != null) {
            Object objInvoke = method.invoke("", this.a, view);
            objInvoke.getClass();
            Long[] lArr = (Long[]) objInvoke;
            aihf aihfVarCreateBuilder = fxk.a.createBuilder();
            long jLongValue = lArr[2].longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar = (fxk) aihfVarCreateBuilder.instance;
            fxkVar.b |= 4;
            fxkVar.d = jLongValue;
            long jLongValue2 = lArr[1].longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar2 = (fxk) aihfVarCreateBuilder.instance;
            fxkVar2.b |= 8;
            fxkVar2.e = jLongValue2;
            long jLongValue3 = lArr[0].longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar3 = (fxk) aihfVarCreateBuilder.instance;
            fxkVar3.b |= 16;
            fxkVar3.f = jLongValue3;
            long jLongValue4 = lArr[3].longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar4 = (fxk) aihfVarCreateBuilder.instance;
            fxkVar4.b |= 1;
            fxkVar4.c = jLongValue4;
            long jLongValue5 = lArr[4].longValue();
            aihfVarCreateBuilder.copyOnWrite();
            fxk fxkVar5 = (fxk) aihfVarCreateBuilder.instance;
            fxkVar5.b |= 32;
            fxkVar5.g = jLongValue5;
            synchronized (fxgVar) {
                fxk fxkVar6 = (fxk) aihfVarCreateBuilder.build();
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxkVar6.getClass();
                fxlVar.S = fxkVar6;
                fxlVar.c |= 524288;
            }
        }
    }
}
