/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.analysis.datamining.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import orgomg.cwm.analysis.datamining.util.DataminingAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataminingItemProviderAdapterFactory extends DataminingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataminingItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationInputSpecificationItemProvider applicationInputSpecificationItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.ApplicationInputSpecification}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createApplicationInputSpecificationAdapter() {
        if (applicationInputSpecificationItemProvider == null) {
            applicationInputSpecificationItemProvider = new ApplicationInputSpecificationItemProvider(this);
        }

        return applicationInputSpecificationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeUsageRelationItemProvider attributeUsageRelationItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.AttributeUsageRelation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeUsageRelationAdapter() {
        if (attributeUsageRelationItemProvider == null) {
            attributeUsageRelationItemProvider = new AttributeUsageRelationItemProvider(this);
        }

        return attributeUsageRelationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.Category} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CategoryItemProvider categoryItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.Category}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCategoryAdapter() {
        if (categoryItemProvider == null) {
            categoryItemProvider = new CategoryItemProvider(this);
        }

        return categoryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.CategoryHierarchy} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CategoryHierarchyItemProvider categoryHierarchyItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.CategoryHierarchy}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCategoryHierarchyAdapter() {
        if (categoryHierarchyItemProvider == null) {
            categoryHierarchyItemProvider = new CategoryHierarchyItemProvider(this);
        }

        return categoryHierarchyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.CostMatrix} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CostMatrixItemProvider costMatrixItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.CostMatrix}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCostMatrixAdapter() {
        if (costMatrixItemProvider == null) {
            costMatrixItemProvider = new CostMatrixItemProvider(this);
        }

        return costMatrixItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.MiningAttribute} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiningAttributeItemProvider miningAttributeItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.MiningAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMiningAttributeAdapter() {
        if (miningAttributeItemProvider == null) {
            miningAttributeItemProvider = new MiningAttributeItemProvider(this);
        }

        return miningAttributeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.MiningDataSpecification} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiningDataSpecificationItemProvider miningDataSpecificationItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.MiningDataSpecification}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMiningDataSpecificationAdapter() {
        if (miningDataSpecificationItemProvider == null) {
            miningDataSpecificationItemProvider = new MiningDataSpecificationItemProvider(this);
        }

        return miningDataSpecificationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.MiningModel} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiningModelItemProvider miningModelItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.MiningModel}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMiningModelAdapter() {
        if (miningModelItemProvider == null) {
            miningModelItemProvider = new MiningModelItemProvider(this);
        }

        return miningModelItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.MiningModelResult} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiningModelResultItemProvider miningModelResultItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.MiningModelResult}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMiningModelResultAdapter() {
        if (miningModelResultItemProvider == null) {
            miningModelResultItemProvider = new MiningModelResultItemProvider(this);
        }

        return miningModelResultItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.NumericAttribute} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumericAttributeItemProvider numericAttributeItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.NumericAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createNumericAttributeAdapter() {
        if (numericAttributeItemProvider == null) {
            numericAttributeItemProvider = new NumericAttributeItemProvider(this);
        }

        return numericAttributeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.SupervisedMiningModel} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SupervisedMiningModelItemProvider supervisedMiningModelItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.SupervisedMiningModel}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSupervisedMiningModelAdapter() {
        if (supervisedMiningModelItemProvider == null) {
            supervisedMiningModelItemProvider = new SupervisedMiningModelItemProvider(this);
        }

        return supervisedMiningModelItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.CategoricalAttribute} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CategoricalAttributeItemProvider categoricalAttributeItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.CategoricalAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCategoricalAttributeAdapter() {
        if (categoricalAttributeItemProvider == null) {
            categoricalAttributeItemProvider = new CategoricalAttributeItemProvider(this);
        }

        return categoricalAttributeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.OrdinalAttribute} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OrdinalAttributeItemProvider ordinalAttributeItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.OrdinalAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOrdinalAttributeAdapter() {
        if (ordinalAttributeItemProvider == null) {
            ordinalAttributeItemProvider = new OrdinalAttributeItemProvider(this);
        }

        return ordinalAttributeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.MiningSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MiningSettingsItemProvider miningSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.MiningSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMiningSettingsAdapter() {
        if (miningSettingsItemProvider == null) {
            miningSettingsItemProvider = new MiningSettingsItemProvider(this);
        }

        return miningSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.ClusteringSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClusteringSettingsItemProvider clusteringSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.ClusteringSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createClusteringSettingsAdapter() {
        if (clusteringSettingsItemProvider == null) {
            clusteringSettingsItemProvider = new ClusteringSettingsItemProvider(this);
        }

        return clusteringSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.StatisticsSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatisticsSettingsItemProvider statisticsSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.StatisticsSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStatisticsSettingsAdapter() {
        if (statisticsSettingsItemProvider == null) {
            statisticsSettingsItemProvider = new StatisticsSettingsItemProvider(this);
        }

        return statisticsSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SupervisedMiningSettingsItemProvider supervisedMiningSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.SupervisedMiningSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSupervisedMiningSettingsAdapter() {
        if (supervisedMiningSettingsItemProvider == null) {
            supervisedMiningSettingsItemProvider = new SupervisedMiningSettingsItemProvider(this);
        }

        return supervisedMiningSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.ClassificationSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassificationSettingsItemProvider classificationSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.ClassificationSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createClassificationSettingsAdapter() {
        if (classificationSettingsItemProvider == null) {
            classificationSettingsItemProvider = new ClassificationSettingsItemProvider(this);
        }

        return classificationSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.RegressionSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegressionSettingsItemProvider regressionSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.RegressionSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRegressionSettingsAdapter() {
        if (regressionSettingsItemProvider == null) {
            regressionSettingsItemProvider = new RegressionSettingsItemProvider(this);
        }

        return regressionSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.AssociationRulesSettings} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssociationRulesSettingsItemProvider associationRulesSettingsItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.AssociationRulesSettings}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAssociationRulesSettingsAdapter() {
        if (associationRulesSettingsItemProvider == null) {
            associationRulesSettingsItemProvider = new AssociationRulesSettingsItemProvider(this);
        }

        return associationRulesSettingsItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.datamining.ApplicationAttribute} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationAttributeItemProvider applicationAttributeItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.datamining.ApplicationAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createApplicationAttributeAdapter() {
        if (applicationAttributeItemProvider == null) {
            applicationAttributeItemProvider = new ApplicationAttributeItemProvider(this);
        }

        return applicationAttributeItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (applicationInputSpecificationItemProvider != null) applicationInputSpecificationItemProvider.dispose();
        if (attributeUsageRelationItemProvider != null) attributeUsageRelationItemProvider.dispose();
        if (categoryItemProvider != null) categoryItemProvider.dispose();
        if (categoryHierarchyItemProvider != null) categoryHierarchyItemProvider.dispose();
        if (costMatrixItemProvider != null) costMatrixItemProvider.dispose();
        if (miningAttributeItemProvider != null) miningAttributeItemProvider.dispose();
        if (miningDataSpecificationItemProvider != null) miningDataSpecificationItemProvider.dispose();
        if (miningModelItemProvider != null) miningModelItemProvider.dispose();
        if (miningModelResultItemProvider != null) miningModelResultItemProvider.dispose();
        if (numericAttributeItemProvider != null) numericAttributeItemProvider.dispose();
        if (supervisedMiningModelItemProvider != null) supervisedMiningModelItemProvider.dispose();
        if (categoricalAttributeItemProvider != null) categoricalAttributeItemProvider.dispose();
        if (ordinalAttributeItemProvider != null) ordinalAttributeItemProvider.dispose();
        if (miningSettingsItemProvider != null) miningSettingsItemProvider.dispose();
        if (clusteringSettingsItemProvider != null) clusteringSettingsItemProvider.dispose();
        if (statisticsSettingsItemProvider != null) statisticsSettingsItemProvider.dispose();
        if (supervisedMiningSettingsItemProvider != null) supervisedMiningSettingsItemProvider.dispose();
        if (classificationSettingsItemProvider != null) classificationSettingsItemProvider.dispose();
        if (regressionSettingsItemProvider != null) regressionSettingsItemProvider.dispose();
        if (associationRulesSettingsItemProvider != null) associationRulesSettingsItemProvider.dispose();
        if (applicationAttributeItemProvider != null) applicationAttributeItemProvider.dispose();
    }

}