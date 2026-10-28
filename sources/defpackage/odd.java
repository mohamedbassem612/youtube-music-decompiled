package defpackage;

import android.content.Context;
import android.view.InputEvent;
import com.google.cardboard.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odd extends odl {
    private final Map a;
    private final Context b;

    public odd(fxg fxgVar, ocu ocuVar, Map map, Context context, omj omjVar) {
        super("9nxKYhfU1IUmJ/43w8MihgicGHz41muMj6vlRggbFuLCKymCNRNP1dzWZTkfNBjs", "IzI5chKXSpLzLuC8CcgdimjiUYx/nMJE2s5sVtD4D1s=", fxgVar, ocuVar, omjVar.h(R.styleable.AppCompatTheme_windowNoTitle));
        this.a = map;
        this.b = context;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = method.invoke("", (InputEvent) this.a.get("evt"), this.b);
        objInvoke.getClass();
        Object[] objArr = (Object[]) objInvoke;
        aihf aihfVarCreateBuilder = fxh.a.createBuilder();
        long jLongValue = ((Long) objArr[0]).longValue();
        aihfVarCreateBuilder.copyOnWrite();
        fxh fxhVar = (fxh) aihfVarCreateBuilder.instance;
        fxhVar.b |= 1;
        fxhVar.c = jLongValue;
        int iAX = kro.aX(((Long) objArr[1]).intValue());
        if (iAX == 0) {
            throw null;
        }
        aihfVarCreateBuilder.copyOnWrite();
        fxh fxhVar2 = (fxh) aihfVarCreateBuilder.instance;
        fxhVar2.d = iAX - 1;
        fxhVar2.b |= 2;
        int iAX2 = kro.aX(((Long) objArr[2]).intValue());
        if (iAX2 == 0) {
            throw null;
        }
        aihfVarCreateBuilder.copyOnWrite();
        fxh fxhVar3 = (fxh) aihfVarCreateBuilder.instance;
        fxhVar3.e = iAX2 - 1;
        fxhVar3.b |= 4;
        synchronized (fxgVar) {
            fxh fxhVar4 = (fxh) aihfVarCreateBuilder.build();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxhVar4.getClass();
            fxlVar.aj = fxhVar4;
            fxlVar.d |= 1048576;
        }
    }
}
