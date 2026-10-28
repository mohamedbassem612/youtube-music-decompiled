package defpackage;

import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.multiplatform.elements.runtime.ReaperThreadJniWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ost {
    public final aga a;
    public final aga b;
    public final ComponentConfig c;
    public final ComponentSharedResources d;
    public final ReaperThreadJniWrapper e;
    public final opq f;
    public final adgf g;
    public final mew h;

    public ost(mew mewVar, aga agaVar, aga agaVar2, ComponentConfig componentConfig, ComponentSharedResources componentSharedResources, opq opqVar, adgf adgfVar, ReaperThreadJniWrapper reaperThreadJniWrapper) {
        this.h = mewVar;
        this.a = agaVar;
        this.b = agaVar2;
        this.c = componentConfig;
        this.d = componentSharedResources;
        this.f = opqVar;
        this.g = adgfVar;
        this.e = reaperThreadJniWrapper;
    }

    public final boolean equals(Object obj) {
        adgf adgfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ost) {
            ost ostVar = (ost) obj;
            mew mewVar = this.h;
            if (mewVar != null ? mewVar.equals(ostVar.h) : ostVar.h == null) {
                aga agaVar = this.a;
                if (agaVar != null ? agaVar.equals(ostVar.a) : ostVar.a == null) {
                    aga agaVar2 = this.b;
                    if (agaVar2 != null ? agaVar2.equals(ostVar.b) : ostVar.b == null) {
                        ComponentConfig componentConfig = this.c;
                        if (componentConfig != null ? componentConfig.equals(ostVar.c) : ostVar.c == null) {
                            ComponentSharedResources componentSharedResources = this.d;
                            if (componentSharedResources != null ? componentSharedResources.equals(ostVar.d) : ostVar.d == null) {
                                if (this.f.equals(ostVar.f) && ((adgfVar = this.g) != null ? adgfVar.equals(ostVar.g) : ostVar.g == null)) {
                                    ReaperThreadJniWrapper reaperThreadJniWrapper = this.e;
                                    if (reaperThreadJniWrapper == null) {
                                        if (ostVar.e == null) {
                                            return true;
                                        }
                                    } else if (reaperThreadJniWrapper.equals(ostVar.e)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        mew mewVar = this.h;
        int iHashCode = mewVar == null ? 0 : mewVar.hashCode();
        aga agaVar = this.a;
        int iHashCode2 = agaVar == null ? 0 : agaVar.hashCode();
        int i = iHashCode ^ 1000003;
        aga agaVar2 = this.b;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (agaVar2 == null ? 0 : agaVar2.hashCode())) * 1000003;
        ComponentConfig componentConfig = this.c;
        int iHashCode4 = (iHashCode3 ^ (componentConfig == null ? 0 : componentConfig.hashCode())) * 1000003;
        ComponentSharedResources componentSharedResources = this.d;
        int iHashCode5 = (((iHashCode4 ^ (componentSharedResources == null ? 0 : componentSharedResources.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        adgf adgfVar = this.g;
        int iHashCode6 = (iHashCode5 ^ (adgfVar == null ? 0 : adgfVar.hashCode())) * 1000003;
        ReaperThreadJniWrapper reaperThreadJniWrapper = this.e;
        return iHashCode6 ^ (reaperThreadJniWrapper != null ? reaperThreadJniWrapper.hashCode() : 0);
    }

    public final String toString() {
        ReaperThreadJniWrapper reaperThreadJniWrapper = this.e;
        adgf adgfVar = this.g;
        opq opqVar = this.f;
        ComponentSharedResources componentSharedResources = this.d;
        ComponentConfig componentConfig = this.c;
        aga agaVar = this.b;
        aga agaVar2 = this.a;
        return "RenderNextPrewarmerSingletonArgs{renderConfig=" + String.valueOf(this.h) + ", singletonTypeExtensionHandlers=" + String.valueOf(agaVar2) + ", propertiesExtensionHandlers=" + String.valueOf(agaVar) + ", componentConfig=" + String.valueOf(componentConfig) + ", componentSharedResources=" + String.valueOf(componentSharedResources) + ", accessibilityManager=" + String.valueOf(opqVar) + ", onRuntimeCreatedCallback=" + String.valueOf(adgfVar) + ", reaperThreadJniWrapper=" + String.valueOf(reaperThreadJniWrapper) + '}';
    }

    public ost() {
        throw null;
    }
}
