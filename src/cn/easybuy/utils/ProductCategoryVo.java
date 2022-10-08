package cn.easybuy.utils;

import cn.easybuy.entity.Product;
import cn.easybuy.entity.ProductCategory;

import java.io.Serializable;
import java.util.List;

/**
 * 商品类别工具类
 */
public class ProductCategoryVo implements Serializable {

    //类别对象
    private ProductCategory productCategory;
    //下一级分类的列别对象
    private List<ProductCategoryVo> productCategoryVoList;
    //当前分类下的商品对象
    private List<Product> productList;

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<ProductCategoryVo> getProductCategoryVoList() {
        return productCategoryVoList;
    }

    public void setProductCategoryVoList(List<ProductCategoryVo> productCategoryVoList) {
        this.productCategoryVoList = productCategoryVoList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
