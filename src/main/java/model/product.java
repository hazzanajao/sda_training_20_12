package model;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
    public class product {
        @Table(name = "product")
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column(name = "productID")
        private int productID;
        @Column(name = "shopID")
        private int shopID;
        @Column(name = "productName")
        private MysqlxDatatypes.Scalar.String productName;
        @Column(name = "productPrice")
        private int productPrice;

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public int getShopID() {
            return shopID;
        }

        public void setShopID(int shopID) {
            this.shopID = shopID;
        }

        public MysqlxDatatypes.Scalar.String getProductName() {
            return productName;
        }

        public void setProductName(MysqlxDatatypes.Scalar.String productName) {
            this.productName = productName;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(int productPrice) {
            this.productPrice = productPrice;
        }
    }
}
