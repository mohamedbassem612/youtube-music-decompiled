package app.rive;

import app.rive.runtime.kotlin.core.ViewModel;
import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class PropertySubscriptionKey {
    private final String propertyPath;
    private final ViewModel.PropertyDataType propertyType;

    public PropertySubscriptionKey(String str, ViewModel.PropertyDataType propertyDataType) {
        str.getClass();
        propertyDataType.getClass();
        this.propertyPath = str;
        this.propertyType = propertyDataType;
    }

    public static /* synthetic */ PropertySubscriptionKey copy$default(PropertySubscriptionKey propertySubscriptionKey, String str, ViewModel.PropertyDataType propertyDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertySubscriptionKey.propertyPath;
        }
        if ((i & 2) != 0) {
            propertyDataType = propertySubscriptionKey.propertyType;
        }
        return propertySubscriptionKey.copy(str, propertyDataType);
    }

    public final String component1() {
        return this.propertyPath;
    }

    public final ViewModel.PropertyDataType component2() {
        return this.propertyType;
    }

    public final PropertySubscriptionKey copy(String str, ViewModel.PropertyDataType propertyDataType) {
        str.getClass();
        propertyDataType.getClass();
        return new PropertySubscriptionKey(str, propertyDataType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PropertySubscriptionKey) {
            PropertySubscriptionKey propertySubscriptionKey = (PropertySubscriptionKey) obj;
            if (awrc.c(this.propertyPath, propertySubscriptionKey.propertyPath) && this.propertyType == propertySubscriptionKey.propertyType) {
                return true;
            }
        }
        return false;
    }

    public final String getPropertyPath() {
        return this.propertyPath;
    }

    public final ViewModel.PropertyDataType getPropertyType() {
        return this.propertyType;
    }

    public int hashCode() {
        return (this.propertyPath.hashCode() * 31) + this.propertyType.hashCode();
    }

    public String toString() {
        return "PropertySubscriptionKey(propertyPath=" + this.propertyPath + ", propertyType=" + this.propertyType + ')';
    }
}
