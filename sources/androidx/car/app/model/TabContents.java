package androidx.car.app.model;

import defpackage.acu;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final acz mTemplate;

    TabContents(acu acuVar) {
        Object obj = acuVar.a;
        this.mTemplate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public acz getTemplate() {
        acz aczVar = this.mTemplate;
        aczVar.getClass();
        return aczVar;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + ']';
    }

    private TabContents() {
        this.mTemplate = null;
    }
}
