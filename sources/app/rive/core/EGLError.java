package app.rive.core;

import defpackage.atqq;
import defpackage.awml;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class EGLError {
    public static final int $stable = 0;
    public static final EGLError INSTANCE = new EGLError();
    private static final Map EGL_ERROR_MAP = atqq.y(new awml(12288, "EGL_SUCCESS"), new awml(12289, "EGL_NOT_INITIALIZED"), new awml(12290, "EGL_BAD_ACCESS"), new awml(12291, "EGL_BAD_ALLOC"), new awml(12292, "EGL_BAD_ATTRIBUTE"), new awml(12294, "EGL_BAD_CONTEXT"), new awml(12293, "EGL_BAD_CONFIG"), new awml(12295, "EGL_BAD_CURRENT_SURFACE"), new awml(12296, "EGL_BAD_DISPLAY"), new awml(12301, "EGL_BAD_SURFACE"), new awml(12297, "EGL_BAD_MATCH"), new awml(12300, "EGL_BAD_PARAMETER"), new awml(12298, "EGL_BAD_NATIVE_PIXMAP"), new awml(12299, "EGL_BAD_NATIVE_WINDOW"), new awml(12302, "EGL_CONTEXT_LOST"));

    private EGLError() {
    }

    public final String errorString(int i) {
        String str = (String) EGL_ERROR_MAP.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(i, 16);
        string.getClass();
        return "Unknown EGL error 0x".concat(string);
    }

    public final Map getEGL_ERROR_MAP() {
        return EGL_ERROR_MAP;
    }
}
