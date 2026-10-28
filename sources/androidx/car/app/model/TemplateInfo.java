package androidx.car.app.model;

import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class TemplateInfo {
    private final Class mTemplateClass;
    private final String mTemplateId;

    private TemplateInfo() {
        this.mTemplateClass = null;
        this.mTemplateId = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TemplateInfo) {
            TemplateInfo templateInfo = (TemplateInfo) obj;
            if (Objects.equals(this.mTemplateClass, templateInfo.mTemplateClass) && Objects.equals(this.mTemplateId, templateInfo.mTemplateId)) {
                return true;
            }
        }
        return false;
    }

    public Class getTemplateClass() {
        Class cls = this.mTemplateClass;
        cls.getClass();
        return cls;
    }

    public String getTemplateId() {
        String str = this.mTemplateId;
        str.getClass();
        return str;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplateClass, this.mTemplateId);
    }

    public TemplateInfo(Class cls, String str) {
        this.mTemplateClass = cls;
        this.mTemplateId = str;
    }
}
