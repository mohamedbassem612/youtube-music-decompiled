package app.rive.runtime.kotlin.renderers;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderContextEvent {
    public static final int $stable = 0;
    private final int eglErrorCode;
    private final String eglErrorName;
    private final String operation;
    private final RenderContextEventType type;

    public RenderContextEvent(RenderContextEventType renderContextEventType, int i, String str, String str2) {
        renderContextEventType.getClass();
        str.getClass();
        str2.getClass();
        this.type = renderContextEventType;
        this.eglErrorCode = i;
        this.eglErrorName = str;
        this.operation = str2;
    }

    public static /* synthetic */ RenderContextEvent copy$default(RenderContextEvent renderContextEvent, RenderContextEventType renderContextEventType, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            renderContextEventType = renderContextEvent.type;
        }
        if ((i2 & 2) != 0) {
            i = renderContextEvent.eglErrorCode;
        }
        if ((i2 & 4) != 0) {
            str = renderContextEvent.eglErrorName;
        }
        if ((i2 & 8) != 0) {
            str2 = renderContextEvent.operation;
        }
        return renderContextEvent.copy(renderContextEventType, i, str, str2);
    }

    public final RenderContextEventType component1() {
        return this.type;
    }

    public final int component2() {
        return this.eglErrorCode;
    }

    public final String component3() {
        return this.eglErrorName;
    }

    public final String component4() {
        return this.operation;
    }

    public final RenderContextEvent copy(RenderContextEventType renderContextEventType, int i, String str, String str2) {
        renderContextEventType.getClass();
        str.getClass();
        str2.getClass();
        return new RenderContextEvent(renderContextEventType, i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenderContextEvent) {
            RenderContextEvent renderContextEvent = (RenderContextEvent) obj;
            if (this.type == renderContextEvent.type && this.eglErrorCode == renderContextEvent.eglErrorCode && awrc.c(this.eglErrorName, renderContextEvent.eglErrorName) && awrc.c(this.operation, renderContextEvent.operation)) {
                return true;
            }
        }
        return false;
    }

    public final int getEglErrorCode() {
        return this.eglErrorCode;
    }

    public final String getEglErrorName() {
        return this.eglErrorName;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final RenderContextEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.eglErrorCode) * 31) + this.eglErrorName.hashCode()) * 31) + this.operation.hashCode();
    }

    public String toString() {
        return "RenderContextEvent(type=" + this.type + ", eglErrorCode=" + this.eglErrorCode + ", eglErrorName=" + this.eglErrorName + ", operation=" + this.operation + ')';
    }
}
