package defpackage;

import com.google.cardboard.sdk.R;
import internal.org.jni_zero.CommonApis;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class odf extends odl {
    private final Map a;

    public odf(fxg fxgVar, ocu ocuVar, Map map, omj omjVar) {
        super("TZjLQwLRvN2aVaWU9XKfnHCeOMydE5bY1Uxxti4G3kE6QAFtp+A3UajK+DfHRFsI", "f+Yz8FbU7vWhbjj74zwgzdyu9EAZaaUwGeKucaRT7qc=", fxgVar, ocuVar, omjVar.h(R.styleable.AppCompatTheme_windowMinWidthMinor));
        this.a = map;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) throws IllegalAccessException, InvocationTargetException {
        List list = (List) this.a.get("vst");
        if (list != null) {
            Object objInvoke = method.invoke("", list);
            objInvoke.getClass();
            Long l = (Long) objInvoke;
            synchronized (fxgVar) {
                int iH = CommonApis.h(l.intValue());
                if (iH == 0) {
                    throw null;
                }
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxlVar.al = iH - 1;
                fxlVar.d |= 16777216;
            }
        }
    }
}
