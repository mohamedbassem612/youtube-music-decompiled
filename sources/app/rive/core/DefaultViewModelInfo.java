package app.rive.core;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultViewModelInfo {
    public static final int $stable = 0;
    private final String instanceName;
    private final String viewModelName;

    public DefaultViewModelInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.viewModelName = str;
        this.instanceName = str2;
    }

    public static /* synthetic */ DefaultViewModelInfo copy$default(DefaultViewModelInfo defaultViewModelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultViewModelInfo.viewModelName;
        }
        if ((i & 2) != 0) {
            str2 = defaultViewModelInfo.instanceName;
        }
        return defaultViewModelInfo.copy(str, str2);
    }

    public final String component1() {
        return this.viewModelName;
    }

    public final String component2() {
        return this.instanceName;
    }

    public final DefaultViewModelInfo copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new DefaultViewModelInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultViewModelInfo) {
            DefaultViewModelInfo defaultViewModelInfo = (DefaultViewModelInfo) obj;
            if (awrc.c(this.viewModelName, defaultViewModelInfo.viewModelName) && awrc.c(this.instanceName, defaultViewModelInfo.instanceName)) {
                return true;
            }
        }
        return false;
    }

    public final String getInstanceName() {
        return this.instanceName;
    }

    public final String getViewModelName() {
        return this.viewModelName;
    }

    public int hashCode() {
        return (this.viewModelName.hashCode() * 31) + this.instanceName.hashCode();
    }

    public String toString() {
        return "DefaultViewModelInfo(viewModelName=" + this.viewModelName + ", instanceName=" + this.instanceName + ')';
    }
}
